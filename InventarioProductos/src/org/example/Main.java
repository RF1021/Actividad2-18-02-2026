package org.example;

import org.example.controller.ProductoController;
import org.example.service.ProductoService;
import org.example.service.ProductoServiceImpl;
import org.example.view.ProductoView;

public class Main {

    public static void main(String[] args) {

        ProductoService service = new ProductoServiceImpl();
        ProductoView view = new ProductoView();
        ProductoController controller = new ProductoController(service, view);

        controller.registrarProducto("Laptop", 2500000, 5);
        controller.registrarProducto("Mouse", 50000, 20);
        controller.registrarProducto("Teclado", 120000, 10);

        controller.listarProductos();

        controller.buscarProducto(2L);

        controller.modificarPrecio(1L, 2300000);

        controller.modificarCantidad(3L, 15);

        controller.listarProductos();

        controller.eliminarProducto(2L);

        controller.listarProductos();
    }
}