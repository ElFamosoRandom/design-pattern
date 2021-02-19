package com.tetras;

public class ServeurWebProxy implements iServeurWeb {

    ServeurWeb test = new ServeurWeb();
    @Override
    public int reponse(RequeteHttpComposite requete) {
        if (requete.getComposant(0).affiche() == "/evilurl"){
            System.out.println(403);
            return 403;
        }
        return test.reponse(requete);
    }
}