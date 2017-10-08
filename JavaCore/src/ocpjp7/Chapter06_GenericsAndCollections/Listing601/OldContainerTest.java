package ocpjp7.Chapter06_GenericsAndCollections.Listing601;

/*ocpjp7*/




import java.util.Vector;

// This program demonstrate the lack of type-safety in containers (based on Object type).
class OldContainerTest {
    public static void main(String[] args) {
        Vector floatValues = new Vector();
        floatValues.add(10.0f);
        floatValues.add(100.0);
        for (int i = 0; i < floatValues.size(); i++) {
            System.out.println(floatValues.get(i));
        }
    }
}    
