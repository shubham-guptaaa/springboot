public class GenericsP3 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(10);
        b1.getDouble();
    }
}
// Bounds in Generic
// upper bound
class Box<T extends Number>{
    private T val;

    public Box(T val) {
        this.val = val;
    }

    

    public void getDouble(){
        System.out.println(val.doubleValue());
    }
}
