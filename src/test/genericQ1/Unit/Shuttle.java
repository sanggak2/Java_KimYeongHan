package test.genericQ1.Unit;

public class Shuttle<T extends BioUnit> {
    private T unit;

    public void in(T t){
        unit = t;
    }

    public T out(){
        return unit;
    }

    public void showInfo(){
        System.out.println("이름: "+unit.getName()+", 체력: "+unit.getHp());
    }
}
