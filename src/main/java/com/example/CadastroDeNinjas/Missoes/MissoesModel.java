package com.example.CadastroDeNinjas.Missoes;

import com.example.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Cleanup;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_missoes")
    private Long id;

    @Column (name = "nome_missao")
    private String nome;

    @Column (name = "dificuldade_missao")
    private String dificuldade;

    /* @OneToMany - uma missao pode ter varios ninjas*/
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;

}
