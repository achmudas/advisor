package co.kurapka.ai.advisor.steam.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Response of {@code GET https://store.steampowered.com/saleaction/ajaxgetdeckappcompatibilityreport?nAppID=<appId>}.
 *
 * @param success {@code 1} when the report was found
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record DeckCompatibilityResponse(
        int success,
        DeckCompatibilityResults results
) {
}
