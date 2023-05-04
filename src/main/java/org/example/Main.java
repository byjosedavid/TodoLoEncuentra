package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grupo;
        int cantidad;
        String nombre;
        Double precioUnitario;
        String registroInvima;
        String fabricante;
        LocalDate fechaVencimiento;
        LocalDate fechaFabricacion;

        Double precioBruto;
        Double descuentoTotal;
        Double ivaTotal;
        Double precioFinal;

        do {
            System.out.println("Ingrese el tipo de medicamento (1 - 5): ");
            grupo = sc.nextInt();
        } while (!(grupo >= 1 && grupo <= 5
        ));
        System.out.println("Ingrese el nombre del medicamento: ");
        nombre = sc.next();
        System.out.println("Ingrese el precio unitario: ");
        precioUnitario = sc.nextDouble();
        System.out.println("Ingrese el registro Invima: ");
        registroInvima = sc.next();
        System.out.println("Ingrese el fabricante: ");
        fabricante = sc.next();
        System.out.println("Ingrese la cantidad: ");
        cantidad = sc.nextInt();

        switch (grupo) {
            case 1 -> {
                Tipo1 dato = new Tipo1(nombre, precioUnitario, registroInvima, fabricante, LocalDate.of(2024, 3, 30), LocalDate.now());
                precioBruto = dato.calcularBruto(cantidad);
                descuentoTotal = dato.calcularDescuento();
                ivaTotal = dato.calcularIva();
                precioFinal = dato.calcularFinal();
                dato.showInfo();

            }
            case 2 -> {
                Tipo2 dato = new Tipo2(nombre, precioUnitario, registroInvima, fabricante, LocalDate.of(2024, 3, 30), LocalDate.now());
                precioBruto = dato.calcularBruto(cantidad);
                descuentoTotal = dato.calcularDescuento();
                ivaTotal = dato.calcularIva();
                precioFinal = dato.calcularFinal();
                dato.showInfo();

            }
            case 3 -> {
                Tipo3 dato = new Tipo3(nombre, precioUnitario, registroInvima, fabricante, LocalDate.of(2024, 3, 30), LocalDate.now());
                precioBruto = dato.calcularBruto(cantidad);
                descuentoTotal = dato.calcularDescuento();
                ivaTotal = dato.calcularIva();
                precioFinal = dato.calcularFinal();
                dato.showInfo();
            }
            case 4 -> {
                Tipo4 dato = new Tipo4(nombre, precioUnitario, registroInvima, fabricante, LocalDate.of(2024, 3, 30), LocalDate.now());
                precioBruto = dato.calcularBruto(cantidad);
                descuentoTotal = dato.calcularDescuento();
                ivaTotal = dato.calcularIva();
                precioFinal = dato.calcularFinal();
                dato.showInfo();

            }
            case 5 -> {
                Tipo5 dato = new Tipo5(nombre, precioUnitario, registroInvima, fabricante, LocalDate.of(2024, 3, 30), LocalDate.now());
                precioBruto = dato.calcularBruto(cantidad);
                descuentoTotal = dato.calcularDescuento();
                ivaTotal = dato.calcularIva();
                precioFinal = dato.calcularFinal();
                dato.showInfo();

            }
        }

    }
}