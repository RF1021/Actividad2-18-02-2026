package org.example.view;

import org.example.model.Producto;

import java.util.List;

public class ProductoView {

    public void mostrarProducto(Producto producto) {
        if (producto == null) {
            System.out.println("Producto no encontrado.");
            return;
        }

        System.out.println("PRODUCTO");
        System.out.println("ID: " + producto.getId());
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
        System.out.println("Cantidad: " + producto.getCantidad());
    }

    public void mostrarLista(List<Producto> productos) {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
            return;
        }

        System.out.println(" INVENTARIO ");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
