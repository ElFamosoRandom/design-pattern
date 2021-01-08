package com.tetras;

public class CarFactory {

    //Car Factory va servir à instancier les Voiture, et à créer soit une Ferrari, soit une Mercedes, soit une Renault

    public static VoitureDuChampionnatDeFormuleUn getVoitureDeCourse(CarType type) {
        if (CarType.Ferrari.equals(type))
            return new Ferrari();
        else if (CarType.Mercedes.equals(type))
            return new Mercedes();
        else if(CarType.Renault.equals(type))
            return new Renault();
        else
            throw new IllegalArgumentException();
    }
}