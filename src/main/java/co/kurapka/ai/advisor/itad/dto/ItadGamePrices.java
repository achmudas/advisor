package co.kurapka.ai.advisor.itad.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * One element of the response of
 * {@code POST https://api.isthereanydeal.com/games/prices/v3?country=<cc>} (the body is a JSON array of these).
 *
 * @param id ITAD game id (UUID)
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ItadGamePrices(
        String id,
        ItadHistoryLow historyLow,
        List<ItadDeal> deals
) {
}
