/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.tetras;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FormulaOneTest {
    //Test Renault
    @Test
    void RenaultTest() {
        VoitureDuChampionnatDeFormuleUn Ren1 = CarFactory.getVoitureDeCourse(CarType.Renault);
        Renault RenColor = new Renault();
        String color = RenColor.getCouleur();

        assertEquals(color,"Bleu");
        assertTrue(Ren1 instanceof Renault);
    }

    //Test Mercedes
    @Test
    void MercedesTest() {
        VoitureDuChampionnatDeFormuleUn Merc1 = CarFactory.getVoitureDeCourse(CarType.Mercedes);
        Mercedes MercedesColor = new Mercedes();
        String color = MercedesColor.getCouleur();

        assertEquals(color,"Noir");
        assertTrue(Merc1 instanceof Mercedes);
    }

    //Test Ferrari
    @Test
    void FerrariTest() {
        VoitureDuChampionnatDeFormuleUn Ferr1 = CarFactory.getVoitureDeCourse(CarType.Ferrari);
        Ferrari FerrariColor = new Ferrari();
        String color = FerrariColor.getCouleur();

        assertEquals(color,"Rouge");
        assertTrue(Ferr1 instanceof Ferrari);
    }

    //Test SafetyCar
    @Test
    void SafetyCarTest(){
        SafetyCar sf1 = SafetyCar.getInstance();
        SafetyCar sf2 = SafetyCar.getInstance();
        assertEquals(sf1,sf2);
    }


}
