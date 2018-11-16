import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        FileWriter fileWriter = new FileWriter("output3.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        while (t-- > 0) {
            double Xa = sc.nextDouble() + 0.5;
            double Ya = sc.nextDouble() + 0.5;

            double Xb = sc.nextDouble() + 0.5;
            double Yb = sc.nextDouble() + 0.5;

            double ratio = sc.nextDouble();

            double ab = Math.sqrt(Math.pow(Xa - Xb, 2) + Math.pow(Ya - Yb, 2));

            double Xc = ((1 - ratio) * Xa) + (ratio * Xb);
            double Yc = ((1 - ratio) * Ya) + (ratio * Yb);

            if(t != 0)
                printWriter.print((int)Math.floor(Xc) + " " + (int)Math.floor(Yc) + "\n");
            else
                printWriter.print((int)Math.floor(Xc) + " " + (int)Math.floor(Yc));

        }

        printWriter.close();

    }
}
