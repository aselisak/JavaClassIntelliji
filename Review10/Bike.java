package Review10;

public class Bike {
    int maxSpeed=100;
    int engineCC=150;
    void printMaxSpeed(){System.out.println(maxSpeed);}
    void printEngineCC(){ System.out.println(engineCC);}}
class HondaBike extends Bike{
    int maxSpeed=150;
    int engineCC=125;
    void printEngineCC(){System.out.println(engineCC);}
    void printMaxSpeed() {
    int maxSpeed=200;
        System.out.println(maxSpeed);//local var
        System.out.println(this.maxSpeed);
        System.out.println(super.maxSpeed);}
void printInfoFromParentAndChild(){
        printEngineCC();
       this.printEngineCC();
        super.printEngineCC();
    }}
class Tester2{
    public static void main(String[] args) {
        HondaBike hondaBike = new HondaBike();
        //hondaBike.printMaxSpeed();
        hondaBike.printInfoFromParentAndChild();
    }
}