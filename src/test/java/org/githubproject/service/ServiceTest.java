package org.githubproject.service;

import org.githubproject.service.dto.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTest {

    private Service service;

    @BeforeEach
    public void setup() {
        service = new Service();
    }

    @Test
    public void getResponse() {
        //given
        final Response expectedResult = new Response();
        expectedResult.setFull_name("BartlomiejZaczek/github-service");
        expectedResult.setDescription("Get basic informations on github repository");
        expectedResult.setClone_url("https://github.com/BartlomiejZaczek/github-service.git");
        expectedResult.setStargazers_count("0");
        expectedResult.setCreated_at("2022-07-17T08:40:12Z");
        //when
        final Response result = service.getResponse("BartlomiejZaczek", "github-service");
        //then
        assertEquals(expectedResult, result);
    }
}
