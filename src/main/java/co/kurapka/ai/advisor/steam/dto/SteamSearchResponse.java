package co.kurapka.ai.advisor.steam.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Response of {@code GET https://store.steampowered.com/api/storesearch?term=<query>&cc=<cc>}.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record SteamSearchResponse(
        int total,
        List<SteamSearchItem> items
) {
}
