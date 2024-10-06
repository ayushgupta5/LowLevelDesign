
### Key Classes and Their Responsibilities

1. **User**
    - Attributes:
        - `userId`: Unique identifier for the user.
        - `username`: Username chosen by the user.
        - `password`: Encrypted password for user authentication.
        - `email`: User's email address.
    - Methods:
        - `register()`: Registers a new user into the system.
        - `login()`: Authenticates the user based on their credentials.
        - `follow()`: Allows a user to follow another user.
        - `unfollow()`: Allows a user to unfollow another user.
        - `sendMessage()`: Sends a private message to another user.

2. **Tweet**
    - Attributes:
        - `tweetId`: Unique identifier for a tweet.
        - `userId`: ID of the user who posted the tweet.
        - `content`: The content of the tweet.
        - `createdAt`: Timestamp of when the tweet was created.
    - Methods:
        - `create()`: Creates a new tweet.
        - `like()`: Allows a user to like a tweet.
        - `retweet()`: Allows a user to retweet someone else’s tweet.

3. **Message**
    - Attributes:
        - `messageId`: Unique identifier for a message.
        - `senderId`: ID of the user who sent the message.
        - `receiverId`: ID of the user who receives the message.
        - `content`: Content of the message.
        - `sentAt`: Timestamp of when the message was sent.
    - Methods:
        - `send()`: Sends a private message between users.

4. **Follow**
    - Attributes:
        - `followerId`: ID of the user who is following.
        - `followedId`: ID of the user being followed.
    - Methods:
        - `follow()`: Follows a specific user.
        - `unfollow()`: Unfollows a specific user.

## Design Patterns

- **Factory Pattern**: Used for creating instances of users in a standardized way, isolating the instantiation logic into the `UserFactory`.
- **Dependency Injection**: Applied through service layers like `UserService`, which handle authentication and registration.

## SOLID Principles

- **Single Responsibility Principle**: Each class has a single responsibility (e.g., `User` handles user-related functionality, `Tweet` handles tweet-related functionality).
- **Open/Closed Principle**: Classes are open for extension but closed for modification. New features (e.g., quote retweets) can be added without modifying existing classes.
- **Liskov Substitution Principle**: Objects of a superclass should be replaceable with objects of a subclass without altering the correctness of the program. Here, we can extend the functionality of `User` if needed, and it won’t break the core logic.
- **Interface Segregation Principle**: The `AuthService` interface provides necessary methods for registration and login, ensuring that implementing classes don’t have to include unnecessary methods.
- **Dependency Inversion Principle**: Higher-level modules like `UserService` depend on abstractions (e.g., interfaces) rather than concrete implementations.

