package com.jack.common;

import java.util.UUID;

public class UUIDUtil {

    /**
     * Generates a 6-digit UUID.
     *
     * @return A 6-character string from a UUID.
     */
    public static String generate6DigitUUID() {
        // Generate a full UUID and take the first 6 characters from it
        String uuid = UUID.randomUUID().toString().replace("-", "");  // Remove hyphens
        return uuid.substring(0, 6);  // Return only the first 6 characters
    }

    public static void main(String[] args) {
        // Example usage
        String sixDigitUUID = generate6DigitUUID();
        System.out.println("Generated 6-digit UUID: " + sixDigitUUID);
    }
}
