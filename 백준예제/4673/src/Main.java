public class Main {

    public static void main(String[] args) {

        boolean[] result = new boolean[10001];

        int tmp = 0;
        result[1] = false;

        for (int i = 0; i < 10000; i++) {
            tmp = d(i);
            if (tmp < 10000) {
                result[tmp] = true;
            }
        }

        for (int i = 1; i < 10000; i++)
        {
            if (!result[i])
            {
                System.out.println(i);
            }
        }
    }
    public static int d(int a) {
        int result = a;

        result = result + (result / 1000) + (result % 1000 / 100) + (result % 100 / 10) + (result % 10);
        return result;
    }
}
