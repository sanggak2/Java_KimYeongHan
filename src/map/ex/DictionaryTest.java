package map.ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("단어 입력단계(종료 q) : ");
            String key = scanner.nextLine();
            if(key.equals("q")) break;

            System.out.print("뜻이 뭡니까 : ");
            String val = scanner.nextLine();
            dictionary.put(key, val);
        }

        while (true) {
            System.out.print("단어 검색단계(종료 q) : ");
            String str = scanner.nextLine();
            if(str.equals("q")) break;

            String out = dictionary.getOrDefault(str, null);

            if (out == null) System.out.println(str+"라는 단어는 없습니다.");
            else System.out.println(str+"의 뜻 = "+out);
        }
    }


}
