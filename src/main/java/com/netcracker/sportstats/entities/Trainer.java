package com.netcracker.sportstats.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "trainer")
public class Trainer {

    @JsonApiId
    private Long id;

    @JsonProperty
    private String name;

    @JsonProperty
    private Long teamId;

    public Trainer(){}

    public Trainer(Long id, String name, Long teamId) {
        this.id = id;
        this.name = name;
        this.teamId = teamId;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Long getTeamId() { return teamId; }

    public void setTeamId(Long teamId) { this.teamId = teamId; }
}
