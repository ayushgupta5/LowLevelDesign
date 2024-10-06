package Service.Place;

import Model.Place.Place;

public class PlaceService implements IPlaceService {

    @Override
    public void getDetails(Place place) {
        System.out.println("Getting the Details of the Place : " +  place.toString());
    }

    @Override
    public void getCoordinates(Place place) {
        System.out.println("Getting the Co-Ordinates of the Place : " + place.toString());
    }
}
