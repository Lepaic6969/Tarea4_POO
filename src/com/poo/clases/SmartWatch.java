package com.poo.clases;

public class SmartWatch extends SmartDevice{
    //Atributos específicos de la clase hija
    public String materialCorrea;
    public boolean tecnologiaIoT;


    //Constructores

    public SmartWatch(){

    }
    public SmartWatch(String materialCorrea, boolean tecnologiaIoT) {
        this.materialCorrea = materialCorrea;
        this.tecnologiaIoT = tecnologiaIoT;
    }

    public SmartWatch(String fabricante, String modelo, String sistemaOperativo, int year, String materialCorrea, boolean tecnologiaIoT) {
        super(fabricante, modelo, sistemaOperativo, year);
        this.materialCorrea = materialCorrea;
        this.tecnologiaIoT = tecnologiaIoT;
    }


    //Métodos específicos.
    public int validarHorasDescanso(){
        return 8;
    }
    public int calcularFrecuenciaCardiaca(){
        System.out.println("Calculando frecuencia cardiaca...");
        return 70;
    }

    //Método toString()

    @Override
    public String toString() {
        return "CARACTERÍSTICAS SMARTWATCH: " +'\n'+
                "materialCorrea='" + materialCorrea + '\'' +
                ", tecnologiaIoT=" + tecnologiaIoT +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", year=" + year;
    }
}
