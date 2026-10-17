package com.viniciodiazav.practica.entidades;

public class Transaccion {
    
    private Integer id;
    private String titular;
    private Double monto;
    private Boolean esAprobada;

    public Transaccion(Integer id, String titular, Double monto, Boolean esAprobada) {
        this.id = id;
        this.titular = titular;
        this.monto = monto;
        this.esAprobada = esAprobada;
    }

    @Override
    public String toString() {
        return String.format("TX #%04d | Titular: %-18s | Monto: $%-10.2f | Estado: %s",         
                this.id,
                this.titular,
                this.monto,
                this.esAprobada ? "APROBADA" : "RECHAZADA");
    }
    
    
}
