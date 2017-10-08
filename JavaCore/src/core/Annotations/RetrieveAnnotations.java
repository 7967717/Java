package core.Annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by romanr on 11-Dec-14.
 */
public class RetrieveAnnotations {

    public static void main(String[] args) throws Exception {

        Class<AnnotatedClass> object = AnnotatedClass.class;
        // Retrieve all annotations from the class
        System.out.println("// Retrieve all annotations from the class");
        Annotation[] annotations = object.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        // Checks if an annotation is present
        if (object.isAnnotationPresent(CustomAnnotationClass.class)) {

            // Gets the desired annotation
            Annotation annotation = object.getAnnotation(CustomAnnotationClass.class);
            System.out.println("// Checks if an annotation is present");
            System.out.println(annotation);

        }
        // the same for all methods of the class
        for (Method method : object.getDeclaredMethods()) {

            if (method.isAnnotationPresent(CustomAnnotationMethod.class)) {

                Annotation annotation = method.getAnnotation(CustomAnnotationMethod.class);
                System.out.println("// the same for all methods of the class");
                System.out.println(annotation);

            }

        }
    }

}
