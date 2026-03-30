// class showA extends Thread {
//     public void run() {
//         for (int i = 0; i <= 100; i++)
//             System.out.println("Hye");
//         try {
//             Thread.sleep(10);
//         } catch (Exception e) {
//             // TODO: handle exception
//             System.out.println("Exception " + e);
//         }
//     }
// }

// class showB extends Thread {
//     public void run() {
//         for (int i = 0; i <= 100; i++)
//             System.out.println("Hello");
//         try {
//             Thread.sleep(10);
//         } catch (Exception e) {
//             // TODO: handle exception
//             System.out.println("Exception " + e);
//         }
//     }
// }

class showA implements Runnable {
    public void run() {
        for (int i = 0; i <= 100; i++)
            System.out.println("Hye");
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception " + e);
        }
    }
}

class showB implements Runnable {
    public void run() {
        for (int i = 0; i <= 100; i++)
            System.out.println("Hello");
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception " + e);
        }
    }
}

class ThreadConcept {
    public static void main(String[] args) {

        Thread t1 = new Thread(new showA());
        Thread t2 = new Thread(new showB());

        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception " + e);
        }
        t2.start();

    }
}