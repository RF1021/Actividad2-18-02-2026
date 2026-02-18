package org.example.service;

import org.example.model.Producto;

import java.util.List;

public interface ProductoService {

    Producto registrarProducto(String nombre, double precio, int cantidad);

    List<Producto> listarProductos();

    Producto buscarPorId(Long id);

    void modificarPrecio(Long id, double nuevoPrecio);

    void modificarCantidad(Long id, int nuevaCantidad);

    void eliminarProducto(Long id);
}
