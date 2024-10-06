# **Class Diagram**

This section outlines the class structure of the PhotoSharingApp. The design follows SOLID principles and implements the Facade Design Pattern to simplify interactions between subsystems.

## **Classes**

### **1. User**

Handles user-related operations such as registration, login, and following/unfollowing other users.

- **Attributes**:
    - `int id`: Unique identifier for each user.
    - `String username`: Username of the user.
    - `String email`: Email address of the user.
    - `String password`: User’s password.

- **Methods**:
    - `void register()`: Registers a new user.
    - `void login()`: Logs the user into the system.
    - `void followUser(User user)`: Follow another user.
    - `void unfollowUser(User user)`: Unfollow another user.

---

### **2. Photo**

Represents a photo uploaded by a user.

- **Attributes**:
    - `int id`: Unique identifier for each photo.
    - `String photoURL`: URL of the photo.
    - `String description`: Description of the photo.
    - `User owner`: The user who uploaded the photo.

- **Methods**:
    - `void uploadPhoto()`: Uploads a photo.
    - `void deletePhoto()`: Deletes a photo.
    - `void addTag(Tag tag)`: Adds a tag to the photo.
    - `void removeTag(Tag tag)`: Removes a tag from the photo.

---

### **3. Comment**

Represents a comment made by a user on a photo.

- **Attributes**:
    - `int id`: Unique identifier for each comment.
    - `Photo photo`: The photo on which the comment is made.
    - `User user`: The user who made the comment.
    - `String text`: The content of the comment.

- **Methods**:
    - `void addComment()`: Adds a comment to a photo.
    - `void deleteComment()`: Deletes a comment.

---

### **4. Like**

Represents a like made by a user on a photo.

- **Attributes**:
    - `int id`: Unique identifier for each like.
    - `Photo photo`: The photo that was liked.
    - `User user`: The user who liked the photo.

- **Methods**:
    - `void likePhoto()`: Likes a photo.
    - `void unlikePhoto()`: Unlikes a photo.

---

### **5. Tag**

Represents a tag that can be associated with a photo.

- **Attributes**:
    - `int id`: Unique identifier for each tag.
    - `String tagName`: The name of the tag.

- **Methods**:
    - `void createTag()`: Creates a new tag.
    - `void deleteTag()`: Deletes a tag.

---

### **6. PhotoSharingService (Facade)**

The **PhotoSharingService** class acts as a facade that simplifies the interaction between the user and underlying services (e.g., PhotoService, CommentService, LikeService). It hides the complexity of these services and provides a unified interface for common operations.

- **Methods**:
    - `void uploadPhoto(Photo photo)`: Uploads a photo using the PhotoService.
    - `void sharePhoto(Photo photo, User user)`: Shares a photo with another user.
    - `void addComment(Photo photo, Comment comment)`: Adds a comment to a photo using the CommentService.
    - `void likePhoto(Photo photo, User user)`: Likes a photo using the LikeService.
