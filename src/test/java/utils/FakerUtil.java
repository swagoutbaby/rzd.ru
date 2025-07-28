package utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerUtil {

    private static final Faker faker = new Faker(new Locale("en-US"));

    public static String generatePhoneNumber() {
        return faker.number().digits(11).replaceFirst("\\d", "+7"); //корректный номер телефона
    }

    public static String generateInvalidPhoneNumber() {
        return faker.number().digits(9); // Номер телефона с 9 цифрами (некорректный)
    }

    public static String generateEmail() {
        return faker.internet().emailAddress();
    }

    public static String generateInvalidEmail() {
        return faker.internet().emailAddress().replace("@", ""); // Некорректный email без '@'
    }

    public static String generatePassword() {
        return faker.internet().password(8, 10) + "-"; // Пароль длиной от 8 до 10 символов
    }

    public static String generateInvalidPassword() {
        return faker.internet().password(1, 8); // Пароль длиной менее 8 символов
    }

    public static String generateLogin() {
        String firstName = faker.name().firstName(); // Логин
        String lastName = faker.name().lastName();
        return firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase() + "mcgee";
    }

    public static String generateInvalidLogin() {
        String firstName = faker.name().firstName(); // Некорректный логин
        String lastName = faker.name().lastName();
        String login = firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase();
        return login.substring(0, 2);
    }

    public static String generateFirstName() {
        // Генерация имени
        return faker.name().firstName();
    }
    public static String generateInvalidFirstName() {
        // Генерация некорректного имени
        return faker.number().digits(5);
    }

    public static String generateLastName() {
        // Генерация фамилии
        return faker.name().lastName();
    }

    public static String generateInvalidLastName() {
        // Генерация некорректной фамилии
        return faker.number().digits(5);
    }
}