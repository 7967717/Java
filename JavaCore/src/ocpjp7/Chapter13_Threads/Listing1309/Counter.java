package ocpjp7.Chapter13_Threads.Listing1309;


/*ocpjp7*/



// This class exposes a publicly accessible counter 
// to help demonstrate data 'race problem'
class Counter {
    public static long count = 0;
}
