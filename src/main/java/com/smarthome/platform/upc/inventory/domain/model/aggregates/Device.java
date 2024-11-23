package com.smarthome.platform.upc.inventory.domain.model.aggregates;

import com.smarthome.platform.upc.inventory.domain.model.commands.CreateDeviceCommand;
import com.smarthome.platform.upc.inventory.domain.model.commands.UpdateDeviceCommand;
import com.smarthome.platform.upc.inventory.domain.model.valueobjects.DeviceStatus;
import com.smarthome.platform.upc.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import com.smarthome.platform.upc.shared.domain.model.valueobjects.DeviceTypes;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

import java.util.Date;

/**
 * Device
 * @summary
 * This class represents the Device aggregate root entity.
 * It contains the information of a device.
 * @author Johan Principe Godoy u202014511
 * @version 1.0
 */
@Entity
public class Device extends AuditableAbstractAggregateRoot<Device> {

    @Getter
    @NotBlank
    @Size(max = 30)
    @Column(nullable = false, unique = true)
    private String serialNumber;

    @Getter
    @NotBlank
    @Size(max = 50)
    @Column(nullable = false, unique = true)
    private String model;

    @NotNull
    private DeviceTypes deviceType;

    @Getter
    private Date installationDate;

    @NotNull
    private DeviceStatus status;

    protected Device() {}

    /**
     * Create a new Device
     * @param command the command to create a new device
     * @see CreateDeviceCommand
     */
    public Device(CreateDeviceCommand command) {
        this.serialNumber = command.serialNumber();
        this.model = command.model();
        this.deviceType = DeviceTypes.valueOf(command.deviceType());
        this.installationDate = command.installationDate();
        this.status = DeviceStatus.valueOf(command.status());
    }

    public void update(UpdateDeviceCommand command) {
        this.model = command.model();
        this.deviceType = DeviceTypes.valueOf(command.deviceType());
        this.installationDate = command.installationDate();
        this.status = DeviceStatus.valueOf(command.status());
    }

    public String getDeviceType() {
        return deviceType.name();
    }

    public String getStatus() {
        return status.name();
    }
}
