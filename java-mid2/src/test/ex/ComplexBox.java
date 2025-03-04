package test.ex;

import animal.Animal;

public class ComplexBox<T extends Animal> {
    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    //애매하게 같은 T쓰지말고 Z같은거 쓰자 
    public <T> T printAndReturn(T z){
        System.out.println("animal.className: "+animal.getClass().getName());
        System.out.println("T.className: "+z.getClass().getName());
        return z;
    }
}
