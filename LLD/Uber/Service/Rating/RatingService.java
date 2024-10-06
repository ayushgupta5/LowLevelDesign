package Service.Rating;

import Model.Rating.Rating;

public class RatingService implements IRatingService {
    @Override
    public void provideFeedback(Rating rating) {
        System.out.println("Providing the feedback with raing: " + rating.toString());
    }
}
