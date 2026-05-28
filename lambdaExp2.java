public class lambdaExp2 {
    public static void main(String[] args){
        // Calculator c = new Addition();
        
        // Lambda Exp
        print(3,5, (a,b) -> a+b);


    }
    public static void print(int a, int b, Calculator c){
        System.out.println(c.calculate(a, b));
    }
}

interface Calculator{
    int calculate(int a, int b);
}

// class Addition implements Calculator{
//     @Override
//     public int calculate(int a, int b){
//         return a+b;
//     }
// }

// java.util.function -> which provide all functional interface
// 4main core interface
// 1. Function
// 2. Consumer
// 3. Predicate
// 4. Supplier

// Function ---------->  c -> c*c 
// interface Function<R,T>{
//     apply(T t)
//     return R
// }
// Example ----> x -> (x*x)

// Consumer
// Consumer<T> return void 

// interface Consumer<T>{
//     accept(T t) -> use for void
// }

