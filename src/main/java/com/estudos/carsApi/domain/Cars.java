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

    @Column(name = "nome")
    private String nome;

    @Column(name = "marca")
    private String marca;

    @Column(name = "preco")
    private Integer preco;

    public Cars(CarsRequestDTO data){
        this.marca = data.marca();
        this.preco = data.preco();
        this.nome = data.nome();
    }
}
