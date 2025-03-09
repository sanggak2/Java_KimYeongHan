package set;

public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        char charA = 'A';
        System.out.println((int)charA);

        //hashCode
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('AB') = " + hashCode("AB"));

        //hashIndex
        System.out.println("hashIndex(hashCode('A')) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(hashCode('AB')) = " + hashIndex(hashCode("AB")));
    }

    //문자를 넣으면 숫자로 반환
    static int hashCode(String str) {
        char[] chars = str.toCharArray();
        int sum = 0;
        for (char aChar : chars) {
            sum += aChar;
        }
        return sum;
    }

    static int hashIndex(int value){
        return value%10;
    }
}
