package singleton;

import fr.diginamic.singleton.Singleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    void getInstanceJamaisNull() {
        Singleton instance = Singleton.getInstance();
        assertNotNull(instance);
    }

    @Test
    void getInstanceToujoursLaMemeInstance() {
        Singleton instance = Singleton.getInstance();
        Singleton instancev2 = Singleton.getInstance();
        assertSame(instance, instancev2);
    }


    @Test
    void getInstanceBonneValeur() {
        Singleton instance = Singleton.getInstance();
        String valeur = instance.getString("db.url");
        assertEquals("jdbc:mysql://localhost:3306/mabase", valeur);
    }
}
