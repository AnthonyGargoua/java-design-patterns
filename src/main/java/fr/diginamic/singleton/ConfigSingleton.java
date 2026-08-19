package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class ConfigSingleton {

    private static ConfigSingleton instance;

    private ResourceBundle configuration;

    private ConfigSingleton() {
        configuration = ResourceBundle.getBundle("configuration");
        String valeur = configuration.getString("db.url");
        System.out.println(valeur);
    }

    public static ConfigSingleton getInstance() {
        if (instance == null) {
            instance = new ConfigSingleton();
        }
        return instance;
    }

    public String getString(String key) {
        return configuration.getString(key);
    }
}
