package co.kurapka.ai.advisor.steam.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * One test result line, e.g. {@code #SteamDeckVerified_TestResult_InterfaceTextIsNotLegible}.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record DeckCompatibilityItem(
        @JsonProperty("display_type") DeckTestResultDisplayType displayType,
        @JsonProperty("loc_token") String locToken
) {
}
