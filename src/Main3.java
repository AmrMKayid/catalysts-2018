import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        FileWriter fileWriter = new FileWriter("output3.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        while (t-- > 0) {
            int Xa = sc.nextInt();
            int Ya = sc.nextInt();

            int Xb = sc.nextInt();
            int Yb = sc.nextInt();

            double m = (Yb - Ya) / (Xb - Xa);
            double c = Ya - m * Xa;

            for (double x = Xa; x <= Xb+1; x++)
                for(double y = Ya; y <= Yb+1; y++) {
//                    System.out.println(Math.round(x) + " " + Math.round(y) + " ");
                    if( y == Math.floor(m*x + Math.ceil(c)))
                        System.out.print(Math.round(x) + " " + Math.round(y) + " ");
                }
            System.out.println();

        }
    }
}
