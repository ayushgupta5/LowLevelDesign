package Service.Map;

import Model.Map.Map;
import Model.Place.Place;
import Model.Route.Route;

public class MapService implements IMapService {
    @Override
    public void getInstance(Map map) {
        System.out.println("Getting the instance of the Map : " +map.toString());
    }

    @Override
    public void searchPlace(Place place) {
        System.out.println("Searching the Place in the Map : " +place.toString());
    }

    @Override
    public void getRoute(Route route) {
        System.out.println("Getting the Route : " +route.toString());
    }

    @Override
    public void renderMap(Map map) {
        System.out.println("Rendering the Map : " +map.toString());
    }
}
