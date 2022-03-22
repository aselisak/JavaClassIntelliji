package JavaClass25Interfaces;

public interface Healthy {
    void Healthy();
}
interface Portable{
    void canCherry();
    }
interface Eatable{
    void eat();
}

class Orange implements Healthy, Portable, Eatable{
@Override
    public void Healthy() {
    System.out.println("Oranges is healthy to eat");
    }
@Override
    public void canCherry(){
    System.out.println("we can carry orange easily");
}

    @Override
    public void eat() {
        System.out.println("we can eat orange");
    }
}
class Laptop implements Portable{
    @Override
    public void canCherry() {
        System.out.println("we can carry a laptop easily");
    }


    public static void main(String[] args) {
        Healthy healthy = new Orange();

    }
}