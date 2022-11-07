package com.poo.clases;

public abstract class SmartDevice {
    //atributos
    public String fabricante;
    public String modelo;
    public String sistemaOperativo;
    public int year;

    //Constructores
    public SmartDevice(){

    }
    public SmartDevice(String fabricante,String modelo,String sistemaOperativo,int year){
        this.fabricante=fabricante;
        this.modelo=modelo;
        this.sistemaOperativo=sistemaOperativo;
        this.year=year;
    }

    //Métodos
    public void cargarBateria(){
        System.out.println("Cargando batería...");
    }
    public void recibirLlamada(){
        System.out.println("Recibiendo llamada.");
    }
}
