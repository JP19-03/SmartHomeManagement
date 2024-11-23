package com.smarthome.platform.upc.inventory.domain.model.commands;

import java.util.Date;

/**
 * Command to create a new device
 * @param serialNumber the serial number of the device
 * @param model the model of the device
 * @param deviceType the type of the device
 * @param installationDate the installation date of the device
 * @param status the status of the device
 * @author Johan Principe Godoy
 * @version 1.0
 */
public record CreateDeviceCommand(
        String serialNumber,
        String model,
        String deviceType,
        Date installationDate,
        String status
) {
}
