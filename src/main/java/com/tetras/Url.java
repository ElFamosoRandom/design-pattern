package com.tetras;

public class Url implements iAfficheComponent {

    //Classe body pour l'élément body de la requête
    private String path;

	/**
     * @return String return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    public Url(String Path) {
        this.path = Path;
	}

    
    @Override
    public String affiche() {
        return path;
    }

}