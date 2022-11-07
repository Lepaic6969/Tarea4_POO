package com.poo.main;

import com.poo.clases.SmartDevice;
import com.poo.clases.SmartPhone;
import com.poo.clases.SmartWatch;

public class Main {
    public static void main(String[] args) {
        SmartDevice cell1=new SmartPhone("Huawei","Y9","Android",2016,"Cámara Inteligente","Azul",true);
        SmartDevice cell2=new SmartPhone();
        SmartDevice watch1=new SmartWatch("Iphone","T500","iOS",2020,"Cuero",true);
        SmartDevice watch2=new SmartWatch();

        //Características de los 2 dispositivos.
        //NOTA: Se hace el uso del método toString en cada una de las clases hijas para facilitar la salida por consola.
        System.out.println("**********************************");
        System.out.println(cell1);
        System.out.println("**********************************");
        System.out.println(cell2);
        System.out.println("**********************************");
        System.out.println(watch1);
        System.out.println("**********************************");
        System.out.println(watch2);



    }
}
