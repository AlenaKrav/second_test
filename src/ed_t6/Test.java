/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_t6;

/**
 *
 * @author babka
 */
public class Test {

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double Total;
        if (numProductos > 3) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            Total = precioProducto * 0.8;
            System.out.println("El total a pagar es:" + Total);
            System.out.println("Enviado");
        } else {
            Total = precioProducto * 0.95;
            System.out.println("El total a pagar es:" + Total);
            System.out.println("Enviado");
        }
    }
}
