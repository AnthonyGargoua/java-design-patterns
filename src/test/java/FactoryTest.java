import fr.diginamic.entities.Additif;
import fr.diginamic.entities.Allergene;
import fr.diginamic.entities.Element;
import fr.diginamic.entities.Ingredient;
import fr.diginamic.enums.TypeElement;
import fr.diginamic.enums.UNITE;
import fr.diginamic.factory.ElementFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryTest {

    @Test
    void testCreationIngredient(){
        Element element = ElementFactory.getElement(TypeElement.INGREDIENT, "Farine", 300.0, UNITE.MILLI_GRAMMES);

        assertTrue(element instanceof Ingredient);
        assertEquals("Farine", element.getNom());
    }

    @Test
    void testCreationAllergene(){
        Element element = ElementFactory.getElement(TypeElement.ALLERGENE, "Gluten", 2.5, UNITE.MICRO_GRAMMES);

        assertTrue(element instanceof Allergene);
        assertEquals("Gluten", element.getNom());
    }

    @Test
    void testCreationAdditif(){
        Element element = ElementFactory.getElement(TypeElement.ADDITIF, "A450", 4.5, UNITE.MICRO_GRAMMES);

        assertTrue(element instanceof Additif);
        assertEquals("A450", element.getNom());
    }
}
