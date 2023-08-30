package com.curso.unifal.ecommerce.domain.viacep.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * A @JsonInclude especifica como o pacote Jackson deve lidar com valores nulos ou vazios ao serializar um objeto
 * para JSON
 * JsonInclude.Include.NON_NULL: para a api não parar de funcionar caso o viacep mude algum atributo e
 * para poder ignorar algum atributo no processo de desserialização
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data // getters, setters, tostring e equalsandhashcode
@AllArgsConstructor
@NoArgsConstructor
@Builder // Design Pattern que constrói um objeto de maneira declarativa
    public class ViaCepDTO {

        private String cep;
        private String logradouro;
        private String complemento;
        private String bairro   ;
        private String localidade;
        private String uf;
        private String ddd;
    }
