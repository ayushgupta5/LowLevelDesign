# Airline Service System

This is a low-level design for an Airline Service System following SOLID principles and appropriate design patterns.

## Key Classes

### 1. User (Base class for Customer, Admin, Staff)
- **Attributes**:
    - `userId`
    - `name`
    - `email`
    - `passwordHash`
- **Methods**:
    - `login()`
    - `logout()`

### 2. Customer (Inherits from User)
- **Attributes**:
    - `bookings[]`
- **Methods**:
    - `searchFlights()`
    - `bookFlight()`
    - `cancelBooking()`
    - `selectSeat()`

### 3. Admin (Inherits from User)
- **Attributes**: None
- **Methods**:
    - `addFlight()`
    - `updateFlight()`
    - `removeFlight()`
    - `viewSchedule()`

### 4. Flight
- **Attributes**:
    - `flightId`
    - `source`
    - `destination`
    - `departureTime`
    - `arrivalTime`
    - `price`
    - `seatsAvailable`
- **Methods**:
    - `updateFlightDetails()`
    - `checkAvailability()`

### 5. Booking
- **Attributes**:
    - `bookingId`
    - `flight`
    - `customer`
    - `seatNumber`
    - `bookingStatus`
- **Methods**:
    - `cancel()`
    - `confirm()`

### 6. Payment (Strategy Design Pattern for handling payments)
- **Attributes**:
    - `paymentId`
    - `amount`
    - `status`
- **Methods**:
    - `processPayment()`

### 7. Notification (Observer Design Pattern for notifying customers)
- **Attributes**:
    - `notificationType`
    - `message`
- **Methods**:
    - `sendNotification()`

## Design Patterns Used

1. **Strategy Pattern** for the Payment class, allowing different payment methods to be implemented (e.g., Credit Card, PayPal).
2. **Observer Pattern** for the Notification class, to send various types of notifications (e.g., email, SMS) to customers.

## SOLID Principles

1. **Single Responsibility Principle**: Each class has a single responsibility (e.g., `User` handles user-related functions, `Flight` handles flight details).
2. **Open/Closed Principle**: Classes are open for extension but closed for modification (e.g., new types of users or payments can be added without changing existing code).
3. **Liskov Substitution Principle**: Subclasses (e.g., `Customer`, `Admin`) can replace base classes (`User`) without altering the functionality.
4. **Interface Segregation Principle**: Interfaces like `PaymentGateway` are kept minimal and focused, separating responsibilities clearly.
5. **Dependency Inversion Principle**: Higher-level modules (`Booking`, `Flight`) do not depend on lower-level modules (e.g., `PaymentGateway` implementations), ensuring flexible, loosely coupled design.

## Getting Started

To run the project:

1. Clone the repository.
2. Follow the file structure:
    ```
    /src
       /models
          Flight.java
          Booking.java
          Payment.java
       /services
          FlightService.java
          PaymentService.java
       /main
          Main.java
    ```
3. Run the `Main.java` to execute the program with sample functionalities.

