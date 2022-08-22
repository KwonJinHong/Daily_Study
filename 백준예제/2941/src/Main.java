import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] cAlpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String input = br.readLine();

        for (int i = 0; i < cAlpha.length; i++) {

            while (input.contains(cAlpha[i])) {
                input = input.replaceFirst(cAlpha[i], "/");
            }
        }
        System.out.println(input.length());
    }
}
