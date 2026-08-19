import fr.diginamic.singleton.ConfigSingleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    void getInstanceJamaisNull() {
        ConfigSingleton instance = ConfigSingleton.getInstance();
        assertNotNull(instance);
    }

    @Test
    void getInstanceToujoursLaMemeInstance() {
        ConfigSingleton instance = ConfigSingleton.getInstance();
        ConfigSingleton instancev2 = ConfigSingleton.getInstance();
        assertSame(instance, instancev2);
    }


    @Test
    void getInstanceBonneValeur() {
        ConfigSingleton instance = ConfigSingleton.getInstance();
        String valeur = instance.getString("db.url");
        assertEquals("jdbc:mysql://localhost:3306/mabase", valeur);
    }
}
