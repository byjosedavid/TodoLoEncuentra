package org.example;

import java.time.LocalDate;

public class Tipo5 extends Abstract {
    private Double porcentajeDescuento = 0d;
    private Double precioBruto;
    private Double cantidadIva;
    private Double descuentoTipo;
    private Double precioFinal;

    // Método para mostrar los datos.
    public void showInfo() {
        System.out.println("  -    -  ");
        System.out.println("  -    -  ");
        System.out.println("  -    -  ");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Registro Invima: " + getRegistroInvima());
        System.out.println("Fabricante: " + getFabricante());
        System.out.println("Fecha de vencimiento: " + getFechaVencimiento());
        System.out.println("Fecha de fabricación: " + getFechaFabricacion());
        System.out.println("Precio unitario: " + getPrecioUnitario());
        System.out.println("Precio bruto: " + precioBruto);
        System.out.println("Descuento: " + descuentoTipo);
        System.out.println("Iva: " + cantidadIva);
        System.out.println("Precio final: " + precioFinal);
    }
    @Override
    public Double calcularBruto(int cantidad) {
        this.precioBruto = getPrecioUnitario() * cantidad;
        return precioBruto;
    }

    @Override
    public Double calcularIva() {
        this.cantidadIva = precioBruto * getPorcentajeIva();
        return cantidadIva;
    }

    @Override
    public Double calcularDescuento() {
        this.descuentoTipo = precioBruto * porcentajeDescuento;
        return descuentoTipo;
    }

    @Override
    public Double calcularFinal() {
        this.precioFinal = precioBruto - descuentoTipo + cantidadIva;
        return precioFinal;
    }

    public Tipo5(String nombre, Double precioUnitario, String registroInvima, String fabricante, LocalDate fechaVencimiento, LocalDate fechaFabricacion) {
        super(nombre, precioUnitario, registroInvima, fabricante, fechaVencimiento, fechaFabricacion);
    }
}