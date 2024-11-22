package com.smarthome.platform.upc.shared.domain.services;

import com.smarthome.platform.upc.shared.domain.model.commands.SeedDeviceTypesCommand;

/**
 * Service to handle commands related to device types
 * @summary
 * This service is responsible for handling commands related to device types
 * @author Johan Principe Godoy u202014511
 * @version 1.0
 */
public interface DeviceTypeCommandService {

    /**
     * Handles the command to seed a device type
     *
     * @param command the command to seed device types
     * @see SeedDeviceTypesCommand
     * @throws IllegalArgumentException if the command is invalid
     */
    void handle(SeedDeviceTypesCommand command);
}
