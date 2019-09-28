package com.hackathon.teams.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
    private int id;
    private int idUser;
    private String email;
    private String firstName;
    private String lastName;
    private String idWorkerType;
    private String urlPhoto;
}
