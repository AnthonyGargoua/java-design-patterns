package fr.diginamic.factory;

import fr.diginamic.entities.Additif;
import fr.diginamic.entities.Allergene;
import fr.diginamic.entities.Element;
import fr.diginamic.entities.Ingredient;
import fr.diginamic.enums.TypeElement;
import fr.diginamic.enums.UNITE;

public class ElementFactory {

    public static Element getElement(TypeElement typeElement, String nom, double valeur, UNITE unite) {

        switch (typeElement) {
            case INGREDIENT:
                return new Ingredient(nom, valeur, unite);
            case ALLERGENE:
                return new Allergene(nom, valeur, unite);
            case ADDITIF:
                return new Additif(nom, valeur, unite);
            default:
                throw new IllegalArgumentException("Le typeElement n'est pas un element : " + typeElement);
        }
    }
}
