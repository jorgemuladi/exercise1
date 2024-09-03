package org.example;

public class NameInitial {
    public static String getInitial(String fullName) {
        String[] names = fullName.split(" ");
        StringBuilder initial = new StringBuilder();
        for (String name : names) {
            if (!name.isEmpty()) {
                initial.append(Character.toUpperCase(name.charAt(0)));
            }
        }
        return initial.toString();
    }
}
