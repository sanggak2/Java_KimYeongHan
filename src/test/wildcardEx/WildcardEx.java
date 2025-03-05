package test.wildcardEx;

import animal.Animal;

public class WildcardEx {
    static <T> void printGenericV1(Box<T> box){
        System.out.println("T : "+box.getValue());
    }

    static <T extends Animal> void printGenericV2(Box<T> box){
        System.out.println("이름 : "+box.getValue().getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box){
        System.out.println("이름 : "+box.getValue().getName());
        return box.getValue();
    }


    /*
      와일드카드(?)는 제네릭(T)와 같이 모든 타입을 받을 수 있음.
      그러나 제네릭을 사용한 제네릭 메서드와는 다르게, 와일드카드는 일반적인 메서드임.
      ***일반 메서드이기 때문에 반환타입이 정해져있음. 제네릭 메서드처럼 반환타입을 정할 수 없음.***
      이게 중요한 차이임.


      와일드카드는 타입을 선언할 때 쓰는게 아니라
      "이미 정해진 제네릭 타입" ex)Box<Cat>, Box<Dog>..
      을 전달받아 사용.

      비지정 와일드카드 <?> == <? extends Object>
      상한 와일드카드 <? extends Class>
      하한 와일드카드 <? super Class>
     */

    /**
     *
     * 와일드 카드를 사용하면 제네릭처럼 복잡하게 타입 결정하고 이럴 필요가 없다.
     * 꼭 필요한게 아니라면 와일드카드 사용 권장.
     */
    static void printWildcardV1(Box<?> box){
        System.out.println("? : "+box.getValue());
    }


    static  void printWildcardV2(Box<? extends Animal> box){
        Animal animal = box.getValue();
        System.out.println("이름 : "+animal.getName());
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box){
        Animal animal = box.getValue();
        System.out.println("이름 : "+animal.getName());
        return animal;
    }
}
