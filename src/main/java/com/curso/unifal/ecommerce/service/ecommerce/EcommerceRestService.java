package com.curso.unifal.ecommerce.service.ecommerce;

import com.curso.unifal.ecommerce.domain.user.User;
import org.springframework.stereotype.Service;

/**
 * A notação @Component é um bean que a coloca no contexto do aplicativo,
 * permitindo que você injete essa classe em outras classes que precisem dela.
 * Isso facilita a criação de componentes reutilizáveis e promove a modularização do código.
 */

/**
 * Por finalidade semântica, utilizaremos o bean @Service, que indica um esteriótipo do tipo service
 */
@Service
public class EcommerceRestService {

    public User getUserByRole(String role){
        return new User();
    }

    public void createUser(User user){
    }

    public String deleteUser(String username){
        if(username == null || username.isEmpty()){
            return "ALL USERS HAVE BEEN DELETED!";
        }
        return "USER " + username + " DELETED!";
    }

    public User updateUser(User updateUser){
        User userAlreadyCreated = new User();
        userAlreadyCreated.setRole("CAIXA");
        userAlreadyCreated.setPassword(" ");
        userAlreadyCreated.setUser("JONAS");

        if(updateUser.getRole() != null && !updateUser.getRole().isEmpty()){
            userAlreadyCreated.setRole(updateUser.getRole());
        }
        if(updateUser.getPassword() != null && !updateUser.getPassword().isEmpty()){
            userAlreadyCreated.setPassword(updateUser.getPassword());
        }
        if(updateUser.getUser() != null && !updateUser.getUser().isEmpty()){
            userAlreadyCreated.setUser(updateUser.getUser());
        }

        return userAlreadyCreated;
    }

}
