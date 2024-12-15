package com.SpringDonaArepa.services;

import com.SpringDonaArepa.model.Cliente;

public interface ClienteService {
    Cliente newCliente (Cliente newCliente);
    Iterable<Cliente> findAllClientes();
    Cliente modifyCliente (Cliente cliente);
    Boolean deleteCliente (Long idUser);

    Iterable<Cliente> getAll();
}
