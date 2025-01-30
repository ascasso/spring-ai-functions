package guru.springframework.springaifunctions.model;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

/**
 * Created by jt, Spring Framework Guru.
 *
 * Changes:
 * 2025-01-30 AS: Modified request parameters from location to longitude and latitude.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonClassDescription("Weather API request")
public record WeatherRequest(
        @JsonProperty(required = true, value = "lat")
        @JsonPropertyDescription("Latitude of desired location.") String latitude,
        @JsonProperty(required = true, value = "lon")
        @JsonPropertyDescription("Longitude of desired location.") String longitude) {
}
