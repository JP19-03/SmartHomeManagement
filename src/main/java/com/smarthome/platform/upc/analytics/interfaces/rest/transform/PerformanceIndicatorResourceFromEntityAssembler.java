package com.smarthome.platform.upc.analytics.interfaces.rest.transform;

import com.smarthome.platform.upc.analytics.domain.model.aggregates.PerformanceIndicator;
import com.smarthome.platform.upc.analytics.interfaces.rest.resources.PerformanceIndicatorResource;

/**
 * Assembler class to convert PerformanceIndicator entity to PerformanceIndicatorResource
 * @author Johan Principe Godoy u202014511
 * @version 1.0
 */
public class PerformanceIndicatorResourceFromEntityAssembler {

    /**
     * Converts a PerformanceIndicator entity to a PerformanceIndicatorResource
     * @param entity the {@link PerformanceIndicator} to convert
     * @return the {@link PerformanceIndicatorResource} converted
     */
    public static PerformanceIndicatorResource toResourceFromEntity(PerformanceIndicator entity) {
        return new PerformanceIndicatorResource(
                entity.getId(),
                entity.getName(),
                entity.getDescription(),
                entity.getMinValue(),
                entity.getMaxValue(),
                entity.getDeviceType()
        );
    }
}
