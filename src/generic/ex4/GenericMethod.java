package generic.ex4;

public class GenericMethod {
    public static Object objectMethod(Object obj) {
        System.out.println("object print : " + obj);
        return obj;
    }

    public static <T> T genericMethod(T t) {
        System.out.println("generic print : " + t);
        return t;
    }
}
