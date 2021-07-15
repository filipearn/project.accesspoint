package com.digital.innovation.one.project.accesspoint.controller;

import com.digital.innovation.one.project.accesspoint.model.JornadaTrabalho;
import com.digital.innovation.one.project.accesspoint.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    /*@Autowired
    JornadaService jornadaService;

    @PostMapping(value = "$id")
    public JornadaTrabalho create(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.save(jornadaTrabalho);
    }

    @PostMapping(value = "$id")
    public JornadaTrabalho update(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.save(jornadaTrabalho);
    }

    @GetMapping(value = "$id")
    public Optional<JornadaTrabalho> findById(@RequestBody Long jornadaId){
        return jornadaService.findById(jornadaId);
    }

    @GetMapping(value = "$id")
    public List<JornadaTrabalho> findAll(){
        return jornadaService.findAll();
    }*/
}
