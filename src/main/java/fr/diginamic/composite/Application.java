package fr.diginamic.composite;

public class Application {
    public static void main(String[] args) {

        Service dsin = new Service("DSIN");
        Employe e1 = new Employe("RASPEY", "Cécile", 10000.0);
        Employe e2 = new Employe("BECHKAR", "Bilel", 8000.0);

        Service bigData = new Service("Big Data");
        Employe e3 = new Employe("RANMEY", "JB", 7500.0);
        Employe e4 = new Employe("DOE", "Jane", 3500.0);

        Service javaDev = new Service("Java Dev");
        Employe e5 = new Employe("GUINEAU", "Kevin", 7500.0);
        Employe e6 = new Employe("MARTIN", "Paul", 3500.0);

        dsin.addElement(e1, e2, bigData, javaDev);
        bigData.addElement(e3, e4);
        javaDev.addElement(e5, e6);

        System.out.println("Salaire total DSIN : " + dsin.calculerSalaire());
    }
}