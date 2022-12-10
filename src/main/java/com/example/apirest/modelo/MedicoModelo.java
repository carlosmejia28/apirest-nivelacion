package com.example.apirest.modelo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("medicos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class MedicoModelo {
    @Id
    private String id;
    private String nombre;
    private List<String> especialidades;
    private Object direccion;
}
