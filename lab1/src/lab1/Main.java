/**
 * Первая лабораторная работа
 *
 * @author ya
 * @version 1.0
 * @company VSTU
 */

package lab1;

import javax.swing.text.StyledEditorKit.ForegroundAction;
import java.io.*;

/**
 *
 * @author root
 */
public class Main {

    // 1.2
    public String var1 = "Some";
    protected String var2 = "super";
    private String var3 = "secret";
    String var4 = "or friendly";

    public Main() {
        // 1.1
        java.util.ArrayList al = new java.util.ArrayList();
        al.add(new Integer(1));
        System.out.println("ArrayList size is " + al.size() + " element(s)");

        // 1.3 (не то вроде... )
        String nullString = null;
        if ( nullString == null) {
            System.out.println("Null");
        }

        convert();
    }

    private void convert() {
        // 1.5
        Integer ii = new Integer(1);
        int i = ii.intValue();
        ii = new Integer("123");
    }
    
    public static void main(String[] args) {
        // 1.4
        System.out.println("Parameters: ");
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        // 1.5
        try {
            FileOutputStream f = new FileOutputStream("C:/" + args[0]);
            f.close();
        } catch (Exception e) {
            System.out.println("Problem with FileOutputStream");
            System.out.println(e.getMessage());
        }


        new Main();
    }

}
