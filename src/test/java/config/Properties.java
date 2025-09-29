package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Properties {

    public String getLoginRZD() {
        java.util.Properties prop = new java.util.Properties();
        try (InputStream input = new FileInputStream("config.properties")) {
            prop.load(input);
            return prop.getProperty("loginRZD");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("java/config/Properties -> getLoginRZD() -> FileInputStream не смог найти файл config.properties");
            return null;
        }
    }
    public String getPasswordRZD() {
        java.util.Properties prop = new java.util.Properties();
        try (InputStream input = new FileInputStream("config.properties")) {
            prop.load(input);
            return prop.getProperty("passwordRZD");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("java/config/Properties -> getPasswordRZD() -> FileInputStream не смог найти файл config.properties");
            return null;
        }
    }

    public String getFioRZD() {
        java.util.Properties prop = new java.util.Properties();
        try (InputStream input = new FileInputStream("config.properties")) {
            prop.load(input);
            return prop.getProperty("fioRZD");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("java/config/Properties -> getFioRZD() -> FileInputStream не смог найти файл config.properties");
            return null;
        }
    }
}