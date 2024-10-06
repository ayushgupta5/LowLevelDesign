package Model.Restaurant;

import Model.Menu.Menu;

public class Restaurant {
    private int restaurantID;
    private String name;
    private String location;
    private Menu menu;
    private int rating;

    public Restaurant(int restaurantID, String name, String location, Menu menu, int rating) {
        this.restaurantID = restaurantID;
        this.name = name;
        this.location = location;
        this.menu = menu;
        this.rating = rating;
    }

    public int getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(int restaurantID) {
        this.restaurantID = restaurantID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantID=" + restaurantID +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", menu=" + menu +
                ", rating=" + rating +
                '}';
    }
}
