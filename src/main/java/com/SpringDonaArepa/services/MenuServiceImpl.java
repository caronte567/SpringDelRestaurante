package com.SpringDonaArepa.services;

import com.SpringDonaArepa.model.Menu;
import com.SpringDonaArepa.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuRepository menuRepository;
    @Override
    public Menu newMenu(Menu newMenu) {
        return menuRepository.save(newMenu);
    }

    @Override
    public Iterable<Menu> findAllMenu() {
        return this.menuRepository.findAll();
    }

    @Override
    public Menu modifyMenu(Menu menu) {

        Optional<Menu> menuEncontrado;
        menuEncontrado = this.menuRepository.findById(menu.getIdUser());
        if (menuEncontrado.get()!=null) {
            menuEncontrado.get().setNombreUser(menu.getNombreUser());
            menuEncontrado.get().setDescripcion(menu.getDescripcion());
            menuEncontrado.get().setPrecio(menu.getPrecio());
            return this.newMenu( menuEncontrado.get());
        }
        return null;
    }

    @Override
    public Boolean deleteMenu(Long IdUser) {
        this.menuRepository.deleteById(IdUser);
        return true;
    }

    @Override
    public Iterable<Menu> getAll() {
        return null;
    }
}
