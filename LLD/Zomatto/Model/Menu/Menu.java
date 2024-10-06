package Model.Menu;

import Model.MenuItem.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private int menuID;
    private List<MenuItem> menuItems;

    public Menu(int menuID) {
        this.menuID = menuID;
        this.menuItems = new ArrayList<>();
    }

    public int getMenuID() {
        return menuID;
    }

    public void setMenuID(int menuID) {
        this.menuID = menuID;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuID=" + menuID +
                ", menuItems=" + menuItems +
                '}';
    }
}
