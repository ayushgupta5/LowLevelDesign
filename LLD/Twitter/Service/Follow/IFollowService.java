package Service.Follow;

import Model.Follow.Follow;

public interface IFollowService {
    void follow(Follow follow);
    void unfollow(Follow follow);
}
