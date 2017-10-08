package ocpjp7.Chapter13_Threads.Listing1302;


/*ocpjp7*/


class MyThread2 implements Runnable {
    public static void main(String args[]) throws Exception {
        Thread myThread = new Thread(new MyThread2());
        myThread.start();
        System.out.println("In main method; thread name is: " + Thread.currentThread().getName());
    }

    public void run() {
        System.out.println("In run method; thread name is: " + Thread.currentThread().getName());
    }
}
