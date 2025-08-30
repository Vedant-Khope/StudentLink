package com.studentlink.studentlink.features.authentication.utilities;


import org.springframework.stereotype.Component;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;


//Class use for hide the password details in the database with the concept hashing
@Component
public class Encoder {

    public String encode(String rawString){
        try {
            MessageDigest digest =MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(rawString.getBytes());
            return Base64.getEncoder().encodeToString(hash);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error encoding string", e);
        }
    }

    public boolean matches(String rawString, String encodedString){
        return encode(rawString).equals(encodedString);
    }
}
