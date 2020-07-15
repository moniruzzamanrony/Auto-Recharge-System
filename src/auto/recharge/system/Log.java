/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

/**
 *
 * @author monirozzamanroni
 */
public class Log {
    public static void mgs(String lineNumber,String mgs) {
           System.out.println(lineNumber+"---->\n\t"+mgs);    
    }
    public static void error(String lineNumber,String mgs) {
        System.err.println(lineNumber+"---->\n\t"+mgs);       
    }
}
