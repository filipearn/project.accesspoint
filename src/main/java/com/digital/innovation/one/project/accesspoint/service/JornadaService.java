package com.digital.innovation.one.project.accesspoint.service;

import com.digital.innovation.one.project.accesspoint.model.JornadaTrabalho;
import com.digital.innovation.one.project.accesspoint.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository){
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll(){
        return jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> findById(Long jornadaId){
        return jornadaRepository.findById(jornadaId);
    }

    public void delete(JornadaTrabalho jornadaTrabalho){
        jornadaRepository.delete(jornadaTrabalho);
    }

}
