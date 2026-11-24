package co.kurapka.ai.advisor.steam.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Steam price. Amounts are in the smallest currency unit (cents), e.g. {@code 5999} = 59.99.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record SteamPrice(
        String currency,
        int initial,
        @JsonProperty("final") int finalPrice
) {
}
