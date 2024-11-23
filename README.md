# SmartHomeManagement Platform

## Overview

The **SmartHomeManagement** platform provides a solution for managing and monitoring smart home devices. It enables users to efficiently control their devices via a web application, utilizing a robust RESTful API backend built with Java 22 and Spring Boot 3. The platform supports multiple device types such as lighting, heating, and security systems, along with performance indicators to track the efficiency and health of devices.

## Features

- **Device Management**: Add, update, and manage smart devices.
- **Performance Indicators**: Track and monitor performance metrics for devices.
- **Pre-populated Device Types**: A table with device types (Lighting, Heating, Security) is populated at the start of the application.
- **REST API**: Expose endpoints to interact with devices and performance indicators.
- **Persistent Data**: Data is stored in a relational database (MySQL).

## Requirements

- Java 22
- Spring Boot 3
- MySQL Database
- Lombok for convenience
- OpenAPI for documentation

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/smarthomemanagement.git
2. Navigate into the project folder:
   ```bash
   cd smarthomemanagement
3. Set up your MySQL database with the schema `smarthome`.

4. Build the project:
   ./mvnw clean install

5. Run the application:
   ./mvnw spring-boot:run

API Endpoints
-------------
### Devices

- **POST** `/api/v1/devices`: Add a new device
- **PUT** `/api/v1/devices/{id}`: Update an existing device

### Performance Indicators

- **POST** `/api/v1/performance-indicators`: Add a new performance indicator

Exception Handling
------------------
- **DeviceAlreadyExistsException**: Thrown if a device with the same serial number already exists.
- **InvalidPerformanceIndicatorRangeException**: Thrown if the minValue is greater than the maxValue.

Architecture
------------
- **Inventory**: Manages devices.
- **Analytics**: Handles performance indicators.
- **Shared**: Common shared entities like DeviceType.

License
-------
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

Acknowledgements
----------------
- Spring Boot 3 for the backend framework.
- Lombok for simplifying Java code.
- MySQL for data persistence.
- OpenAPI for documentation.
