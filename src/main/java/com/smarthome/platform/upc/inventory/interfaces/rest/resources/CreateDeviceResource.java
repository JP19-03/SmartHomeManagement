package com.smarthome.platform.upc.inventory.interfaces.rest.resources;

import java.util.Date;

/**
 * Resource to create a device.
 * @param serialNumber The serial number of the device.
 * @param model The model of the device.
 * @param deviceType The type of the device.
 * @param installationDate The installation date of the device.
 * @param status The status of the device.
 * @author Johan Principe Godoy u202014511
 * @version 1.0
 */
public record CreateDeviceResource(
        String serialNumber,
        String model,
        String deviceType,
        Date installationDate,
        String status
) {
}
