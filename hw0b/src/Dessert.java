public class Dessert {
    int flavor, price;
    static int numDesserts = 0;
    public Dessert(int flavor, int price){
        this.flavor = flavor;
        this.price = price;
        numDesserts ++;
    }
    public void printDessert(){
        System.out.print(this.flavor + " " + this.price + " " + numDesserts);
    }
    public static void main(String[] args){
        System.out.println("I love dessert!");
    }
}
