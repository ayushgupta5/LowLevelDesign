package Service.Menu;

import Model.MenuItem.MenuItem;

public class MenuService implements  IMenuService {
    @Override
    public void addItem(MenuItem menuItem) {
        System.out.println("Adding the Menu Item : " +menuItem.toString());
    }

    @Override
    public void removeItem(MenuItem menuItem) {
        System.out.println("Removing the Menu Item : " +menuItem.toString());
    }
}
