package com.digital.innovation.one.project.accesspoint.api.assembler;

import com.digital.innovation.one.project.accesspoint.api.model.input.JornadaTrabalhoInput;
import com.digital.innovation.one.project.accesspoint.domain.model.JornadaTrabalho;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JornadaTrabalhoInputDisassembler {
        @Autowired
        private ModelMapper modelMapper;

        public JornadaTrabalho toDomainObject(JornadaTrabalhoInput jornadaTrabalhoInput) {
            return modelMapper.map(jornadaTrabalhoInput, JornadaTrabalho.class);
        }

        public void copyToDomainObject(JornadaTrabalhoInput jornadaTrabalhoInput, JornadaTrabalho jornadaTrabalho) {
            modelMapper.map(jornadaTrabalhoInput, jornadaTrabalho);
        }

    }