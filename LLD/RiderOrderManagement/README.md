# Rider Order Management System

## Overview

The **Rider Order Management System** is designed to manage and assign delivery orders to riders based on their availability and location. The system tracks order status, rider location, and allows for real-time updates of the order delivery process. It adheres to SOLID principles and implements design patterns like Repository and Observer for better maintainability and scalability.

## Key Classes and Responsibilities

### 1. `Order`

Represents a customer's order, containing details like the pickup location, dropoff location, and current order status.

```plaintext
+---------------------+
|      Order          |
+---------------------+
| - id: int           |
| - pickupLocation: Point  |
| - dropoffLocation: Point |
| - status: OrderStatus    |
+---------------------+
| + updateStatus()    |
+---------------------+


+---------------------+
|      Rider          |
+---------------------+
| - id: int           |
| - name: String      |
| - status: RiderStatus|
| - currentLocation: Point |
+---------------------+
| + setStatus()       |
+---------------------+
