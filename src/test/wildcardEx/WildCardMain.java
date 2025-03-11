package test.wildcardEx;

import animal.Animal;
import animal.Dog;

public class WildCardMain {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();

        dogBox.setValue(new Dog("멍뭉이", 10));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printGenericV2(dogBox);
        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);

        WildcardEx.printWildcardV1(dogBox);
        WildcardEx.printWildcardV2(dogBox);
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
        //Dog wildDog = WildcardEx.printAndReturnWildcard(dogBox);  와일드카드는 이게 안된다.

        //하한 와일드카드 : Animal포함 상위 타입
        writeBox(objectBox);
        writeBox(animalBox);
        //writeBox(dogBox); //안됨
    }
    static void writeBox(Box<? super Animal> box){
        box.setValue(new Dog("MungMeongYee", 100));
    }
}
