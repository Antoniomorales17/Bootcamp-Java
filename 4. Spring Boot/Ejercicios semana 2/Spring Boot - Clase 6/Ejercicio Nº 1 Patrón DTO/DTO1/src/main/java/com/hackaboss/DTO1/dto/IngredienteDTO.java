package com.hackaboss.DTO1.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;




@Data
@NoArgsConstructor
public class IngredienteDTO {
    private int id;
    private String name;
    private int calories;

    @JsonCreator
    public IngredienteDTO(
            @JsonProperty("id") int id,
            @JsonProperty("name") String name,
            @JsonProperty("calories") int calories) {
        this.id = id;
        this.name = name;
        this.calories = calories;
    }
}


