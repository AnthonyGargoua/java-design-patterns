package fr.diginamic.factory;

import fr.diginamic.entities.Element;
import fr.diginamic.entities.Ingredient;
import fr.diginamic.entities.Allergene;
import fr.diginamic.entities.Additif;
import fr.diginamic.enums.TypeElement;
import fr.diginamic.enums.UNITE;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryTest {

    @Test
    void testCreationIngredient(){
        Element element = ElementFactory.getElement(getElement.INGREDIENT, "Farine", 300.0, UNITE.MILLI_GRAMMES);

        assertTrue(element instanceof Ingredient);
        assertEquals("Farine"), element.getNom());
    }
}
