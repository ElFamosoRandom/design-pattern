package com.tetras;

import java.util.ArrayList;
import java.util.List;

public class RequeteHttpComposite implements iAfficheComponent {

    private Body body;
    private Url path;
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

    public iAfficheComponent getComposant(int id){
        return(iAfficheComponent) component.get(id);
    }
    

    /**
     * @return Body return the body
     */
    public Body getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(Body body) {
        this.body = body;
    }

    /**
     * @return Url return the url
     */
    public Url getUrl() {
        return path;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(Url Path) {
        this.path = Path;
    }

}