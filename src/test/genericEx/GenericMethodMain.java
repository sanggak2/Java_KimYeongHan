package test.genericEx;

import animal.Cat;
import animal.Dog;

public class GenericMethodMain {
    public static void main(String[] args) {
        /*
          Integer i = 1;
                  GenericMethod.objMethod(i);

                  //타입명시전달
                  System.out.println(
                          GenericMethod.<Integer>genericMethod(i));
                  //인자값으로 타입추론 가능
                  System.out.println(
                          GenericMethod.numberMethod(i));
         */

        //////////////////////////////////////////////////

        Dog dog = new Dog("MeongMeong2", 100);
        Cat cat = new Cat("NyaOOng2", 50);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.setAnimal(dog);

        //제네릭 메서드에 있는 타입이 사용됨
        System.out.println("ReturnCat : "+hospital.printAndReturn(cat));


    }
}
