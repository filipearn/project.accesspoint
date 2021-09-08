package com.digital.innovation.one.project.accesspoint.domain.service;

import com.digital.innovation.one.project.accesspoint.domain.exception.JornadaTrabalhoNotFoundException;
import com.digital.innovation.one.project.accesspoint.domain.model.JornadaTrabalho;
import com.digital.innovation.one.project.accesspoint.domain.repository.JornadaRepository;
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

    public void deleteById(Long jornadaId){
        buscarOuFalhar(jornadaId);

        jornadaRepository.deleteById(jornadaId);
    }

    public JornadaTrabalho buscarOuFalhar(Long jornadaId){
        return findById(jornadaId).orElseThrow(
                () -> new JornadaTrabalhoNotFoundException(jornadaId));
    }

}
