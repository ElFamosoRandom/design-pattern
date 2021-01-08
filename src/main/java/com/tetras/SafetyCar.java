package com.tetras;


public class SafetyCar {

    //SafetyCar est un singleton : il n'existe qu'une SafetyCar en course

    private static SafetyCar instance = new SafetyCar();
    
    private SafetyCar(){

    }

    public static SafetyCar getInstance(){
        return instance;
    }
}