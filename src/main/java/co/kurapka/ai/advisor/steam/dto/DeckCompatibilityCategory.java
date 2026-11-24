package co.kurapka.ai.advisor.steam.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Overall Steam Deck / SteamOS compatibility rating ({@code *_resolved_category}).
 */
public enum DeckCompatibilityCategory {
    UNKNOWN(0),
    UNSUPPORTED(1),
    PLAYABLE(2),
    VERIFIED(3);

    private final int code;

    DeckCompatibilityCategory(int code) {
        this.code = code;
    }

    @JsonValue
    public int code() {
        return code;
    }

    @JsonCreator
    public static DeckCompatibilityCategory fromCode(Integer code) {
        if (code == null) {
            return null;
        }
        for (DeckCompatibilityCategory value : values()) {
            if (value.code == code) {
                return value;
            }
        }
        return UNKNOWN;
    }
}
