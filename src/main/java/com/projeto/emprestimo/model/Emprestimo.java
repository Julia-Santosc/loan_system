package com.projeto.emprestimo.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private  Equipamento equipamento;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Colaborador colaborador;

    @Column(nullable = false)
    private LocalDate dataEmprestimo;

    @Column(nullable = false)
    private LocalDate dataPrevistaDevolucao;

    private LocalDate dataDevolucao;

    public boolean isAtrasado() {
        return dataDevolucao == null
                && dataPrevistaDevolucao
                .isBefore(LocalDate.now());
    }
}
