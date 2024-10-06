package Service.Map;

import Model.Map.Map;
import Model.Place.Place;
import Model.Route.Route;

public interface IMapService {
    void  getInstance(Map map);
    void searchPlace(Place place);
    void getRoute(Route route);
    void renderMap(Map map);
}
