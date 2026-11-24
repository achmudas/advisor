package co.kurapka.ai.advisor.protondb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Response of {@code GET https://www.protondb.com/api/v1/reports/summaries/<steamAppId>.json}.
 *
 * @param tier             current community rating
 * @param trendingTier     rating based on recent reports
 * @param bestReportedTier best rating any single report gave
 * @param score            0.0–1.0 aggregate score
 * @param total            number of reports
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ProtonDbSummary(
        ProtonDbTier tier,
        ProtonDbTier trendingTier,
        ProtonDbTier bestReportedTier,
        ProtonDbConfidence confidence,
        double score,
        int total
) {
}
