package co.kurapka.ai.advisor.steam.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * How Steam renders a single test result ({@code display_type}).
 */
public enum DeckTestResultDisplayType {
    UNKNOWN(0),
    /** Neutral note, e.g. "requires internet connection for first-time setup". */
    INFO(1),
    /** Blocking issue, e.g. unsupported anti-cheat. */
    UNSUPPORTED(2),
    /** Works with caveats (warning). */
    PLAYABLE(3),
    /** Passed check. */
    VERIFIED(4);

    private final int code;

    DeckTestResultDisplayType(int code) {
        this.code = code;
    }

    @JsonValue
    public int code() {
        return code;
    }

    @JsonCreator
    public static DeckTestResultDisplayType fromCode(Integer code) {
        if (code == null) {
            return null;
        }
        for (DeckTestResultDisplayType value : values()) {
            if (value.code == code) {
                return value;
            }
        }
        return UNKNOWN;
    }
}
