package com.tetras;

public class ServeurWeb {
    
    public int reponse(RequeteHttpComposite requete){
        if (requete.getUrl().getPath() != null){
            return 200;
        }
        return 500;
    }
}