package guru.springframework.springaifunctions.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

import java.math.BigDecimal;

/**
 *
 * @param windSpeed
 * @param windDegrees
 * @param temp
 * @param humidity
 * @param sunset
 * @param sunrise
 * @param minTemp
 * @param cloudPct
 * @param feelsLike
 * @param maxTemp
 *
 *
 * Changes:
 * 2025-01-30 AS: Add @JsonProperty to all properties to match the sample response https://www.api-ninjas.com/api/weather
 */

public record WeatherResponse(
        @JsonProperty(value = "wind_speed")
        @JsonPropertyDescription("Wind Speed in KMH") BigDecimal windSpeed,
        @JsonProperty(value = "wind_degrees")
        @JsonPropertyDescription("Direction of wind in degrees") Integer windDegrees,
        @JsonProperty(value = "temp")
        @JsonPropertyDescription("Current Temperature in Celsius") Integer temp,
        @JsonProperty(value = "humidity")
        @JsonPropertyDescription("Current Humidity in percentage") Integer humidity,
        @JsonProperty(value = "sunset")
        @JsonPropertyDescription("Epoch time of sunset GMT ") Integer sunset,
        @JsonProperty(value = "sunrise")
        @JsonPropertyDescription("Epoch time of Sunrise GMT ") Integer sunrise,
        @JsonProperty(value = "min_temp")
        @JsonPropertyDescription("Minimum Temperature in Celsius") Integer minTemp,
        @JsonProperty(value = "cloud_pct")
        @JsonPropertyDescription("Cloud Cover in Percentage") Integer cloudPct,
        @JsonProperty(value = "feels_like")
        @JsonPropertyDescription("Feels like temperature in Celsius") Integer feelsLike,
        @JsonProperty(value = "max_temp")
        @JsonPropertyDescription("Maximum Temperature in Celsius") Integer maxTemp) {
}
