public class Generics{
    public static void main(String[] args){
        
        Box b1 = new Box(10);
        Box b2 = new Box("Hello");
        Box b3 = new Box(true);

        //downcasting -> (General -> specific)
        Integer a1 = (Integer) b1.getValue();
        String a2 = (String) b2.getValue()+5;
        boolean a3 = (Boolean) b3.getValue();


        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
    // this is a general class
    static class Box{
        private Object value;
        Box(Object value){
            this.value = value;
        }

        public void setValue(Object v){
            this.value = v;
        }

        public Object getValue(){
            return this.value;
        }
    }

}