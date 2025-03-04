import animal.Animal;
import animal.Cat;
import animal.Dog;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 10);
        Cat cat = new Cat("냐옹이", 100);

        Box<Animal> animalBox = new Box<>();
        animalBox.setValue(dog);
        System.out.println(animalBox.getValue());

    }
}
