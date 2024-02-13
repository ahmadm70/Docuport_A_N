package io.loop.utilities;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * This class is designed for reading properties file and sending data to source code
 * @author Ahmad
 */
public class ConfigurationReader {
    private static Properties properties;
    static {
        try {
            String path = "configuration.properties";
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);
            input.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}