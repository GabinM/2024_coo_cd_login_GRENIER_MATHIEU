package test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import XML.ChargeurCD;
import XML.ChargeurMagasin;
import donnees.ComparateurAlbum;
import donnees.ComparateurArtiste;
import donnees.Magasin;

public class TestTri {
    
    @Test
    public void test_0_trinormalAlbum() throws FileNotFoundException, IOException{
        ChargeurMagasin c = new ChargeurMagasin("./musicbrainzSimple/");
        
        Magasin m = c.chargerMagasin();

        m.trier(new ComparateurAlbum());
        /*for(int i = 0; i < m.getNombreCds(); i++){
            System.out.println(m.getCd(i).getTitre());
        }*/
        

        if (!(m.getCd(0).getTitre().equals("Believe") && m.getCd(m.getNombreCds()-1).getTitre().equals("Whitney Houston") )){
            throw new Error("Ordre incorrect");
        }
    }

    @Test
    public void test_0_trinormalArtiste() throws FileNotFoundException, IOException{
        ChargeurMagasin c = new ChargeurMagasin("./musicbrainzSimple/");
        
        Magasin m = c.chargerMagasin();

        m.trier(new ComparateurArtiste());
        /*for(int i = 0; i < m.getNombreCds(); i++){
            System.out.println(m.getCd(i).getTitre());
        }*/
        

        if (!(m.getCd(0).getTitre().equals("Bénabar") && m.getCd(m.getNombreCds()-1).getTitre().equals("Essence ordinaire") )){
            throw new Error("Ordre incorrect");
        }
    }

}
