package de.fhb.ca.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
    @NonNull
    private String message;
    @NonNull
    private int type;
}
