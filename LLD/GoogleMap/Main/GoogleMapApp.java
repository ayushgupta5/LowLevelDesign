package Main;

import Model.GPS.GPS;
import Model.Map.Map;
import Model.Place.Place;
import Model.Route.Route;
import Model.Traffic.Traffic;
import Model.User.User;
import Service.GPS.GPSService;
import Service.GPS.IGPSService;
import Service.Map.IMapService;
import Service.Map.MapService;
import Service.Place.IPlaceService;
import Service.Place.PlaceService;
import Service.Route.IRouteService;
import Service.Route.RouteService;
import Service.Traffic.ITrafficService;
import Service.Traffic.TrafficService;
import Service.User.IUserService;
import Service.User.UserService;

public class GoogleMapApp {
    public static void main(String[] args) {
        Place place = new Place(1, "Varanasi", "latitude", "longitude", "Varanasi");
        User user = new User(1, "Ayush", "Varanasi");
        Map map = new Map("Varanasi");
        Route route = new Route("Varanasi", "BLR", 2000.00, 40.50);
        GPS gps = new GPS("latitude", "longitude");
        Traffic traffic = new Traffic("Clear", "Varanasi");

        IPlaceService placeService = new PlaceService();
        placeService.getCoordinates(place);
        placeService.getDetails(place);

        IUserService userService = new UserService();
        userService.getLocation(user);
        userService.updateLocation(user);

        IMapService mapService = new MapService();
        mapService.getInstance(map);
        mapService.searchPlace(place);
        mapService.getRoute(route);
        mapService.renderMap(map);

        IRouteService routeService = new RouteService();
        routeService.getDirections(route);
        routeService.calculateRoute(route);

        IGPSService gpsService = new GPSService();
        gpsService.subscribe(user);
        gpsService.unsubscribe(user);
        gpsService.notifyUsers(user);

        ITrafficService trafficService = new TrafficService();
        trafficService.getTrafficInfo(traffic);
        trafficService.updateTrafficInfo(traffic);
    }
}
