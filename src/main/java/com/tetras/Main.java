package com.tetras;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        
        HashMap map = new HashMap<String,String>();

        map.put("test","test2");
        Header head = new Header(map);
        Body body = new Body("Content");
        Url url = new Url("/test");

        
        
        RequeteHttpComposite test = new RequeteHttpComposite();
        test.ajouter(url);
        test.ajouter(head);
        test.ajouter(body);

        //iServeurWeb serv = new ServeurWebProxy();
        //serv.reponse(test);

        System.out.println(test.affiche());
    
    }
}
