public class GenericsP2 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(10); // type argument
        Box<String> b2 = new Box<>("Hello");
        Box<Boolean> b3 = new Box<>(true);

        System.out.println(b1.getValue()+10);
        System.out.println(b2.getValue()+" "+"World!");
        System.out.println(b3.getValue());


    }
    // Java Generics
    static class Box<T>{ // type parameter
        private T value;

        public Box(T value) {
            this.value = value;
        }

        public T getValue(){
            return this.value;
        }

        public void setValue(T v){
            this.value = v;
        }
        
    }
}

// Type info does not lost 
