

@FunctionalInterface
interface A{
    void show(int i);
}

// class B implements A{
//     public void show(){
//         System.err.println("in show");
//     }
// }

public class functionalInterface {
    public static void main(String[] args) {
        // A a = new B();
        // a.show();

        //annonimus fn
        // A obj = new A(){
        //     public void show(){
        //         System.out.println("in show");
        //     }
        // };
        // obj.show();

        //lambda expression

        A obj = (i) ->
        {
            System.out.println("in show "+ i);
        };

        obj.show(5);

    }
}

// Lambda Expression only work with functional interface
