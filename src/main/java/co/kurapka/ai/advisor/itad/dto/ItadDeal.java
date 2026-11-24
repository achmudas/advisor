package co.kurapka.ai.advisor.itad.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Current offer in one shop.
 *
 * @param price     current price
 * @param regular   regular (non-discounted) price
 * @param cut       discount in percent (0–100)
 * @param voucher   voucher code required to get the price, or {@code null}
 * @param storeLow  lowest price ever recorded in this shop
 * @param flag      historical-low marker, {@code null} if none
 * @param drm       DRMs attached to the purchase; empty if unknown
 * @param platforms supported platforms; may be empty
 * @param timestamp when the deal was recorded
 * @param expiry    when the deal ends, or {@code null} if unknown
 * @param url       ITAD redirect link to the shop
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ItadDeal(
        ItadShop shop,
        ItadPrice price,
        ItadPrice regular,
        int cut,
        String voucher,
        ItadPrice storeLow,
        ItadDealFlag flag,
        List<ItadDrm> drm,
        List<ItadPlatform> platforms,
        OffsetDateTime timestamp,
        OffsetDateTime expiry,
        String url
) {
}
