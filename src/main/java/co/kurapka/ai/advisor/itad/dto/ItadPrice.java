package co.kurapka.ai.advisor.itad.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

/**
 * @param amount    decimal amount, e.g. {@code 5.99}
 * @param amountInt amount in the smallest currency unit, e.g. {@code 599}
 * @param currency  ISO 4217 code, e.g. {@code EUR}
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ItadPrice(
        BigDecimal amount,
        int amountInt,
        String currency
) {
}
