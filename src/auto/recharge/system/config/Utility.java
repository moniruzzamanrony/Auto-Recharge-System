/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system.config;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {

    public static final String EMAIL = "auto.recharge21bd@gmail.com";
    public static final String EMAIL_PASSWORD = "Afsar/.,123";

    public static ArrayList<String> numberParseFromString(String value) {
        Pattern p = Pattern.compile("[a-z]+|\\d+");
        Matcher m = p.matcher(value);
        ArrayList<String> allMatches = new ArrayList<>();
        while (m.find()) {
            allMatches.add(m.group());
        }
        return allMatches;
    }

}
