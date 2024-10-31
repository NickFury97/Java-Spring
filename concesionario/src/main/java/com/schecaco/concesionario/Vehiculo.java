package com.schecaco.concesionario;

public class Vehiculo {

    private String num_matricula;
    private String modelo;
    private Decimal precioAlquiler;

    public Vehiculo (String num_matricula, String modelo, Decimal precioAlquiler){
        this.num_matricula = num_matricula;
        this.modelo = modelo;
        this.precioAlquiler = precioAlquiler;
    }

    public String getNum_matricula(){
        this.num_matricula = num_matricula;
    }

    public String setNum_matricula(){
        return num_matricula;
    }

    public String getModelo(){
        this.modelo = modelo;
    }

    public String setModelo(){
        return modelo;
    }

    public Decimal getPrecioAlquiler(){
        this.precioAlquiler = precioAlquiler;
    }

    public Decimal setPrecioAlquiler(){
        return precioAlquiler;
    }

    @Override
    public String toString(){
        return "Número de matrícula: " + num_matricula + ", Modelo: " + modelo + ", Precio alquiler: " + precioAlquiler;
    }
}