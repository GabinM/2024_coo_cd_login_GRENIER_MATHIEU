package test;

import XML.ChargeurMagasin;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

class TestChargeur {


    @Test
    public void test_01_chargervalide() throws FileNotFoundException{
        ChargeurMagasin c = new ChargeurMagasin("./musicbrainzSimple/");
        c.chargerMagasin();
    }

    @Test
    public  void test_02_chargerinvalide() throws Exception{
        boolean raised = true;
        try{
            ChargeurMagasin c = new ChargeurMagasin("./musiqueCerveauSimple");
            c.chargerMagasin();
        } catch (Exception e){
            System.out.println("erreur déclenchée avec succès");
            raised = false;
        }
        if(raised){
            System.out.println("hoyya");
            throw new Exception("erreur : pas d'erreur");
        }
    }

}