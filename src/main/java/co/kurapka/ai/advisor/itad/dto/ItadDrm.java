package co.kurapka.ai.advisor.itad.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ItadDrm(
        int id,
        String name
) {
}
