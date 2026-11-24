package co.kurapka.ai.advisor.itad.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;
import java.util.Optional;

/**
 * Response of {@code POST https://api.isthereanydeal.com/lookup/id/shop/{shopId}/v1}.
 * <p>
 * The body is a JSON object keyed by the requested shop ids, value is the ITAD game id or {@code null}
 * when not found, e.g. {@code {"app/570": "018d937f-19a5-7057-bb6d-314d586e6dbc"}}.
 */
public record ItadLookupResponse(Map<String, String> ids) {

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public ItadLookupResponse {
        ids = ids == null ? Map.of() : ids;
    }

    @JsonValue
    public Map<String, String> ids() {
        return ids;
    }

    /** ITAD game id for a Steam app id, e.g. {@code itadIdForSteamApp(570)} looks up {@code "app/570"}. */
    public Optional<String> itadIdForSteamApp(long steamAppId) {
        return Optional.ofNullable(ids.get("app/" + steamAppId));
    }
}
