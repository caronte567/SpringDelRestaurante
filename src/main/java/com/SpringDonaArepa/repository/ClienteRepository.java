package com.SpringDonaArepa.repository;

import com.SpringDonaArepa.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
