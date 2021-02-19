package com.tetras;

public class ServeurWeb implements iServeurWeb{
    //Classe serveur web s'occupant des retour d'url
    @Override
    public int reponse(RequeteHttpComposite requete) {
        if (requete.getComposant(0).affiche() != null){
            return 200;
        }
        return 500;
    }
}