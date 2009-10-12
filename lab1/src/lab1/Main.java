/**
 * Первая лабораторная работа
 *
 * @author ya
 * @version 1.0
 * @company VSTU
 */

package lab1;

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

        // 1.3
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

        // 1.6
        if (args.length == 1) {
            try {
                FileOutputStream f = new FileOutputStream("C:/" + args[0]);
                f.close();
            } catch (Exception e) {
                System.out.println("Problem with FileOutputStream");
                System.out.println(e.getMessage());
            }
        }

        // 1.7
        // Калькулятор, считаем, что параметры всегда верны, чтобы не усложнять
        if (args.length == 3) {
            Float val1 = new Float(args[0]);
            String operation = args[1];
            Float val2 = new Float(args[2]);

            System.out.println(args[0] + args[1] + args[2] + " = ");
            if (operation.equals("+")) {
                Float result = new Float(val1 + val2);
                System.out.print(result);
            } else if (operation.equals("-")) {
                Float result = new Float(val1 - val2);
                System.out.print(result);
            } else if (operation.equals("x")) {
                Float result = new Float(val1 * val2);
                System.out.print(result);
            } else if (operation.equals("/")) {
                if (val2 != 0) {
                    Float result = new Float(val1 / val2);
                    System.out.print(result);
                } else {
                    System.out.println("Нельзя делить на 0");
                }
            }
        }

        System.out.println();

        new Main();
    }

}
