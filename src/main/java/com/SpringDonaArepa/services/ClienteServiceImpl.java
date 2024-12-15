package com.SpringDonaArepa.services;

import com.SpringDonaArepa.model.Cliente;
import com.SpringDonaArepa.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public Cliente newCliente(Cliente newCliente) {
        return clienteRepository.save(newCliente);
    }

    @Override
    public Iterable<Cliente> findAllClientes() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Cliente modifyCliente(Cliente cliente) {

        Optional<Cliente> clienteEncontrado;
        clienteEncontrado = this.clienteRepository.findById(cliente.getIdUser());
        if (clienteEncontrado.get()!=null) {
            clienteEncontrado.get().setNombreUser(cliente.getNombreUser());
            clienteEncontrado.get().setTelefono(cliente.getTelefono());
            clienteEncontrado.get().setEmail(cliente.getEmail());
            return this.newCliente( clienteEncontrado.get());
        }
        return null;
    }

    @Override
    public Boolean deleteCliente(Long IdUser) {
        this.clienteRepository.deleteById(IdUser);
        return true;
    }

    @Override
    public Iterable<Cliente> getAll() {
        return null;
    }
}
