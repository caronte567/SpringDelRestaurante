package com.SpringDonaArepa.services;

import com.SpringDonaArepa.model.Menu;

public interface MenuService {
    Menu newMenu (Menu newMenu);
    Iterable<Menu> findAllMenu();
    Menu modifyMenu (Menu menu);
    Boolean deleteMenu (Long idUser);

    Iterable<Menu> getAll();
}
