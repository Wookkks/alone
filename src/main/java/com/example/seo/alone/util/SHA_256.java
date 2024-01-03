package com.example.seo.alone.util;

import org.springframework.stereotype.Component;

import java.nio.charset.Charset;
import java.security.MessageDigest;

@Component("SHA_256")
public class SHA_256 {

    public String encrypt(String plainText) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(plainText.getBytes(Charset.forName("UTF-8")));
            byte byteData[] = md.digest();

            StringBuffer buffer = new StringBuffer();
            for(int i = 0; i < byteData.length; i++) {
                buffer.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }

            StringBuffer hexString = new StringBuffer();
            for(int i = 0; i < byteData.length; i++) {
                String hex = Integer.toHexString(0xff & byteData[i]);
                if(hex.length() == 1) {
                    hexString.append(0);
                }
                hexString.append(hex);
            }
            return hexString.toString();
        }catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
