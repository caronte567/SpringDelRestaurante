package com.SpringDonaArepa.controller;

import com.SpringDonaArepa.model.Cliente;
import com.SpringDonaArepa.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/nuevo")
    public Cliente newCliente(@RequestBody Cliente newCliente) {
        return this.clienteService.newCliente(newCliente);
    }

    @GetMapping("/mostrar")
    public Iterable<Cliente> getAll() {
    return clienteService.getAll();
    }

    @PostMapping("/modificar")
    public Cliente updateCliente(@RequestBody Cliente cliente) {
        return this.clienteService.modifyCliente(cliente);
    }

    @PostMapping (value = "/(Id)")
    public Boolean deleteMenu(@PathVariable(value ="Id") Long Id) {
        return this.clienteService.deleteCliente(Id);
    }
}
