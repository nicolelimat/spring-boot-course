package com.curso.unifal.ecommerce.controller.ecommerce;

import com.curso.unifal.ecommerce.client.viacep.ViaCepClient;
import com.curso.unifal.ecommerce.domain.viacep.dto.ViaCepDTO;
import com.curso.unifal.ecommerce.service.ecommerce.EcommerceRestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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

    private final EcommerceRestService ecommerceRestService;

    private final ViaCepClient viaCepClient;
    @GetMapping(path = "/v1/zip-code")
    public ResponseEntity<ViaCepDTO> getZipCodeInfoByZipCode(@RequestParam String zipCode){
        return ResponseEntity.ok(viaCepClient.getZipCodeInfoByZipCode(zipCode));
    }
}

