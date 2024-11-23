package com.smarthome.platform.upc.analytics.interfaces.rest.resources;

/**
 * PerformanceIndicatorResource
 * @param id the performance indicator id
 * @param name the performance indicator name
 * @param description the performance indicator description
 * @param minValue the performance indicator minimum value
 * @param maxValue the performance indicator maximum value
 * @param deviceType the performance indicator device type
 * @author Johan Principe Godoy u202014511
 * @version 1.0
 */
public record PerformanceIndicatorResource(
        Long id,
        String name,
        String description,
        Double minValue,
        Double maxValue,
        String deviceType
) {
}
