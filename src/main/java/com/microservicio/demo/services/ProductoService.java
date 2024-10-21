package com.microservicio.demo.services;

import com.microservicio.demo.models.Producto;
import com.microservicio.demo.repositories.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;
    
    public List<Producto> getAllProductos(){
        return productoRepository.findAll();
    }
    
    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }
}

