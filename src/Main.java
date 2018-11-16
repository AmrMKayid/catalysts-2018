import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        FileWriter fileWriter = new FileWriter("out4.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < n * m; i++) {
            s.add(sc.nextInt());
        }

        s.remove(0);

        List<Integer> list = new ArrayList<Integer>(s);
        Collections.sort(list);


        for (Integer h :
                list) {
            if(list.indexOf(h) == list.size() - 1)
                printWriter.print(h);
            else
                printWriter.print(h + " ");
        }

        printWriter.close();


    }

}
