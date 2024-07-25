import java.io.*;

class countdown {
    public static void main(String args[]) {
        int x;
        String buf;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.err.print("Enter a number x > 0: ");
            buf = br.readLine();
            x = Integer.parseInt(buf);
           
            if (x <= 0) {
                throw new IllegalArgumentException("Please input a number above 0");
            }

            System.out.println("<HTML>");
            System.out.println("<HEAD><TITLE>countdown ikuta</TITLE></HEAD>");
            System.out.println("<BODY>");

            
            System.out.println("Your first number is " + x + "<BR>");
            System.out.println("<b>Countdown</b><BR>");

            
            while (x > 0) {
                System.out.println(x + "<BR>");
                x--;
            }
            System.out.print(x);
            
            System.out.println("</BODY>");
            System.out.println("</HTML>");

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        } catch (IOException e) {
            System.out.println("Error: Input/Output error");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
