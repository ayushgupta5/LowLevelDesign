# IRCTC Ticket Booking System

## Overview
This project is a simplified implementation of the Indian Railway Catering and Tourism Corporation (IRCTC) ticket booking system. It includes functionalities for user registration, train search, seat booking, payment processing, and ticket cancellation.

## Functionalities
- User registration and login
- Search for trains
- Check seat availability
- Book tickets and make payments
- Cancel booked tickets
- Generate and view PNR status

## Class Diagram
The following classes represent the core components of the system:

### 1. User
- **Attributes**:
    - `userId`: Unique identifier for the user
    - `username`: The user's name
    - `email`: User's email address
    - `phoneNumber`: User's phone number
    - `password`: User's password for authentication
- **Methods**:
    - `register()`: Registers a new user
    - `login()`: Authenticates the user
    - `viewPNRStatus()`: Displays the current status of the PNR
    - `cancelTicket()`: Cancels a booked ticket

### 2. Train
- **Attributes**:
    - `trainId`: Unique identifier for the train
    - `trainName`: The name of the train
    - `sourceStation`: The starting station of the train
    - `destinationStation`: The ending station of the train
    - `departureTime`: Scheduled departure time
    - `arrivalTime`: Scheduled arrival time
- **Methods**:
    - `searchTrain()`: Searches for trains based on the source and destination
    - `checkAvailability()`: Checks the seat availability for the train

### 3. Booking
- **Attributes**:
    - `bookingId`: Unique identifier for the booking
    - `pnrNumber`: Passenger Name Record number
    - `userId`: Identifier for the user who booked the ticket
    - `trainId`: Identifier for the train
    - `bookingDate`: Date of booking
    - `status`: Current status of the booking (e.g., confirmed, waiting)
- **Methods**:
    - `bookTicket()`: Books a ticket for the user
    - `generatePNR()`: Generates a unique PNR for the booking
    - `cancelTicket()`: Cancels the booking

### 4. Payment
- **Attributes**:
    - `paymentId`: Unique identifier for the payment
    - `bookingId`: Identifier for the associated booking
    - `paymentMethod`: Method used for payment (e.g., credit card, net banking)
    - `transactionId`: Unique identifier for the payment transaction
    - `amount`: Amount paid for the booking
    - `status`: Status of the payment (e.g., successful, failed)
- **Methods**:
    - `makePayment()`: Processes the payment
    - `processRefund()`: Initiates a refund for the booking

### 5. Seat
- **Attributes**:
    - `seatId`: Unique identifier for the seat
    - `trainId`: Identifier for the associated train
    - `classType`: Class of the seat (e.g., First Class, Sleeper)
    - `availability`: Availability status of the seat (e.g., available, booked)
- **Methods**:
    - `updateAvailability()`: Updates the availability status of the seat

