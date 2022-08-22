import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split("");
        int sum = arr.length;

        for (int i = 0; i < arr.length; i++) {
            int a = transNum(arr[i]);
            sum += a;
        }
        System.out.println(sum);
    }

    public static int transNum (String a) {
        int result = 0;

        switch(a) {
            case "A": case "B": case "C":
                result = 2;
                break;

            case "D": case "E": case "F":
                result = 3;
                break;

            case "G": case "H": case "I":
                result = 4;
                break;

            case "J": case "K": case "L":
                result = 5;
                break;

            case "M": case "N": case "O":
                result = 6;
                break;

            case "P": case "Q": case "R": case "S":
                result = 7;
                break;

            case "T": case "U": case "V":
                result = 8;
                break;

            case "W": case "X": case "Y": case "Z":
                result = 9;
                break;

            default:
                break;
        }
        return result;
    }
}
