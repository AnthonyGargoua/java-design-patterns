package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class Singleton {

    private static Singleton instance;

    private ResourceBundle configuration;

    private Singleton() {
        configuration = ResourceBundle.getBundle("configuration");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getString(String key) {
        return configuration.getString(key);
    }
}
