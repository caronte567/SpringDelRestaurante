package com.SpringDonaArepa.controller;

import com.SpringDonaArepa.model.Menu;
import com.SpringDonaArepa.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @PostMapping("/nuevo")
    public Menu newMenu(@RequestBody Menu newMenu) {
        return this.menuService.newMenu(newMenu);
    }

    @GetMapping("/mostrar")
    public Iterable<Menu> getAll() {
    return menuService.getAll();
    }

    @PostMapping("/modificar")
    public Menu updateMenu(@RequestBody Menu menu) {
        return this.menuService.modifyMenu(menu);
    }

    @PostMapping (value = "/(Id)")
    public Boolean deleteMenu(@PathVariable(value ="Id") Long Id) {
        return this.menuService.deleteMenu(Id);
    }
}
