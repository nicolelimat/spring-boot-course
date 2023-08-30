package com.curso.unifal.ecommerce.domain.user;

import com.curso.unifal.ecommerce.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

/**
 * A notaçao @Entity diz pro BD que User é uma entidade e que vamos mexer em seus atributos,
 * então, ela sozinha cria uma tabela dentro do BD com o exato mesmo nome da classe
 */
@Entity
@Table(name = "T_USER") // "User" é uma palavra reservada, então troca o nome da tabela pelo padrão "T_USER"
@NoArgsConstructor // Ao mexer com ORM, toda classe que for uma entidade precisa ter o construtor vazio!
public class User extends BaseEntity {

    @Id
    @Column(name = "UIDPK", nullable = false) // um ID não pode ser null
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uidPk;

    @Column(name = "FIRSTNAME", nullable = false)
    private String firstName;

    @Column(name = "LASTNAME", nullable = false)
    private String lastName;
}
