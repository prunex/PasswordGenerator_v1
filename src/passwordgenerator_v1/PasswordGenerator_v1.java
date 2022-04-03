/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgenerator_v1;

import java.util.Random;

/**
 *
 * @author Prunex
 */
public class PasswordGenerator_v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Password Generator v1");

        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numberCase = "0123456789";
        String specialChar = ",.-";
        String passLimit = upperCase + lowerCase + numberCase + specialChar;

        // Input the password quantity
        int passQuatity = 5;
        // Input the password length
        int passLength = 8;

        System.out.println("Password to generate: " + passQuatity);
        System.out.println("Password length: " + passLength);

        Random random = new Random();

        for (int i = 0; i < passQuatity; i++) {
            String passGenerated = "";
            for (int j = 0; j < passLength; j++) {
                passGenerated += passLimit.charAt(random.nextInt(passLimit.length()));
            }
            System.out.println(passGenerated);
        }
    }

}
