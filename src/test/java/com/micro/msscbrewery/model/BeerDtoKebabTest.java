package com.micro.msscbrewery.model;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.micro.msscbrewery.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
@JsonTest
public class BeerDtoKebabTest extends BaseTest {

    @Test
    void testJsonBeerDto() throws JsonProcessingException {
        BeerDto dto = getDto();

        String beerDtoStr = objectMapper.writeValueAsString(dto);

        System.out.println(beerDtoStr);
    }
}
