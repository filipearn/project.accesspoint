package com.digital.innovation.one.project.accesspoint.api.assembler;

import com.digital.innovation.one.project.accesspoint.api.model.JornadaTrabalhoModel;
import com.digital.innovation.one.project.accesspoint.domain.model.JornadaTrabalho;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class JornadaTrabalhoModelAssembler {

    @Autowired
    private ModelMapper modelMapper;

    public JornadaTrabalhoModel toModel(JornadaTrabalho jornadaTrabalho) {
        return modelMapper.map(jornadaTrabalho, JornadaTrabalhoModel.class);
    }

    public List<JornadaTrabalhoModel> toCollectionModel(List<JornadaTrabalho> jornadasTrabalho) {
        return jornadasTrabalho.stream()
                .map(jornada -> toModel(jornada))
                .collect(Collectors.toList());
    }
}
