package org.example;

import java.time.LocalDate;

public abstract class Abstract {
    private String nombre;
    private Double precioUnitario;
    private String registroInvima;
    private String fabricante;
    private LocalDate fechaVencimiento;
    private LocalDate fechaFabricacion;
    private final Double porcentajeIva = 0.19;

    public abstract Double calcularBruto(int cantidad);

    public abstract Double calcularIva();

    public abstract Double calcularDescuento();

    public abstract Double calcularFinal();



    public Abstract() {
    }

    public Abstract(String nombre, Double precioUnitario, String registroInvima, String fabricante, LocalDate fechaVencimiento, LocalDate fechaFabricacion) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.registroInvima = registroInvima;
        this.fabricante = fabricante;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getRegistroInvima() {
        return registroInvima;
    }

    public void setRegistroInvima(String registroInvima) {
        this.registroInvima = registroInvima;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public Double getPorcentajeIva() {
        return porcentajeIva;
    }
}