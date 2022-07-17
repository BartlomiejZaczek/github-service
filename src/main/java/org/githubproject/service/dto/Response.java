package org.githubproject.service.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Response {
    @JsonAlias("full_name")
    @JsonProperty(value = "fullName", index= 0)
    private String full_name;
    private String description;
    @JsonAlias("clone_url")
    @JsonProperty(value = "cloneUrl")
    private String clone_url;
    @JsonAlias("stargazers_count")
    @JsonProperty(value = "stars")
    private String stargazers_count;
    @JsonAlias("created_at")
    @JsonProperty(value = "createdAt")
    private String created_at;
}
