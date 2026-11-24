package co.kurapka.ai.advisor.protondb.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Locale;

public enum ProtonDbConfidence {
    STRONG,
    GOOD,
    MODERATE,
    LOW,
    INADEQUATE,
    UNKNOWN;

    @JsonValue
    public String value() {
        return name().toLowerCase(Locale.ROOT);
    }

    @JsonCreator
    public static ProtonDbConfidence fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (ProtonDbConfidence confidence : values()) {
            if (confidence.name().equalsIgnoreCase(value.trim())) {
                return confidence;
            }
        }
        return UNKNOWN;
    }
}
