package org.example.controller;

import org.example.model.Producto;
import org.example.service.ProductoService;
import org.example.view.ProductoView;

import java.util.List;

public class ProductoController {

    private final ProductoService service;
    private final ProductoView view;

    public ProductoController(ProductoService service, ProductoView view) {
        this.service = service;
        this.view = view;
    }

    public Producto registrarProducto(String nombre, double precio, int cantidad) {
        Producto producto = service.registrarProducto(nombre, precio, cantidad);
        view.mostrarMensaje("Producto registrado correctamente.");
        return producto;
    }

    public void listarProductos() {
        List<Producto> productos = service.listarProductos();
        view.mostrarLista(productos);
    }

    public void buscarProducto(Long id) {
        try {
            Producto producto = service.buscarPorId(id);
            view.mostrarProducto(producto);
        } catch (IllegalArgumentException e) {
            view.mostrarMensaje(e.getMessage());
        }
    }

    public void modificarPrecio(Long id, double nuevoPrecio) {
        try {
            service.modificarPrecio(id, nuevoPrecio);
            view.mostrarMensaje("Precio actualizado correctamente.");
        } catch (IllegalArgumentException e) {
            view.mostrarMensaje(e.getMessage());
        }
    }

    public void modificarCantidad(Long id, int nuevaCantidad) {
        try {
            service.modificarCantidad(id, nuevaCantidad);
            view.mostrarMensaje("Cantidad actualizada correctamente.");
        } catch (IllegalArgumentException e) {
            view.mostrarMensaje(e.getMessage());
        }
    }

    public void eliminarProducto(Long id) {
        try {
            service.eliminarProducto(id);
            view.mostrarMensaje("Producto eliminado correctamente.");
        } catch (IllegalArgumentException e) {
            view.mostrarMensaje(e.getMessage());
        }
    }

}
