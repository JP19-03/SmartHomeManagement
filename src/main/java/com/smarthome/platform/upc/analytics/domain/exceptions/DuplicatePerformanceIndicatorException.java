package com.smarthome.platform.upc.analytics.domain.exceptions;

/**
 * Exception thrown when a Performance Indicator with the same device type already exists
 * @author Johan Principe Godoy u202014511
 * @version 1.0
 */
public class DuplicatePerformanceIndicatorException extends RuntimeException{
    public DuplicatePerformanceIndicatorException(String deviceType) {
        super("Performance Indicator with device type %s already exists".formatted(deviceType));
    }
}
