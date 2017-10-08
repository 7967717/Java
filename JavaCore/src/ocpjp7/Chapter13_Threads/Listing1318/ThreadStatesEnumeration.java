package ocpjp7.Chapter13_Threads.Listing1318;


/*ocpjp7*/



class ThreadStatesEnumeration {
    public static void main(String[] s) {
        for (Thread.State state : Thread.State.values()) {
            System.out.println(state);
        }
    }
}

