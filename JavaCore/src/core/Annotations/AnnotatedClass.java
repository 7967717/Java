package core.Annotations;

/**
 * Created by romanr on 11-Dec-14.
 */
@CustomAnnotationClass(date = "2014-12-12")
public class AnnotatedClass {

    @CustomAnnotationMethod(date = "2014-06-05", description = "annotated method")
    public String annotatedMethod() {
        return "nothing niente";
    }

    @CustomAnnotationMethod(author = "friend of mine", date = "2014-06-05", description = "annotated method")
    public String annotatedMethodFromAFriend() {
        return "nothing niente";
    }

}
