package com.smarthome.platform.upc.analytics.infrastructure.persistence.jpa.repositories;

import com.smarthome.platform.upc.analytics.domain.model.aggregates.PerformanceIndicator;
import com.smarthome.platform.upc.shared.domain.model.valueobjects.DeviceTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * PerformanceIndicator repository
 * @author Johan Principe Godoy u202014511
 * @version 1.0
 */
@Repository
public interface PerformanceIndicatorRepository extends JpaRepository<PerformanceIndicator, Long> {

    /**
     * Check if exists by device type
     * @param deviceType device type to check
     * @return true if exists, false otherwise
     */
    boolean existsByDeviceType(DeviceTypes deviceType);
}
