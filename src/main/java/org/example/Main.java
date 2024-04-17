package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> cats = new HashMap<>();

        cats.put("Nyanta", "Abyssinian");
        cats.put("Sasami", "American Shorthair");
        cats.put("Jyarashi", "Persian");
        cats.put("Buchi", "Siamese");
        cats.put("Mokomoko", "British Shorthair");

        cats.entrySet().stream()
                .filter(entry -> entry.getKey().equals("Mokomoko"))
                .forEach(entry -> System.out.println(entry.getKey() + "'s breed of cat is an " + entry.getValue() + "."));
    }
}
