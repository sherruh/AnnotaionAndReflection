import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Annotation[] annotations=Car.class.getAnnotations();
        for(Annotation annotation:annotations){
            System.out.println("Annotation of class: "+ annotation.toString());
        }

        Method[] methods=Car.class.getDeclaredMethods();
        for(Method method:methods){
            Annotation[] annotationsOfMethod=method.getDeclaredAnnotations();
            for(Annotation annotationOfMethod: annotationsOfMethod){
                System.out.println("Annotation of method: "+method.getName()+" is: "+ annotationOfMethod.toString());
            }
        }

        Field[] fields=Car.class.getDeclaredFields();
        for(Field field: fields){
            Annotation[] annotationsOfFields=field.getAnnotations();
            for (Annotation annotationOfField: annotationsOfFields){
                System.out.println("Annotation of field: "+field.getName()+" is: "+annotationOfField.toString());
            }
        }

        Method method=Car.class.getDeclaredMethod("drive");
        method.invoke(new Car("BMW",120));
    }
}
