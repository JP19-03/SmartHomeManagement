package com.smarthome.platform.upc.shared.infrastructure.persistence.jpa.repositories;

import com.smarthome.platform.upc.shared.domain.model.entities.DeviceType;
import com.smarthome.platform.upc.shared.domain.model.valueobjects.DeviceTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The device type repository.
 * @summary
 * This interface is a Spring Data JPA repository that provides methods to access the device type data in the database.
 * @author Johan Principe Godoy u202014511
 * @version 1.0
 */
@Repository
public interface DeviceTypeRepository extends JpaRepository<DeviceType, Long> {

    /**
     * Check if a device type exists by name.
     *
     * @param name The device type name.
     * @return True if the device type exists, false otherwise.
     */
    boolean existsByName(DeviceTypes name);
}
