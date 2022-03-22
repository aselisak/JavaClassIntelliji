package JavaClass25Interfaces;

interface HealthAble{
    void healthy();
}
public interface Walk extends HealthAble{

    void burnCalories();
}
interface Milk extends HealthAble{

    void givenEnergy();
}
interface Banana extends HealthAble{

    void givenEnergy();
}
class Demo implements Banana{

    @Override
    public void healthy() {System.out.println("banana is good for health");}
    @Override
    public void givenEnergy() { System.out.println("it gives us energy");}}



