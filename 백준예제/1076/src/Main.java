import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();

        ArrayList<String> list = new ArrayList<>();
        list.add("black"); // index = 0
        list.add("brown"); // index = 1
        list.add("red"); // index = 2
        list.add("orange"); // index = 3
        list.add("yellow"); // index = 4
        list.add("green"); // index = 5
        list.add("blue"); // index = 6
        list.add("violet"); // index = 7
        list.add("grey"); // index = 8
        list.add("white"); // index = 9

        long answer = 0L;
        answer += list.indexOf(first)*10;
        answer += list.indexOf(second);
        answer *= Math.pow(10, list.indexOf(third));

        System.out.println(answer);
    }
}