package com.digital.innovation.one.project.accesspoint.controller;

import com.digital.innovation.one.project.accesspoint.model.JornadaTrabalho;
import com.digital.innovation.one.project.accesspoint.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho create(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.save(jornadaTrabalho);
    }

    @PutMapping
    public JornadaTrabalho update(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.save(jornadaTrabalho);
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> findById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(jornadaService.findById(idJornada).orElseThrow(() -> new Exception("Jornada não encontrada!")));
    }

    @GetMapping
    public List<JornadaTrabalho> findAll() {
        return jornadaService.findAll();
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity<Void> deleteById(@PathVariable("idJornada") Long idJornada) throws Exception {
        try {
            jornadaService.deleteById(idJornada);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ResponseEntity.noContent().build();

    }

}