/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system.config;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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

    public static String removeNumberAndSpecialCharacters(String a) {
        StringBuffer s = new StringBuffer(a);

        int lenvar = s.length();
        String myString = "";
        for (int i = 0; i < lenvar; i++) {

            if (!isSpecialCharacter(s.charAt(i))) {
                myString += s.charAt(i);

            }

        }
        return myString.replaceAll("\\d","");

    }

    private static boolean isSpecialCharacter(int b) {
        if ((b >= 32 && b <= 47) || (b >= 58 && b <= 64) || (b >= 91 && b <= 96) || (b >= 123 && b <= 126) || b > 126) {
            return true;
        }
        return false;

    }

    public static String gettingCurrentDate() {

        //getting current date and time using Date class
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();

        /*getting current date time using calendar class 
        * An Alternative of above*/
        Calendar calobj = Calendar.getInstance();
        return df.format(calobj.getTime());

    }
}
