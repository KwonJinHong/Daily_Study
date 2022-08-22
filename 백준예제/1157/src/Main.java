import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.next().toUpperCase().split("");
        int[] alphabet = new int[26];
        int max = alphabet[0];
        char result = 0;

        for (int i = 0; i < input.length; i++) {
            alphabet[input[i].charAt(0) - 'A']++;
        }

        for (int k = 0 ; k < alphabet.length; k++) {
            if (max < alphabet[k]) {
                max = alphabet[k];
                result = (char)(k + 65);
            } else if (max == alphabet[k]) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
