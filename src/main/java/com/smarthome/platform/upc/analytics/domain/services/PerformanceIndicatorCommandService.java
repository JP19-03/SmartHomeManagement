package com.smarthome.platform.upc.analytics.domain.services;

import com.smarthome.platform.upc.analytics.domain.model.aggregates.PerformanceIndicator;
import com.smarthome.platform.upc.analytics.domain.model.commands.CreatePerformanceIndicatorCommand;

import java.util.Optional;

/**
 * This interface represents the service that handles the commands related to the {@link PerformanceIndicator} entity.
 * @author Johan Principe Godoy u202014511
 * @version 1.0
 */
public interface PerformanceIndicatorCommandService {

    /**
     * Handles the command to create a new performance indicator.
     * @param command the command to create a new performance indicator containing the necessary data.
     * @return an optional containing the created performance indicator if the operation was successful, otherwise an empty optional.
     */
    Optional<PerformanceIndicator> handle(CreatePerformanceIndicatorCommand command);
}
