package com.example.CadastroDeNinjas.Ninjas;

import com.example.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/*Entity transforma uma classe em uma entidade do Banco de Dados*/
/* JPA = Java Persistence API*/
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    /* @ManyToOne - um ninja tem uma unica missao*/
    @ManyToOne
    @JoinColumn(name = "missoes_id") /*Foreing Key ou Chave Estrangeira*/
    private MissoesModel missoes;
}
