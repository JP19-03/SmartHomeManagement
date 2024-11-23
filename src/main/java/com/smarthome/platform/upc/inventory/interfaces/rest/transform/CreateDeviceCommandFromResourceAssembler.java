package com.smarthome.platform.upc.inventory.interfaces.rest.transform;

import com.smarthome.platform.upc.inventory.domain.model.commands.CreateDeviceCommand;
import com.smarthome.platform.upc.inventory.interfaces.rest.resources.CreateDeviceResource;

/**
 * Assembler class to convert a CreateDeviceResource to a CreateDeviceCommand
 * @author Johan Principe Godoy u202014511
 * @version 1.0
 */
public class CreateDeviceCommandFromResourceAssembler {

    /**
     * Converts a CreateDeviceResource to a CreateDeviceCommand
     * @param resource the {@link CreateDeviceResource} to convert
     * @return the {@link CreateDeviceCommand} converted
     */
    public static CreateDeviceCommand toCommandFromResource(CreateDeviceResource resource) {
        return new CreateDeviceCommand(
                resource.serialNumber(),
                resource.model(),
                resource.deviceType(),
                resource.installationDate(),
                resource.status()
        );
    }
}
