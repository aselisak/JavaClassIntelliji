package JavaClass20;

public class Lion extends Animal{


    boolean huntOther=true;

    void roar(){
        System.out.println(name+" is roaring, color = "+color+" huntOthers "+huntOther);
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.name="Alex";
        lion.color="pink";
        lion.sleep();
        lion.roar();
    }
    }

