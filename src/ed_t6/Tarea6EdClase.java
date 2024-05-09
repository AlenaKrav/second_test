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
public class Tarea6EdClase {
    public static final double DISCOUNT_OTHER_CASES = 0.95;
    public static final double DISCOUNT_0_PRODUCT = 0.8;
    public static final int DISCOUNT_3_PRODUCTS = 5;

    public void aplicarDescuento(double precioProducto, int numProductos) {
//        double total;
//        if (numProductos > 3) {
//            precioProducto -= DISCOUNT_3_PRODUCTS;
//        }
//        if (numProductos != 0) {
//            total = precioProducto * DISCOUNT_0_PRODUCT;
//            System.out.println("El total a pagar es:" + total);
//            System.out.println("Enviado");
//        } else {
//            total = precioProducto * DISCOUNT_OTHER_CASES;
//            System.out.println("El total a pagar es:" + total);
//            System.out.println("Enviado");
//        }
//
//    }
//    
//        public void DiscountPrintout(double discount) {
//        double total;
//        total = precioProducto * DISCOUNT_0_PRODUCT;
//        System.out.println("El total a pagar es:" + total);
//        System.out.println("Enviado");

        double total;
        if (numProductos > 3) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            total = precioProducto * 0.8;
            System.out.println("El total a pagar es:" + total);
            System.out.println("Enviado");
        } else {
            total = precioProducto * 0.95;
            System.out.println("El total a pagar es:" + total);
            System.out.println("Enviado");
        }

        
    }

}
