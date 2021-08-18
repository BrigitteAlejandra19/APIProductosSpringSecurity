package com.example.apiproductosspringsecurity.producto;

import javax.persistence.*;

@Entity
@Table(name="productos")
public class Producto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer producto_id;
    private String nombre;
    private Double precio;

    public Producto() {
    }

    public Producto(Integer producto_id, String nombre, Double precio) {
        this.producto_id = producto_id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(Integer produto_id) {
        this.producto_id = produto_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "produto_id=" + producto_id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
