package com.microservicio.demo.repositories;

import com.microservicio.demo.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}


