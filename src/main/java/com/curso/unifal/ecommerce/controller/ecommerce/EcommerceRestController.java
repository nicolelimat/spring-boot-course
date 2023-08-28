package com.curso.unifal.ecommerce.controller.ecommerce;

import com.curso.unifal.ecommerce.domain.user.User;
import com.curso.unifal.ecommerce.service.ecommerce.EcommerceRestService;
import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
/**
 * A notação @RequiredArgsConstructor, do lombok, vai pegar cada atributo da classe e definir automaticamente
 * um construtor para ela, tornando o @Autowired desnecessário.
 * Porém... esses atributos precisam ser "final", pois, quando o atributo por instanciado, ele não permitirá que
 * tenha nenhuma outra instância.
 */
@RequiredArgsConstructor
public class EcommerceRestController {

    /**
     * A notação @Autowired pega o código abaixo e automaticamente dá uma instância em tempo de execução.
     * (realizar a injeção de dependência automaticamente)
     */
//    @Autowired
    private final EcommerceRestService ecommerceRestService;

    /**
     * O método responde a solicitações HTTP GET na rota "/v1/ecommerce/users"
     * @param role:  espera um valor de consulta (query parameter) chamado "role".
     *            a notação @RequestParam indica que o parâmetro "user" é passado como parte da URL.
     * @return
     */
    @GetMapping(path = "/v1/ecommerce/user")
    public User getUser(@RequestParam String role){
        return ecommerceRestService.getUserByRole(role);
    }

    /**
     * O método espera um corpo de solicitação JSON que será traduzido para um objeto do tipo 'user'
     * @param user: A anotação @RequestBody instrui o Spring a desserializar automaticamente
     *            o JSON da solicitação no objeto User
     * @return
     */
    @PostMapping(path = "v1/ecommerce/user")
    public void createUser(@RequestBody User user){
        ecommerceRestService.createUser(user);
        System.out.println(user.getRole());
    }

    /**
     * O método DELETE é usado para solicitar a remoção de um recurso específico
     * @param user
     * @return
     */
    @DeleteMapping (path = "v1/ecommerce/user")
    public String deleteUser(@RequestParam(required = false) String username){
        return ecommerceRestService.deleteUser(username);
    }

    /**
     * O controlador recebe uma aquisição e manda o conteúdo dessa requisição pra um serviço
     * @param user
     * @return
     */
    @PutMapping(path = "v1/ecommerce/user")
    public User updateUser(@RequestBody User user){
        return ecommerceRestService.updateUser(user);
    }
}

