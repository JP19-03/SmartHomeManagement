package com.smarthome.platform.upc.inventory.interfaces.rest.resources;

import java.util.Date;

/**
 * DeviceResource
 * @param id the device id
 * @param serialNumber the device serial number
 * @param model the device model
 * @param deviceType the device type
 * @param installationDate the device installation date
 * @param status the device status
 * @author Johan Principe Godoy u202014511
 * @version 1.0
 */
public record DeviceResource(
        Long id,
        String serialNumber,
        String model,
        String deviceType,
        Date installationDate,
        String status
) {
}
