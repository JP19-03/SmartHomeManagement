package com.smarthome.platform.upc.analytics.domain.model.aggregates;

import com.smarthome.platform.upc.analytics.domain.model.commands.CreatePerformanceIndicatorCommand;
import com.smarthome.platform.upc.shared.domain.model.valueobjects.DeviceTypes;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

/**
 * PerformanceIndicator
 * @summary
 * This class represents the PerformanceIndicator aggregate root entity.
 * It contains the information of a performance indicator.
 * @author Johan Principe Godoy u202014511
 * @version 1.0
 */
@Entity
public class PerformanceIndicator {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @NotBlank
    @Size(max = 40)
    private String name;

    @Getter
    @NotBlank
    @Size(max = 200)
    private String description;

    @Getter
    @NotNull
    private Double minValue;

    @Getter
    @NotNull
    private Double maxValue;

    @NotNull
    private DeviceTypes deviceType;

    protected PerformanceIndicator() {}

    /**
     * Create a new PerformanceIndicator
     * @param command the command to create a new performance indicator
     * @see CreatePerformanceIndicatorCommand
     */
    public PerformanceIndicator(CreatePerformanceIndicatorCommand command) {
        this.name = command.name();
        this.description = command.description();
        this.minValue = command.minValue();
        this.maxValue = command.maxValue();
        this.deviceType = DeviceTypes.valueOf(command.deviceType());
    }

    public String getDeviceType() {
        return deviceType.name();
    }
}
