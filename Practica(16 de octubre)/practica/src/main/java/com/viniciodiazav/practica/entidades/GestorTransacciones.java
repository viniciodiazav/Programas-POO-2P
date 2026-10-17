package com.viniciodiazav.practica.entidades;

import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorTransacciones {
    
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        List<Transaccion> transacciones = new ArrayList<>();
        String control = null;
        
        System.out.println("==================================================================================");
        System.out.println("                 SISTEMA DE GESTIÓN DE TRANSACCIONES BANCARIAS");
        System.out.println("==================================================================================");
        
        do {
            System.out.println("\n--- Captura de Transacción ---");
            
            System.out.print("Ingrese el ID de transacción: ");
            Integer id = s.nextInt();
            s.nextLine();
            
            System.out.print("Ingrese nombre completo del titular: ");
            String titular = s.nextLine().trim();
            
            System.out.print("Ingrese el monto a transferir: ");
            String montoString = s.nextLine();
            Double monto = Double.valueOf(montoString);
            
            System.out.print("¿Transacción autorizada? (S/N): ");
            Character autorizada = Character.toUpperCase(s.nextLine().charAt(0));
         
            Boolean esAprobada = autorizada.equals('S');
            
            Transaccion t = new Transaccion(id, titular, monto, esAprobada);
            transacciones.add(t);
            
            System.out.print("\n¿Desea registrar otra transacción? (S/N): ");
            control = String.valueOf(s.nextLine().charAt(0)).toUpperCase();
            
        } while (control.equals("S"));
        s.close();
        System.out.println("\nCerrando lector de entrada y generando reporte...\n");
        
        System.out.println("==================================================================================");
        System.out.println("                             HISTORIAL DE OPERACIONES");
        System.out.println("==================================================================================");
        
        for (int i = 0; i < transacciones.size(); i++) {
            System.out.println(transacciones.get(i));
        }
        System.out.println("==================================================================================");
        
    }
    
}
