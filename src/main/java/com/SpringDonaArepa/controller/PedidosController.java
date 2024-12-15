package com.SpringDonaArepa.controller;

import com.SpringDonaArepa.model.Pedidos;
import com.SpringDonaArepa.services.PedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {
    @Autowired
    private PedidosService pedidosService;

    @PostMapping("/nuevo")
    public Pedidos newPedidos(@RequestBody Pedidos newPedidos) {
        return this.pedidosService.newPedidos(newPedidos);
    }

    @GetMapping("/mostrar")
    public Iterable<Pedidos> getAll() {
    return pedidosService.getAll();
    }

    @PostMapping("/modificar")
    public Pedidos updatePedidos(@RequestBody Pedidos pedidos) {
        return this.pedidosService.modifyPedidos(pedidos);
    }

    @PostMapping (value = "/(Id)")
    public Boolean deletePedidos(@PathVariable(value ="Id") Long Id) {
        return this.pedidosService.deletePedidos(Id);
    }
}
