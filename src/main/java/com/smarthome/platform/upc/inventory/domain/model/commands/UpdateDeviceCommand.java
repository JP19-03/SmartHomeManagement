package com.smarthome.platform.upc.inventory.domain.model.commands;

import java.util.Date;

/**
 * The command to update a device.
 * @param id The device id.
 * @param serialNumber The new device serial number.
 * @param model The new device model.
 * @param deviceType The new device type.
 * @param installationDate The new device installation date.
 * @param status The new device status.
 * @author Johan Principe Godoy u202014511
 * @version 1.0
 */
public record UpdateDeviceCommand(
        Long id,
        String model,
        String deviceType,
        Date installationDate,
        String status
) {
}
