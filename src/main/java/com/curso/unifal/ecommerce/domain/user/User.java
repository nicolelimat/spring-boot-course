package com.curso.unifal.ecommerce.domain.user;

import lombok.Data;

@Data // informando que pode ser mapeada para o JSON
public class User {
    private String user;
    private String password;
    private String role;
}
