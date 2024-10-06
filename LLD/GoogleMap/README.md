# Google Maps-like Application

This project is a simple implementation of a Google Maps-like application with core functionalities like place searching, route calculation, map rendering, user location tracking using GPS, and traffic information. The system follows SOLID principles and implements design patterns such as Singleton, Observer, and Strategy.

## Table of Contents
1. [Overview](#overview)
2. [Functionalities](#functionalities)
3. [Class Diagram](#class-diagram)
4. [Technologies Used](#technologies-used)
5. [Design Principles & Patterns](#design-principles--patterns)
6. [File Structure](#file-structure)
7. [Setup & Installation](#setup--installation)
8. [Usage](#usage)

## Overview
This application is designed to demonstrate the architecture of a simple map-based service where users can:
- Search for places by name or coordinates
- Get route directions between two locations
- Render a map and allow zooming and panning
- Track real-time location using GPS
- Receive traffic updates

The project follows object-oriented principles with a focus on clean architecture, maintainability, and extendability.

## Functionalities
1. **Search for Places**: Allows users to search for places by name or address.
2. **Route Calculation**: Provides optimal routes and directions from one place to another.
3. **Map Rendering**: Renders a map interface with zoom and pan functionalities.
4. **Location Tracking**: Tracks user location in real-time using GPS.
5. **Traffic Information**: Provides real-time traffic data to users.

## Class Diagram

### 1. Place

| Attributes          | Description                         |
|---------------------|-------------------------------------|
| `id`                | Unique identifier of the place      |
| `name`              | Name of the place                   |
| `latitude`          | Latitude of the place               |
| `longitude`         | Longitude of the place              |
| `address`           | Address of the place                |

| Methods             | Description                         |
|---------------------|-------------------------------------|
| `getDetails()`      | Returns the name and address of the place |
| `getCoordinates()`  | Returns the coordinates (latitude, longitude) |

---

### 2. User

| Attributes          | Description                         |
|---------------------|-------------------------------------|
| `id`                | Unique identifier for the user      |
| `name`              | Name of the user                    |
| `currentLocation`    | Current location (coordinates)      |

| Methods             | Description                         |
|---------------------|-------------------------------------|
| `updateLocation()`  | Updates the current location of the user |
| `getLocation()`     | Returns the current location        |

---

### 3. MapService (Singleton Pattern)

| Attributes          | Description                         |
|---------------------|-------------------------------------|
| `instance`          | Singleton instance of the service   |

| Methods             | Description                         |
|---------------------|-------------------------------------|
| `getInstance()`     | Returns the singleton instance      |
| `searchPlace()`     | Searches for a place by name        |
| `getRoute()`        | Calculates a route between two places |
| `renderMap()`       | Renders the map with zoom and pan   |

---

### 4. Route

| Attributes          | Description                         |
|---------------------|-------------------------------------|
| `startPlace`        | Starting place of the route         |
| `endPlace`          | Ending place of the route           |
| `distance`          | Distance between start and end places |
| `estimatedTime`     | Estimated time to travel the route  |

| Methods             | Description                         |
|---------------------|-------------------------------------|
| `calculateRoute()`  | Calculates the optimal route        |
| `getDirections()`   | Provides directions from start to end |

---

### 5. GPS (Observer Pattern)

| Attributes          | Description                         |
|---------------------|-------------------------------------|
| `latitude`          | Latitude of the current location    |
| `longitude`         | Longitude of the current location   |

| Methods             | Description                         |
|---------------------|-------------------------------------|
| `subscribe(User user)` | Subscribes a user to GPS location updates |
| `unsubscribe(User user)` | Unsubscribes a user from GPS location updates |
| `notifyUsers()`     | Notifies subscribed users of the updated location |

---

### 6. TrafficInfo (Strategy Pattern)

| Attributes          | Description                         |
|---------------------|-------------------------------------|
| `trafficStatus`     | Current traffic status (e.g., heavy, moderate) |
| `place`             | Place for which the traffic info applies |

| Methods             | Description                         |
|---------------------|-------------------------------------|
| `getTrafficInfo()`  | Retrieves traffic information for a place |
| `updateTrafficInfo()` | Updates the traffic information for a place |

---

## Technologies Used

- **Java**: Primary programming language for the application.
- **Design Patterns**: Singleton, Observer, and Strategy patterns are used.
- **SOLID Principles**: Applied throughout the design for better maintainability and scalability.

## Design Principles & Patterns

- **Single Responsibility Principle**: Each class is responsible for only one thing (e.g., `Place` handles place information, `Route` handles route logic).
- **Open/Closed Principle**: Classes are open for extension but closed for modification (e.g., `MapService` can be extended with additional features without modifying the core structure).
- **Liskov Substitution Principle**: Derived classes can be substituted for their base class (e.g., `TrafficInfo` uses different strategies to fetch traffic).
- **Interface Segregation Principle**: Clients should not be forced to depend on methods they do not use (e.g., interfaces like `TrafficStrategy` are small and specific).
- **Dependency Inversion Principle**: High-level modules do not depend on low-level modules but on abstractions (e.g., `TrafficStrategy` abstraction).

- **Singleton Pattern**: Used in `MapService` to ensure there is only one instance handling map-related functionality.
- **Observer Pattern**: Implemented in `GPS` to notify users of real-time location updates.
- **Strategy Pattern**: Applied in `TrafficInfo` to enable different traffic data retrieval strategies.


