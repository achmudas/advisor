package co.kurapka.ai.advisor.steam.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SteamPlatforms(
        boolean windows,
        boolean mac,
        boolean linux
) {
}
