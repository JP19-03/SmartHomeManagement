package com.smarthome.platform.upc.inventory.domain.services;

import com.smarthome.platform.upc.inventory.domain.model.aggregates.Device;
import com.smarthome.platform.upc.inventory.domain.model.commands.CreateDeviceCommand;
import com.smarthome.platform.upc.inventory.domain.model.commands.UpdateDeviceCommand;

import java.util.Optional;

/**
 * This interface represents the service that handles the commands related to the {@link Device} entity.
 * @author Johan Principe Godoy
 * @version 1.0
 */
public interface DeviceCommandService {

    /**
     * Handles the command to create a new device.
     * @param command the command to create a new device containing the necessary data.
     * @return an optional containing the created device if the operation was successful, otherwise an empty optional.
     */
    Optional<Device> handle(CreateDeviceCommand command);

    /**
     * Handles the command to update a device.
     * @param command the command to update a device containing the necessary data.
     * @return an optional containing the updated device if the operation was successful, otherwise an empty optional.
     */
    Optional<Device> handle(UpdateDeviceCommand command);
}
