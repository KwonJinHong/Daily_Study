import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] alpha = new int[26];
        ArrayList<Character> al = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        for(int i=0; i<cnt; i++) {
            String s = sc.next();
            int index = s.charAt(0) - 97; // 알파벳의 인덱스
            alpha[index]++;

            // 같은 성을 가진 사람이 5명 이상이면, ArrayList 추가
            if(alpha[index] >= 5) {
                if(!al.contains((char)(index+97))) {
                    al.add((char)(index+97));
                }
            }
        }

        if(al.size() == 0) {
            // 같은 성을 가진 사람이 5명이 안될 경우
            System.out.print("PREDAJA");
        } else {
            // 같은 성을 가진 사람이 5명 이상일 경우, 사전 순 정렬
            Collections.sort(al);
            for(int i=0; i<al.size(); i++) {
                System.out.print(al.get(i));
            }
        }
    }
}

