package com.example.CadastroDeNinjas.Ninjas;

import com.example.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

/*Entity transforma uma classe em uma entidade do Banco de Dados*/
/* JPA = Java Persistence API*/
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    /* @ManyToOne - um ninja tem uma unica missao*/
    @ManyToOne
    @JoinColumn(name = "missoes_id") /*Foreing Key ou Chave Estrangeira*/
    private MissoesModel missoes;

    /*No-args constructor*/
    public NinjaModel() {
    }

    /*All-args constructor*/
    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
