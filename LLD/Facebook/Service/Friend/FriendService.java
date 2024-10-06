package Service.Friend;

import Model.Friend.Friend;

public class FriendService implements IFriendService {
    @Override
    public void sendRequest(Friend friend) {
        System.out.println("Sending the Friend Request : " +friend.toString());
    }

    @Override
    public void acceptRequest(Friend friend) {
        System.out.println("Accept the Request : " + friend.toString());
    }

    @Override
    public void rejectRequest(Friend friend) {
        System.out.println("Rejecting the Request : " +friend.toString());
    }

    @Override
    public void unfriend(Friend friend) {
        System.out.println("Unfriend the Friend : " + friend.toString());
    }
}
