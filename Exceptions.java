public class Exceptions {
    public static void main(String[] args) {
        

        int i = 4;
        int j = 0;

        try
        {
            j = i/j;
        }
        catch(Exception e){
            System.out.println("Error" + " Arithmatic Exception "+e);
        }
        System.out.println(j);
    }
}


// object class -> Throwable class -> Exception  -> 1. Runtime Error , 2.SQL Exception, 3. IOException
//                                 -> Error  1. ThreadDeath, IO ErrorOut of memeory etc,

// RuntimeException -> uncheckedException
// SQLException, IOException -> checkedException