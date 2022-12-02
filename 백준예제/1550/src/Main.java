import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String n = br.readLine();

            System.out.println(Integer.parseInt(n, 16));

        } catch (IOException e) {
            System.out.println("error");
        }
    }
}