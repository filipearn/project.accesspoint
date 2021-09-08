package com.digital.innovation.one.project.accesspoint.api.controller;

import com.digital.innovation.one.project.accesspoint.api.assembler.JornadaTrabalhoInputDisassembler;
import com.digital.innovation.one.project.accesspoint.api.assembler.JornadaTrabalhoModelAssembler;
import com.digital.innovation.one.project.accesspoint.api.model.JornadaTrabalhoModel;
import com.digital.innovation.one.project.accesspoint.api.model.input.JornadaTrabalhoInput;
import com.digital.innovation.one.project.accesspoint.domain.model.JornadaTrabalho;
import com.digital.innovation.one.project.accesspoint.domain.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    private JornadaService jornadaService;

    @Autowired
    private JornadaTrabalhoInputDisassembler jornadaTrabalhoInputDisassembler;

    @Autowired
    private JornadaTrabalhoModelAssembler jornadaTrabalhoModelAssembler;

    @GetMapping
    public List<JornadaTrabalhoModel> findAll() {
        List<JornadaTrabalho> jornadasTrabalho = jornadaService.findAll();

        return jornadaTrabalhoModelAssembler.toCollectionModel(jornadasTrabalho);
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalhoModel> findById(@PathVariable("idJornada") Long idJornada) throws Exception {
        JornadaTrabalho jornadaTrabalho = jornadaService.buscarOuFalhar(idJornada);

        JornadaTrabalhoModel jornadaTrabalhoModel = jornadaTrabalhoModelAssembler.toModel(jornadaTrabalho);

        return ResponseEntity.ok(jornadaTrabalhoModel);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public JornadaTrabalhoModel create(@RequestBody @Valid JornadaTrabalhoInput jornadaTrabalhoInput) {

            JornadaTrabalho jornadaTrabalho = jornadaTrabalhoInputDisassembler.toDomainObject(jornadaTrabalhoInput);

            jornadaTrabalho = jornadaService.save(jornadaTrabalho);

            return jornadaTrabalhoModelAssembler.toModel(jornadaTrabalho);

    }

    @PutMapping("{jornadaId}")
    public JornadaTrabalhoModel update(@PathVariable Long jornadaId, @RequestBody @Valid JornadaTrabalhoInput jornadaTrabalhoInput) {
        JornadaTrabalho jornadaTrabalho = jornadaService.buscarOuFalhar(jornadaId);

        jornadaTrabalhoInputDisassembler.copyToDomainObject(jornadaTrabalhoInput, jornadaTrabalho);

        jornadaTrabalho = jornadaService.save(jornadaTrabalho);

        return jornadaTrabalhoModelAssembler.toModel(jornadaTrabalho);
    }


    @DeleteMapping("/{idJornada}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable("idJornada") Long idJornada) throws Exception {
        jornadaService.deleteById(idJornada);
    }

}