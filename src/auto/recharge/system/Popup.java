/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
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

    public static final int OK = 0;
    public static final int EXIT = -1;
    public static final int CANCEL = 2;

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
        setClipboard("Auto Rechage System" + ":" + NEW_LINE + message);
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

    public static int customError(String mgs) {
        ErrorDialogUI ui = new ErrorDialogUI(mgs);
        return JOptionPane.showConfirmDialog(null,
                ui,
                "Auto Recharge System",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE);
    }

    public static int customInfo(String mgs) {
        InfoDialogUI ui = new InfoDialogUI(mgs);
        return JOptionPane.showConfirmDialog(null,
                ui,
                "Auto Recharge System",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE);
    }

    public static int customSuccess() {
        SuccessDialogUI ui = new SuccessDialogUI();
        return JOptionPane.showConfirmDialog(null,
                ui,
                "Auto Recharge System",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE);
    }

    public static int customWarning(String mgs) {
        WarningDialogUI1 ui = new WarningDialogUI1(mgs);
        return JOptionPane.showConfirmDialog(null,
                ui,
                "Auto Recharge System",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE);
    }

    public static int display(String heading, String phnNumber, String ammount, String prepaidOrPostPaid, String payBy) {


        /**
         * Exit = -1 OK = 0 Cancel= 2
         */
        RechargeConfirmationDialogUI ui = new RechargeConfirmationDialogUI(heading,phnNumber,ammount,prepaidOrPostPaid,payBy);
        UIManager.put("OptionPane.cancelButtonText", "Edit");
        int result = JOptionPane.showConfirmDialog(null, ui, "Auto Recharge System",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        return result;
    }
    private static final Toolkit AWT_TOOLKIT = Toolkit.getDefaultToolkit();
    private static final Clipboard CLIPBOARD = AWT_TOOLKIT.getSystemClipboard();
}
