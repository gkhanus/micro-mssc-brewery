package com.micro.msscbrewery.web.mappers;

import com.micro.msscbrewery.domain.Beer;
import com.micro.msscbrewery.web.model.BeerDto;

public interface BeerMappers {

    BeerDto beerToBeerDto(Beer beeer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
