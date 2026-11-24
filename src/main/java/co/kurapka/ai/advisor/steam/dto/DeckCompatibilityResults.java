package co.kurapka.ai.advisor.steam.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Compatibility verdicts for each Valve device family.
 * <ul>
 *     <li>{@code resolved*} – Steam Deck</li>
 *     <li>{@code steamos*} – SteamOS (generic)</li>
 *     <li>{@code machine*} – Steam Machine</li>
 *     <li>{@code frame*} – Steam Frame; category may be {@code null}</li>
 * </ul>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record DeckCompatibilityResults(
        @JsonProperty("appid") long appId,

        @JsonProperty("resolved_category") DeckCompatibilityCategory deckCategory,
        @JsonProperty("resolved_items") List<DeckCompatibilityItem> deckItems,

        @JsonProperty("steamos_resolved_category") DeckCompatibilityCategory steamOsCategory,
        @JsonProperty("steamos_resolved_items") List<DeckCompatibilityItem> steamOsItems,

        @JsonProperty("machine_resolved_category") DeckCompatibilityCategory machineCategory,
        @JsonProperty("machine_resolved_items") List<DeckCompatibilityItem> machineItems,

        @JsonProperty("frame_resolved_category") DeckCompatibilityCategory frameCategory,
        @JsonProperty("frame_resolved_items") List<DeckCompatibilityItem> frameItems,

        @JsonProperty("steam_deck_blog_url") String steamDeckBlogUrl,
        @JsonProperty("search_id") String searchId
) {
}
