package co.kurapka.ai.advisor.itad.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Marker ITAD puts on a deal ({@code flag}).
 */
public enum ItadDealFlag {
    /** {@code H} – matches the all-time historical low across all shops. */
    HISTORICAL_LOW("H"),
    /** {@code N} – a new historical low. */
    NEW_HISTORICAL_LOW("N"),
    /** {@code S} – matches this shop's lowest price. */
    STORE_LOW("S"),
    UNKNOWN("?");

    private final String code;

    ItadDealFlag(String code) {
        this.code = code;
    }

    @JsonValue
    public String code() {
        return code;
    }

    @JsonCreator
    public static ItadDealFlag fromCode(String code) {
        if (code == null) {
            return null;
        }
        for (ItadDealFlag flag : values()) {
            if (flag.code.equals(code)) {
                return flag;
            }
        }
        return UNKNOWN;
    }
}
