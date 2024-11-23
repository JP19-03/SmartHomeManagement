package com.smarthome.platform.upc.inventory.domain.exceptions;

/**
 * Exception thrown when a device with the same serial number already exists
 * @author Johan Principe Godoy u202014511
 * @version 1.0
 */
public class DuplicateDeviceException extends RuntimeException{
    public DuplicateDeviceException(String serialNumber) {
        super("Device with serial number %s already exists".formatted(serialNumber));
    }
}
