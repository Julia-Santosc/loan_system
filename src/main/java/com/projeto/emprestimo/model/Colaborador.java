package com.projeto.emprestimo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @NotBlank(message = "O nome é obrigatório")
   @Column(nullable = false)
   private String nome;

    @NotBlank(message = "O e-mail é obrigatório")
    @Email(message = "E-mail inválido")
    @Column(nullable = false, unique = true)
    private String email;

    @NotBlank(message = "O CEP é obrigatório")
    @Pattern(regexp = "\\d{8}",
            message = "O CEP deve ter 8 dígitos, sem traço")
    @Column(nullable = false)
    private String cep;

    @NotBlank(message = "O número é obrigatório")
    @Column(nullable = false)
    private String numero;

    private String logradouro, bairro, cidade, uf;
}
