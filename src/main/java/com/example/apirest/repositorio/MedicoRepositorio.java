package com.example.apirest.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.apirest.modelo.MedicoModelo;
@Repository
public interface MedicoRepositorio extends CrudRepository <MedicoModelo, String>{
    
}
