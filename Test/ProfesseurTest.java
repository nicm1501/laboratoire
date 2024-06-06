package Test;

import codeInitial.Professeur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfesseurTest {
    Professeur p1 = Professeur.getInstance("abcd1234", "Mr Professeur 1");
    Professeur p2 = Professeur.getInstance("bcde2345", "Mr Professeur 2");
    @Test
    void getInstance() {
        assertEquals(Professeur.getInstance("abcd1234", "Mr Professeur 1").getCip(), p1.getCip());
    }

    @Test
    void getCip() {
        assertEquals("abcd1234", p1.getCip());
    }

    @Test
    void getNom() {
        assertEquals("Mr Professeur 1", p1.getNom());
    }

    @Test
    void testToString() {
        System.out.println(p1.toString());
    }
}