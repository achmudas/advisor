package co.kurapka.ai.advisor.protondb.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Locale;

public enum ProtonDbTier {
    NATIVE,
    PLATINUM,
    GOLD,
    SILVER,
    BRONZE,
    BORKED,
    PENDING,
    UNKNOWN;

    @JsonValue
    public String value() {
        return name().toLowerCase(Locale.ROOT);
    }

    @JsonCreator
    public static ProtonDbTier fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (ProtonDbTier tier : values()) {
            if (tier.name().equalsIgnoreCase(value.trim())) {
                return tier;
            }
        }
        return UNKNOWN;
    }
}
