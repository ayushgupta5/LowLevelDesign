package Service.Friend;

import Model.Friend.Friend;

public interface IFriendService {
    void sendRequest(Friend friend);
    void acceptRequest(Friend friend);
    void rejectRequest(Friend friend);
    void unfriend(Friend friend);
}
