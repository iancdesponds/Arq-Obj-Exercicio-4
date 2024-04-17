package com.example.Invest.investidor;

import jakarta.persistence.*;

@Entity
public class Investidor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String nome;
    @Column(unique = true)
    private String cpf;
    @Enumerated(EnumType.STRING)
    private PerfilInvestimento perfilInvestimento;

    // Getters e Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public PerfilInvestimento getPerfilInvestimento() {
        return perfilInvestimento;
    }

    public void setPerfilInvestimento(PerfilInvestimento perfilInvestimento) {
        this.perfilInvestimento = perfilInvestimento;
    }
}