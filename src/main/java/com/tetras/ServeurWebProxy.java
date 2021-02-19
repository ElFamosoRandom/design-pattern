package com.tetras;

public class ServeurWebProxy implements iServeurWeb {

    //Classe proxy qui permet de filtrer le evilURL, elle est appelé avant serveurweb
    //Si l'url est "evilurl" on retourne 403, sinon, on continue sur la méthode reponse de "ServeurWeb"
    ServeurWeb serveur = new ServeurWeb();
    @Override
    public int reponse(RequeteHttpComposite requete) {
        if (requete.getComposant(0).affiche() == "/evilurl"){
            return 403;
        }
        return serveur.reponse(requete);
    }
}