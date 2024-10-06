# Dream11 Fantasy Sports Platform

This project is a low-level design and implementation of a fantasy sports platform like **Dream11**. The platform allows users to register, create teams, join contests, and compete based on real-life player performances.

## Table of Contents
- [Overview](#overview)
- [Functional Requirements](#functional-requirements)
- [Non-Functional Requirements](#non-functional-requirements)
- [Use Case Diagram](#use-case-diagram)
- [Database Schema](#database-schema)
- [Class Diagram](#class-diagram)
- [Design Patterns](#design-patterns)
- [Running the Code](#running-the-code)
- [Technologies Used](#technologies-used)
- [License](#license)

## Overview

The platform is designed following SOLID principles and leverages design patterns such as **Factory** and **Observer** to ensure scalability, extensibility, and maintainability. The system allows users to register, create teams, participate in contests, and win rewards based on the performance of players in real matches.

## Functional Requirements

1. **User Authentication & Profile Management**:
    - Users can register, login, and manage their profile (wallet, personal info).

2. **Create & Join Contests**:
    - Users can create and join contests for specific matches.
    - Contests can be public or private.

3. **Team Creation**:
    - Users select players for their fantasy teams, adhering to budget and role restrictions.

4. **Scoring System**:
    - Points are awarded based on real-life player performances.

5. **Wallet & Payments**:
    - Users can add and withdraw funds.
    - Contest entry fees are handled via a secure payment system.

6. **Leaderboard & Rewards**:
    - A leaderboard shows rankings based on team points.
    - Winners receive rewards based on contest rules.

## Non-Functional Requirements

- **Scalability**: Designed to handle high traffic during popular sports events.
- **Performance**: Real-time score updates and leaderboard management.
- **Security**: Uses secure authentication and payment processing.
- **Availability**: The system is highly available with minimal downtime.
- **Extensibility**: Easily supports multiple sports and contest types.
- **Maintainability**: Follows SOLID principles, ensuring clean, modular code.

## Use Case Diagram

![Use Case Diagram](use_case_diagram.png)

## Database Schema

### Key Tables:
- **User**: Stores user data.
- **Contest**: Stores contest-related data.
- **Team**: Stores user team information.
- **Player**: Stores player information for each match.
- **Payment**: Stores payment transactions.

Refer to `db_schema.sql` for detailed table structure.

## Class Diagram

### Key Entities

1. **User**
    - Attributes: `userId`, `username`, `passwordHash`, `walletBalance`
    - Methods: `register()`, `login()`, `logout()`, `addFunds()`, `withdrawFunds()`

2. **Contest**
    - Attributes: `contestId`, `match`, `entryFee`, `prizePool`, `contestType`
    - Methods: `createContest()`, `joinContest()`, `calculateLeaderboard()`

3. **Team**
    - Attributes: `teamId`, `user`, `players[]`
    - Methods: `addPlayer()`, `removePlayer()`, `validateTeam()`

4. **Player**
    - Attributes: `playerId`, `playerName`, `role`, `points`
    - Methods: `getPoints()`

5. **Match**
    - Attributes: `matchId`, `sportType`, `startTime`, `endTime`
    - Methods: `scheduleMatch()`, `updateScore()`

6. **Payment**
    - Attributes: `paymentId`, `amount`, `transactionType`, `user`
    - Methods: `processPayment()`

### Class Diagram with SOLID Principles

1. **Single Responsibility Principle (SRP)**:
    - Each class has only one responsibility:
        - The `User` class handles user-related activities (register, login, wallet operations).
        - The `Contest` class handles contest-related operations (create, join, leaderboard).
        - The `Team` class manages user teams and validations.

2. **Open-Closed Principle (OCP)**:
    - Classes like `Match` and `Contest` are open for extension but closed for modification. You can extend the `Contest` class to add new contest types without changing the base logic.
    - `Match` can be extended for different sports.

3. **Liskov Substitution Principle (LSP)**:
    - Subtypes (like `PublicContest`, `PrivateContest`) can replace their base type `Contest` without breaking the system behavior.

4. **Interface Segregation Principle (ISP)**:
    - Separate interfaces can be used for user operations, contest operations, and payment operations.

5. **Dependency Inversion Principle (DIP)**:
    - High-level modules like the `Contest` class should not depend on low-level modules such as `Payment`. Instead, abstractions (interfaces) should be used for dependency injection.


## Design Patterns

### 1. **Factory Pattern**:
Used to create different types of contests (public, private) based on user input.

### 2. **Observer Pattern**:
Used to notify users of score updates during live matches.

## Running the Code

### Prerequisites:
- Java 11+
- Maven (for dependency management)
- IDE (IntelliJ, Eclipse, etc.)
