package org.githubproject.service;

import lombok.RequiredArgsConstructor;
import org.githubproject.service.dto.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {

    public Response getGithubResponse (String owner, String repositoryname) {
        String url = "https://api.github.com/repos/{owner}/{repositoryname}";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Response> response = restTemplate
                .getForEntity(
                        url,
                        Response.class,
                        owner, repositoryname
                );
        return response.getBody();
    }
}
