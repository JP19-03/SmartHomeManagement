package com.smarthome.platform.upc.inventory.interfaces.rest.transform;

import com.smarthome.platform.upc.inventory.domain.model.aggregates.Device;
import com.smarthome.platform.upc.inventory.interfaces.rest.resources.DeviceResource;

/**
 * Assembler class to convert a Device entity to a DeviceResource
 * @author Johan Principe Godoy u202014511
 * @version 1.0
 */
public class DeviceResourceFromEntityAssembler {

    /**
     * Converts a Device entity to a DeviceResource
     * @param entity the {@link Device} to convert
     * @return the {@link DeviceResource} converted
     */
    public static DeviceResource toResourceFromEntity(Device entity) {
        return new DeviceResource(
                entity.getId(),
                entity.getSerialNumber(),
                entity.getModel(),
                entity.getDeviceType(),
                entity.getInstallationDate(),
                entity.getStatus()
        );
    }
}
