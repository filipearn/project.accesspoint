package com.digital.innovation.one.project.accesspoint.core.modelmapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper(){
        var modelMapper = new ModelMapper();

//        modelMapper.createTypeMap(CityInputV2.class, City.class)
//                        .addMappings(mapper -> mapper.skip(City::setId));
//
//        modelMapper.createTypeMap(ItemOrderInput.class, ItemOrder.class)
//                .addMappings(mapper -> mapper.skip(ItemOrder::setId));
//
//
//
//        var addressToAddressModelTypeMap = modelMapper.createTypeMap(
//                Address.class, AddressModel.class);
//
//        addressToAddressModelTypeMap.<String>addMapping(
//                addressSrc -> addressSrc.getCity().getState().getName(),
//                (addressModelDest, value) -> addressModelDest.getCity().setState(value));

        return modelMapper;
    }
}
