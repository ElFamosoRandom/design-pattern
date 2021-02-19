package com.tetras;

public class ServeurWeb implements iServeurWeb{
    
    @Override
    public int reponse(RequeteHttpComposite requete) {
        if (requete.getComposant(0).affiche() != null){
            System.out.println(200);
            return 200;
        }
        System.out.println(500);
        return 500;
    }
}