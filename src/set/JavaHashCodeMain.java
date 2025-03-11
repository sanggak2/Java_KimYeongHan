package set;

import set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        //Object의 기본 hashCode는 객체 참조값을 기반으로 만듬
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());

        //각 클래스마다 hashCode를 오버라이딩 해놓음
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("i.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode());

        //같을까 다를까, 인스턴스는 달라도, equals는 같음
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        //Member클래스에 equals, hashCode를 오버라이딩 했을때와 안했을때.
        System.out.println("(member1 == member2) = " + (member1 == member2));
        System.out.println("member1.equals(member2) = " + member1.equals(member2));
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());

    }
}
