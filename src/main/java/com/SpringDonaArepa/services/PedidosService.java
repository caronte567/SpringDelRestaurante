package com.SpringDonaArepa.services;

import com.SpringDonaArepa.model.Pedidos;

public interface PedidosService {
    Pedidos newPedidos (Pedidos newPedidos);
    Iterable<Pedidos> findAllPedidos();
    Pedidos modifyPedidos (Pedidos pedidos);
    Boolean deletePedidos (Long idUser);

    Iterable<Pedidos> getAll();
}
