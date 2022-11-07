package com.poo.clases;

public class SmartPhone extends SmartDevice{

    //Atributos específicos de la clase hija.
    public String tipoCamara;
    public String colorProtector;
    public boolean vidrioTemplado;

    //Constructores
    public SmartPhone(){

    }

    public SmartPhone(String tipoCamara, String colorProtector, boolean vidrioTemplado) {
        this.tipoCamara = tipoCamara;
        this.colorProtector = colorProtector;
        this.vidrioTemplado = vidrioTemplado;
    }

    public SmartPhone(String fabricante, String modelo, String sistemaOperativo, int year, String tipoCamara, String colorProtector, boolean vidrioTemplado) {
        super(fabricante, modelo, sistemaOperativo, year);
        this.tipoCamara = tipoCamara;
        this.colorProtector = colorProtector;
        this.vidrioTemplado = vidrioTemplado;
    }


    //Métodos específicos.
    public void metodoCell(){
        System.out.println("Hola, soy un método específico de los SmartPhone.");
    }


    //Método toString()

    @Override
    public String toString() {
        return "CARACTERÍSTICAS DEL SMARTPHONE" +'\n'+
                "tipoCamara='" + tipoCamara + '\'' +
                ", colorProtector='" + colorProtector + '\'' +
                ", vidrioTemplado=" + vidrioTemplado +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", year=" + year ;
    }
}
