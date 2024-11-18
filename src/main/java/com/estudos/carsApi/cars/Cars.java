package com.estudos.carsApi.cars;

import com.estudos.carsApi.dto.CarsRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "Car")
@Entity(name = "Car")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cars {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String marca;
    private Integer preco;

    public Cars(CarsRequestDTO data){
        this.marca = data.marca();
        this.preco = data.preco();
        this.nome = data.nome();
    }
}
