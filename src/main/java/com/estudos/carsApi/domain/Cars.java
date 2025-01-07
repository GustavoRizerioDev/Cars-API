package com.estudos.carsApi.domain;

import com.estudos.carsApi.dto.CarsRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "Car")
@Entity(name = "Car")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Setter
    @Column(name = "nome")
    private String nome;

    @Setter
    @Column(name = "marca")
    private String marca;

    @Setter
    @Column(name = "preco")
    private Integer preco;

    @Setter
    @Column(name = "ano")
    private Integer ano;

    @Setter
    @Column(name = "cor")
    private String cor;

    @Setter
    @Column(name = "modelo")
    private String modelo;

    @Setter
    @Column(name = "quilometragem")
    private Integer quilometragem;

    @Setter
    @Column(name = "portas")
    private Integer portas;

    @Setter
    @Column(name = "finalPlaca")
    private Integer finalPlaca;


    public Cars(CarsRequestDTO data){
        this.marca = data.marca();
        this.preco = data.preco();
        this.nome = data.nome();
        this.ano = data.ano();
        this.cor = data.cor();
        this.modelo = data.modelo();
        this.quilometragem = data.quilometragem();
        this.portas = data.portas();
        this.finalPlaca = data.finalPlaca();
    }

}
