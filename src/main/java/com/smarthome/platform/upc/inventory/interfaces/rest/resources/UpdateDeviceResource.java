package com.smarthome.platform.upc.inventory.interfaces.rest.resources;

import java.util.Date;

/**
 * Resource to update a device
 * @param model the model of the device
 * @param deviceType the type of the device
 * @param installationDate the installation date of the device
 * @param status the status of the device
 * @author Johan Principe Godoy u202014511
 * @version 1.0
 */
public record UpdateDeviceResource(
        String model,
        String deviceType,
        Date installationDate,
        String status
) {
}
