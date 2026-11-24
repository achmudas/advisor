package co.kurapka.ai.advisor.steam.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Single hit of the Steam store search.
 *
 * @param type              {@code "app"} for games/DLC, {@code "sub"} for packages/bundles
 * @param id                Steam app id (or package id when {@code type} is {@code "sub"})
 * @param price             {@code null} for free-to-play or unreleased titles
 * @param metascore         Steam returns {@code "87"}, {@code ""} or {@code 0}, so it is kept raw;
 *                          use {@link #metascoreValue()} for a parsed value
 * @param controllerSupport {@code "full"}, {@code "partial"} or {@code null} when absent
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record SteamSearchItem(
        String type,
        String name,
        long id,
        SteamPrice price,
        @JsonProperty("tiny_image") String tinyImage,
        String metascore,
        SteamPlatforms platforms,
        @JsonProperty("streamingvideo") boolean streamingVideo,
        @JsonProperty("controller_support") String controllerSupport
) {

    /** Metascore as a number, or {@code null} if Steam has none (empty string or 0). */
    public Integer metascoreValue() {
        if (metascore == null || metascore.isBlank()) {
            return null;
        }
        try {
            int value = Integer.parseInt(metascore.trim());
            return value > 0 ? value : null;
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
