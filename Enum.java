
// enum Status{
//     Running, Failed, Pending, Success;
// }

enum Laptop{
    Macbook(2000), Surface(3000), Windows(1500), Thinkpad(2000);

    private int price;

    private Laptop(int price){
        this.price = price;
    }

    public void setPrice(int p){
        price = p;
    }

    public int getPrice(){
        return price;
    }


}
class Enum{
    public static void main(String[] a){
        // Status s = Status.Running;
        // System.out.println(s);

        // System.out.println(s.ordinal());

        // Status ss[] = Status.values();

        // for(Status s1 : ss) System.out.println(s1);

        Laptop lap = Laptop.Macbook;

        System.out.println(lap);
    }
}