class Ashow{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in A show");
    }
}

class Bshow extends Ashow{

    
    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in B show");
    }
}

public class Annotation {
    public static void main(String[] args) {
        Bshow b = new Bshow();
        b.showTheDataWhichBelongsToThisClass();
       
    }
}
