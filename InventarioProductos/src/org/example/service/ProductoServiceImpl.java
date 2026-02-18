package org.example.service;

import org.example.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoServiceImpl implements ProductoService {

    private List<Producto> productos = new ArrayList<>();

    @Override
    public Producto registrarProducto(String nombre, double precio, int cantidad) {
        Producto producto = new Producto(nombre, precio, cantidad);
        productos.add(producto);
        return producto;
    }

    @Override
    public List<Producto> listarProductos() {
        return new ArrayList<>(productos);
    }

    @Override
    public Producto buscarPorId(Long id) {
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        throw new IllegalArgumentException("Producto no encontrado con id: " + id);
    }

    @Override
    public void modificarPrecio(Long id, double nuevoPrecio) {
        Producto producto = buscarPorId(id);
        producto.setPrecio(nuevoPrecio);
    }

    @Override
    public void modificarCantidad(Long id, int nuevaCantidad) {
        Producto producto = buscarPorId(id);
        producto.setCantidad(nuevaCantidad);
    }

    @Override
    public void eliminarProducto(Long id) {
        Producto producto = buscarPorId(id);
        productos.remove(producto);
    }


}
