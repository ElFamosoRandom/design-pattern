package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class WebServerTest {
    
    @Test
    public void TestEvilUrl() {
        HashMap map = new HashMap<String,String>();

        map.put("testEvilUrl","test1");
        Header head = new Header(map);
        Body body = new Body("ATTENTION, JE VIENS HACK LE SITE");
        Url url = new Url("/evilurl");

        RequeteHttpComposite requeteEvil = new RequeteHttpComposite();
        requeteEvil.ajouter(url);
        requeteEvil.ajouter(head);
        requeteEvil.ajouter(body);

        iServeurWeb serv = new ServeurWebProxy();
        int responseResult;
        responseResult =  serv.reponse(requeteEvil);
        assertEquals(403, responseResult);
    }

    @Test
    public void TestGoodUrl() {
        HashMap map = new HashMap<String,String>();

        map.put("testUrlSuperSympa","test2");
        Header head = new Header(map);
        Body body = new Body("Je suis gentil, laisse moi passer");
        Url url = new Url("/SuperSympa");

        RequeteHttpComposite requeteSympa = new RequeteHttpComposite();
        requeteSympa.ajouter(url);
        requeteSympa.ajouter(head);
        requeteSympa.ajouter(body);

        iServeurWeb serv = new ServeurWebProxy();
        int responseResult;
        responseResult =  serv.reponse(requeteSympa);
        assertEquals(200, responseResult);
    }

    @Test
    public void TestNullUrl() {
        HashMap map = new HashMap<String,String>();

        map.put("testSasuke","test3");
        Header head = new Header(map);
        Body body = new Body("...");
        Url url = new Url(null);

        RequeteHttpComposite requeteSasuke = new RequeteHttpComposite();
        requeteSasuke.ajouter(url);
        requeteSasuke.ajouter(head);
        requeteSasuke.ajouter(body);

        iServeurWeb serv = new ServeurWebProxy();
        int responseResult;
        responseResult =  serv.reponse(requeteSasuke);
        assertEquals(500, responseResult);
    }

    @Test
    public void TestAffichage() {
        HashMap map = new HashMap<String,String>();

        map.put("testAffiche","test4");
        Header head = new Header(map);
        Body body = new Body("Contenu");
        Url url = new Url("/affiche");

        RequeteHttpComposite requetteAffiche = new RequeteHttpComposite();
        requetteAffiche.ajouter(url);
        requetteAffiche.ajouter(head);
        requetteAffiche.ajouter(body);

        String Result = requetteAffiche.affiche();
        assertEquals(Result,"/affiche{testAffiche=test4}Contenu");
    }
}