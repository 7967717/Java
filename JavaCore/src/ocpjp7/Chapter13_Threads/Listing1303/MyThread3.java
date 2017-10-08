package ocpjp7.Chapter13_Threads.Listing1303;


/*ocpjp7*/


class MyThread3 implements Runnable {
    public static void main(String args[]) throws Exception {
        Thread myThread = new Thread(new MyThread3());
        myThread.run(); // note run() instead of start() here
        System.out.println("In main method; thread name is : " + Thread.currentThread().getName());
    }

    public void run() {
        System.out.println("In run method; thread name is: " + Thread.currentThread().getName());
    }
}
