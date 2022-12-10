package com.example.apirest.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apirest.modelo.MedicoModelo;
import com.example.apirest.repositorio.MedicoRepositorio;

@RestController
@RequestMapping("/medicos")
public class MedicoControlador {
    @Autowired
    MedicoRepositorio medicoRepositorio;

    @GetMapping()
    public List<MedicoModelo> findAllMedicos(){
        return ( List<MedicoModelo>) medicoRepositorio.findAll();
    }

    @PostMapping()
    public MedicoModelo saveMedico(@RequestBody MedicoModelo medico){
        return medicoRepositorio.save(medico);
    }
    
    @DeleteMapping("/{id}")
    public void deleteMedico(@PathVariable("id") String id){
         medicoRepositorio.deleteById(id);
    }
}
