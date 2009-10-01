/**
 * Первая лабораторная работа
 *
 * @author ya
 * @version 1.0
 * @company VSTU
 */

package lab1;

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
    }

    private void privateMethod() {
        
    }
    
    public static void main(String[] args) {
        new Main();
    }

}
