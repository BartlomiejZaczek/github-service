package org.githubproject.controller;

import lombok.RequiredArgsConstructor;
import org.githubproject.service.Service;
import org.githubproject.service.dto.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final Service service;

    @GetMapping(path = "/repositories/{owner}/{repositoryname}")
    public ResponseEntity<Response> getRepository(@PathVariable("owner") String owner,
                                                  @PathVariable("repositoryname") String repositoryname) {
        final Response response = service.getResponse(owner, repositoryname);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }
}
