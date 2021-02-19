package com.tetras;

import java.util.ArrayList;
import java.util.List;

public class RequeteHttpComposite implements iAfficheComponent {

    //Classe Requete pour le design pattern composite : on ajoute des component dans le composite pour ensuite correctement les afficher
    private List<iAfficheComponent> component = new ArrayList<iAfficheComponent>();
    String result ="";

    @Override
    public String affiche() {
        component.stream().forEach(t -> result = result + t.affiche());
        return result ;
    }

    public void ajouter(iAfficheComponent components){
        component.add(components);
    }

    //Methode getComposant permettant essentiellement de récupérer l'id de l'élément lors de l'affichage
    public iAfficheComponent getComposant(int id){
        return(iAfficheComponent) component.get(id);
    }
}