package StringToken;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerClass {

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        scanner.close();
    }
}

