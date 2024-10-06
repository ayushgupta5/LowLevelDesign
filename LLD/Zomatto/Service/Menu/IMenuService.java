package Service.Menu;

import Model.MenuItem.MenuItem;

public interface IMenuService {
    void addItem(MenuItem menuItem);
    void removeItem(MenuItem menuItem);
}
