package Service.Follow;

import Model.Follow.Follow;

public class FollowService implements IFollowService {
    @Override
    public void follow(Follow follow) {
        System.out.println("User is Following : " +follow.toString());
    }

    @Override
    public void unfollow(Follow follow) {
        System.out.println("User is UnFollowing : " +follow.toString());
    }
}
