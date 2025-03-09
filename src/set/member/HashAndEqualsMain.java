package set.member;

import set.MyHashSetV2;

public class HashAndEqualsMain {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");
        System.out.println("m1 = " + m1.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        //중복 등록
        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
    }

}
