package Service.Place;

import Model.Place.Place;

public interface IPlaceService {
    void getDetails(Place place);
    void getCoordinates(Place place);
}
