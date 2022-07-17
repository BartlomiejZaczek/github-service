package org.githubproject.service.dto;

import lombok.Data;

@Data
public class Response {

    private String full_name;
    private String description;
    private String clone_url;
    private String stargazers_count;
    private String created_at;
}
