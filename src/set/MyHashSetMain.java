package set;

import set.member.Member;

public class MyHashSetMain {
    public static void main(String[] args) {
        MyHashSetV2 myHashSet = new MyHashSetV2(10);
        Member hi = new Member("hi");
        Member jpa = new Member("JPA");
        Member java = new Member("java");
        Member spring = new Member("spring");

        System.out.println("hi.hashCode() = " + hi.hashCode());
        System.out.println("jpa.hashCode() = " + jpa.hashCode());
        System.out.println("java.hashCode() = " + java.hashCode());
        System.out.println("spring.hashCode() = " + spring.hashCode());

        myHashSet.add(hi);
        myHashSet.add(jpa);
        myHashSet.add(java);
        myHashSet.add(spring);
        System.out.println(myHashSet);

        //검색
        Member searchValue = new Member("JPA");
        System.out.println("myHashSet.contains(searchValue) = "
                + myHashSet.contains(searchValue));
    }
}
