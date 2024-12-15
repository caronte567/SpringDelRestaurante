package com.SpringDonaArepa.services;

import com.SpringDonaArepa.model.Pedidos;
import com.SpringDonaArepa.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidosServiceImpl implements PedidosService {
    @Autowired
    private PedidosRepository pedidosRepository;
    @Override
    public Pedidos newPedidos(Pedidos newPedidos) {
        return pedidosRepository.save(newPedidos);
    }

    @Override
    public Iterable<Pedidos> findAllPedidos() {
        return this.pedidosRepository.findAll();
    }

    @Override
    public Pedidos modifyPedidos(Pedidos pedidos) {

        Optional<Pedidos> pedidosEncontrado;
        pedidosEncontrado = this.pedidosRepository.findById(pedidos.getIdUser());
        pedidosEncontrado.get().setCliente(pedidos.getCliente());
        pedidosEncontrado.get().setTotal(pedidos.getTotal());
        pedidosEncontrado.get().setFecha(pedidos.getFecha());
        return this.newPedidos( pedidosEncontrado.get());
    }

    @Override
    public Boolean deletePedidos(Long IdUser) {
        this.pedidosRepository.deleteById(IdUser);
        return true;
    }

    @Override
    public Iterable<Pedidos> getAll() {

        return null;
    }
}
