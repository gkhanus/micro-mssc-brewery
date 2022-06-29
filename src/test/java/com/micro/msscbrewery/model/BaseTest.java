package com.micro.msscbrewery.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.micro.msscbrewery.web.model.BeerDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.UUID;

public class BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    BeerDto getDto(){
        return  BeerDto.builder()
                .beerName("BeerName")
                .beerStyle("Ale")
                .id(UUID.randomUUID())
                .upc(123123123123L)
                .createdTime(OffsetDateTime.now())
                .myLocalDate(LocalDate.now())
                .build();
    }
}
