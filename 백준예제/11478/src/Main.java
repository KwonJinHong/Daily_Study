import java.io.*;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        HashSet<String> stringSet = new HashSet<>();

        for (int i = 0; i <= input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                stringSet.add(input.substring(i, j));
            }
        }

        System.out.println(stringSet.size());
    }
}
