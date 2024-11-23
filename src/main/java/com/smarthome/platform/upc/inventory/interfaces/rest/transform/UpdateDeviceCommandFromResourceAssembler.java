package com.smarthome.platform.upc.inventory.interfaces.rest.transform;

import com.smarthome.platform.upc.inventory.domain.model.commands.UpdateDeviceCommand;
import com.smarthome.platform.upc.inventory.interfaces.rest.resources.UpdateDeviceResource;

/**
 * Assembler class to convert a UpdateDeviceResource to a UpdateDeviceCommand
 * @author Johan Principe Godoy u202014511
 * @version 1.0
 */
public class UpdateDeviceCommandFromResourceAssembler {

    /**
     * Converts a UpdateDeviceResource to a UpdateDeviceCommand
     * @param resource the {@link UpdateDeviceResource} to convert
     * @param id the id of the device to update
     * @return the {@link UpdateDeviceCommand} converted
     */
    public static UpdateDeviceCommand toCommandFromResource(UpdateDeviceResource resource, Long id) {
        return new UpdateDeviceCommand(
                id,
                resource.model(),
                resource.deviceType(),
                resource.installationDate(),
                resource.status()
        );
    }
}
