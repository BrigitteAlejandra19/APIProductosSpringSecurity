package com.example.apiproductosspringsecurity.producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/productos")
public class ProductoCotroller {

    private final ProductoService productoService;

    @Autowired
    public ProductoCotroller(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("detalles")
    public List<Producto> getProductos(){
    return productoService.getProductos();
    }

    @GetMapping("nombres")
    public List<String> getNombreProductos(){
        return productoService.getNombreProductos();
    }

}
