package com.kids_management.dto;


import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FamilyDto {
    @NotNull(message = "FamilyName is required")
    String familyName;
}
