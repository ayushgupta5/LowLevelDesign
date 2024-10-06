# Tournament Leaderboard System

## Overview

The **Tournament Leaderboard** system is designed to manage tournament data, track player scores, and generate a leaderboard based on the performance of players in different types of tournaments (knockout, league, etc.). The system follows SOLID principles and uses the **Strategy** design pattern to handle score calculation based on the tournament type.

## Functionalities

1. **Create Tournament**: Administrators can create a new tournament.
2. **Add Players**: Players can be added to a tournament.
3. **Track Scores**: Scores are tracked and updated after each match.
4. **Display Leaderboard**: The leaderboard shows the ranking of players based on their scores.
5. **End Tournament**: Final leaderboard displayed when the tournament ends.

## Non-Functional Requirements

1. **Real-time Updates**: Leaderboard must reflect score changes immediately.
2. **Scalable**: The system can manage multiple tournaments with a large number of players.
3. **Concurrency**: Supports concurrent score updates without corruption.
4. **Security**: Only authorized users can manage tournaments and update scores.
5. **Consistency**: Data should remain consistent even in concurrent environments.

## Class Diagram

The class diagram follows the **SOLID** design principles and **Strategy Pattern** for score calculation.

### Classes:

1. **Tournament**
    - **Attributes**: `id`, `name`, `type`, `startDate`, `endDate`
    - **Methods**: `addPlayer()`, `startTournament()`, `endTournament()`

2. **Player**
    - **Attributes**: `id`, `name`, `email`
    - **Methods**: `getDetails()`, `updateScore()`

3. **Match**
    - **Attributes**: `player1`, `player2`, `score1`, `score2`
    - **Methods**: `playMatch()`, `updateScores()`

4. **Leaderboard**
    - **Attributes**: `players` (List of Players), `rankings`
    - **Methods**: `updateRankings()`, `displayLeaderboard()`

5. **ScoreCalculator (Interface)**
    - **Methods**: `calculateScore()`

6. **KnockoutScoreCalculator (Implements ScoreCalculator)**
    - **Methods**: `calculateScore()`

7. **LeagueScoreCalculator (Implements ScoreCalculator)**
    - **Methods**: `calculateScore()`

### Diagram:

