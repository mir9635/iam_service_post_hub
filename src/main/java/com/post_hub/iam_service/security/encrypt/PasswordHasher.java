package com.post_hub.iam_service.security.encrypt;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordHasher {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String first_password = encoder.encode("Test1");
        String second_password = encoder.encode("Teat2");
        String third_password = encoder.encode("Test3");

        System.out.println("Hashed first_passwor: " + first_password);
        System.out.println("Hashed second_password: " + second_password);
        System.out.println("Hashed third_passwor: " + third_password);
    }
}
