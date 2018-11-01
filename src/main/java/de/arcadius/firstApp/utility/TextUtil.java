package de.arcadius.firstApp.utility;

public class TextUtil {

    public String sanitize(String text) {
        return text.replaceAll("\\s+", " ");
    }
}
