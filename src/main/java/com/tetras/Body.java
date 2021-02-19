package com.tetras;

public class Body implements iAfficheComponent {

    //Classe body pour l'élément body de la requête
    private String content;

    /**
     * @return String return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    public Body(String Content){
        this.content = Content;
    }

    @Override
    public String affiche() {
        return content;
    }

}