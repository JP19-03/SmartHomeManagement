package com.smarthome.platform.upc.analytics.domain.model.commands;

/**
 * Command to create a performance indicator
 * @param name the name of the performance indicator
 * @param description the description of the performance indicator
 * @param minValue the minimum value of the performance indicator
 * @param maxValue the maximum value of the performance indicator
 * @param deviceType the device type of the performance indicator
 * @author Johan Principe Godoy u202014511
 * @version 1.0
 */
public record CreatePerformanceIndicatorCommand(
        String name,
        String description,
        Double minValue,
        Double maxValue,
        String deviceType
) {
}
