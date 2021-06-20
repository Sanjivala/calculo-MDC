package algoritmoparamdc;

import java.util.Scanner;

public class AlgoritmoParaMDC {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner v = new Scanner(System.in);
        int a, b;
        int q = 0;
        int r = 0;
        
        System.out.println("ALGORITMO DA DIVISÃO SUCESSIVA\n\n");

        System.out.print("Digite um valor inteiro(+) para (a): ");
        a = v.nextInt();

        System.out.print("Digite um valor inteiro(+) para (b): ");
        b = v.nextInt();
        
        if(b > a){
            int c = b - a;
            b = a;
            a += c;
            System.out.println("\nComo o valor de (A) é menor que o valor de (B) (a < b) então: ");
            System.out.println("O valor de (A) = " + a + "\nO valor de (B) = " + b);
        }
        
        if (b > a){
            q = a / b;
            r = a - (q * b);
            b = (q * b) + r;
            //System.out.println("\nMDC (a,b) = " + b);
            
                while (r != 0) {
                    a = b;
                    b = r;
                    q = a / b;
                    r = a - (q * b);
                    //a = (q * b) + r;
                    b = (q * b) + r;
                }
            System.out.println("\nMDC (a,b) = " + b);
        } else

        if ((a % b) == 0) {
            System.out.println("\nMDC (a,b) = " + b);
        } else if (a > b) {
            q = a / b;
            r = a - (q * b);
            b = (q * b) + r;

            if (r == 0) {
                //System.out.println("\nMDC (a,b) = " + b);
            } else {
                while (r != 0) {
                    a = b;
                    b = r;
                    q = a / b;
                    r = a - (q * b);
                    //a = (q * b) + r;
                }
            }
            System.out.println("\nMDC (a,b) = " + b);
        }

        System.out.println("\n=== FIM DO ALGORITMO ===");

    }

}
