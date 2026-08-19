package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement {

    private String nom;
    private List<IElement> elements = new ArrayList<>();

    public Service(String nom) {
        this.nom = nom;
    }

    public void addElement(IElement... elements) { // méthode qui prend un nomrbe x de paramètre
        for (IElement elt : elements) {
            this.elements.add(elt);
        }
    }

    @Override
    public double calculerSalaire() {

        double somme = 0.0;
        for (IElement element : elements) {
            somme += element.calculerSalaire();
        }
        return somme;
    }

    public String getNom() {
        return nom;
    }
}