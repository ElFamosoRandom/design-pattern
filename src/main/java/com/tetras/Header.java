package com.tetras;

import java.util.HashMap;

public class Header implements iAfficheComponent {

    HashMap<String, String> hashHeader = new HashMap<String,String>();

    @Override
    public String affiche() {
        return hashHeader.toString();
    }

    public Header(HashMap<String, String> hashHeader) {
        this.hashHeader = hashHeader;
    }


    
}