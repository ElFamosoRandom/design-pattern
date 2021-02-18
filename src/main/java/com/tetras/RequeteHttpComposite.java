package com.tetras;

public class RequeteHttpComposite implements iAfficheComponent {

    private Body body;
    private Url path;


    @Override
    public String affiche() {
        return path.getPath();
    }

    public void ajouter(){
        //A remplir
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