package com.smarthome.platform.upc.analytics.interfaces.rest.transform;

import com.smarthome.platform.upc.analytics.domain.model.commands.CreatePerformanceIndicatorCommand;
import com.smarthome.platform.upc.analytics.interfaces.rest.resources.CreatePerformanceIndicatorResource;

/**
 * Assembler class to convert CreatePerformanceIndicatorResource to CreatePerformanceIndicatorCommand
 * @author Johan Principe Godoy u202014511
 * @version 1.0
 */
public class CreatePerformanceIndicatorCommandFromResourceAssembler {

    /**
     * Converts a CreatePerformanceIndicatorResource to a CreatePerformanceIndicatorCommand
     * @param resource the {@link CreatePerformanceIndicatorResource} to convert
     * @return the {@link CreatePerformanceIndicatorCommand} converted
     */
    public static CreatePerformanceIndicatorCommand toCommandFromResource(CreatePerformanceIndicatorResource resource) {
        return new CreatePerformanceIndicatorCommand(
                resource.name(),
                resource.description(),
                resource.minValue(),
                resource.maxValue(),
                resource.deviceType()
        );
    }
}
