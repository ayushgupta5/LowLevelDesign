package Service.Route;

import Model.Route.Route;

public interface IRouteService {
    void calculateRoute(Route route);
    void getDirections(Route route);
}
