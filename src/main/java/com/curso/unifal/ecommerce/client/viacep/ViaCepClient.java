package com.curso.unifal.ecommerce.client.viacep;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Para dizer pro Spring Boot que é um client
 */
@FeignClient(name = "via-cep-client", url = "https://viacep.com.br")
public interface ViaCepClient {

    @GetMapping(path = "/ws/{zipCode}/json/")
    Object getZipCodeInfoByZipCode(@PathVariable String zipCode);
}

