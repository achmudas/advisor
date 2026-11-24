package co.kurapka.ai.advisor.itad.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Historical lowest prices across all shops.
 *
 * @param all all-time low
 * @param y1  lowest in the last year; {@code null} if no data
 * @param m3  lowest in the last 3 months; {@code null} if no data
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ItadHistoryLow(
        ItadPrice all,
        ItadPrice y1,
        ItadPrice m3
) {
}
