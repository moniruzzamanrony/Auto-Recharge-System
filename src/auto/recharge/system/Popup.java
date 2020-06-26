/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author monirozzamanroni
 */
public class Popup {

    public static final int OK = 1;
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
         * Exit = -1 OK = 1 Cancel= 2
         */
        int result;
        RechargeConfirmationDialogUI ui = new RechargeConfirmationDialogUI(heading, phnNumber, ammount, prepaidOrPostPaid, payBy);

        JDialog jDialog = new JDialog();
        jDialog.add(ui);
        jDialog.setSize(1400, 941);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);

        ui.getClickClose().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

            }

        });

        ui.getClickConfirm().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jDialog.setVisible(false);
            }

        });
        ui.getClickEdit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

            }

        });
        return 11;
    }
    private static final Toolkit AWT_TOOLKIT = Toolkit.getDefaultToolkit();
    private static final Clipboard CLIPBOARD = AWT_TOOLKIT.getSystemClipboard();
}
