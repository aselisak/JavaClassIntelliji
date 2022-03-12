package Replits;

public class ShoppingStore {
    String item;
    double price;
    int quantity;
    double value;

    ShoppingStore(String item, double price, int quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;
        this.value=price*quantity;

    }
    void itemTotalPrice(){
        System.out.println(item+" Total Value "+value);
    }

}
class Main {
    public static void main(String[] args){
        ShoppingStore obj=new ShoppingStore("Blanket", 99.98, 1);
        obj.itemTotalPrice();
    }
}