/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author monirozzamanroni
 */
public class Popup {
    
    public  static final int OK = 0;
    public  static final int EXIT = -1;
    public  static final int CANCEL = 2;
    public static void info(String message) {
        info(message, theNameOfTheMethodThatCalledMe());
    }
    public static void info(String message, String caller) {
        show(message, caller, JOptionPane.INFORMATION_MESSAGE);
    }

    static void error(String message) {
        error(message, theNameOfTheMethodThatCalledMe());
    }
    public static void error(String message, String caller) {
        show(message, caller, JOptionPane.ERROR_MESSAGE);
    }

    public static void show(String message, String title, int iconId) {
        setClipboard("Auto Rechage System"+":"+NEW_LINE+message);
        JOptionPane.showMessageDialog(null, message, "Auto Rechage System", iconId);
    }
    private static final String NEW_LINE = System.lineSeparator();

    public static String theNameOfTheMethodThatCalledMe() {
        return Thread.currentThread().getStackTrace()[3].getMethodName();
    }

    public static void setClipboard(String message) {
        CLIPBOARD.setContents(new StringSelection(message), null);
        // nb: we don't respond to the "your content was splattered"
        //     event, so it's OK to pass a null owner.
    }
    
     public static int display(String heading , String message1, String message2, String oKButtonName, String cencelButtonName) {
            JLabel title = new JLabel(heading);
            title.setFont(new Font("Arial",Font.BOLD, 50));
            title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            title.setForeground(Color.WHITE);
            Dimension size = title.getPreferredSize();
            title.setBounds(100, 100, size.height, size.height);
            title.setBorder(new EmptyBorder(10,10,10,10));
            
            JLabel subTtile1 = new JLabel(message1);
            subTtile1.setFont(new Font("Dialog",Font.BOLD, 80));
            subTtile1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            subTtile1.setForeground(Color.decode("#00ffff"));
            Dimension subTtilesize1 = subTtile1.getPreferredSize();
            subTtile1.setBounds(100, 100, subTtilesize1.height, subTtilesize1.height);
            
            JLabel subTtile2 = new JLabel(message2);
            subTtile2.setFont(new Font("Dialog",Font.BOLD, 60));
            subTtile2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            subTtile2.setForeground(Color.decode("#00ffff"));
            Dimension subTtilesize2 = subTtile2.getPreferredSize();
            subTtile2.setBounds(100, 100, subTtilesize2.height, subTtilesize2.height);
            
            JPanel panel = new JPanel(new GridLayout(3, 1));
            panel.add(title);
            panel.add(subTtile1);
            panel.add(subTtile2);
            panel.setBackground(Color.decode("#852FD1"));
            
            /**
             *Exit  = -1
             * OK = 0
             * Cancel= 2
             */
            
            UIManager.put("OptionPane.cancelButtonText", cencelButtonName);
            int result = JOptionPane.showConfirmDialog(null, panel, "Confirmation Message",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
           
            return result;          
    }
    private static final Toolkit AWT_TOOLKIT = Toolkit.getDefaultToolkit();
    private static final Clipboard CLIPBOARD = AWT_TOOLKIT.getSystemClipboard();
}
