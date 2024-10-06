package Service.Route;

import Model.Route.Route;

public class RouteService implements IRouteService {
    @Override
    public void calculateRoute(Route route) {
        System.out.println("Calculating the Route : " +route.toString());
    }

    @Override
    public void getDirections(Route route) {
        System.out.println("getting the Directions from the Route : " + route.toString());
    }
}
