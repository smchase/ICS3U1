import java.io.*;
import java.util.*;

public class ch6test
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Email: ");
        String email = br.readLine();
        System.out.print("Password: ");
        String pswrd = br.readLine();
        boolean valid = true, capital = false, number = false, symbol = false;
        String reverse = "";

        for (int i = email.indexOf("@")-1; i >= 0; i--) {
            reverse += email.charAt(i);
        }

        for (int i = 0; i < pswrd.length(); i++) {
            if (pswrd.charAt(i) > 'A' && pswrd.charAt(i) < 'Z') {
                capital = true;
            } else if (pswrd.charAt(i) > '0' && pswrd.charAt(i) < '9') {
                number = true;
            } else if ("*@>$".contains(pswrd.substring(i, i+1))) {
                symbol = true;
            }
        }

        if (email.indexOf("@") < 3 || !email.substring(email.indexOf("@"), email.length()).equals("@hwdsb.on.ca") || pswrd.length() < 6 || Character.toLowerCase(pswrd.charAt(0)) < 'a' || Character.toLowerCase(pswrd.charAt(0)) > 'z' || pswrd.contains(" ") || !capital || !number || !symbol || pswrd.contains(email.substring(0, email.indexOf("@"))) || pswrd.contains(reverse)) {
            valid = false;
        }

        if (valid) System.out.println("Email and password accepted");
        else System.out.println("Email or password not accepted");
    }
}
