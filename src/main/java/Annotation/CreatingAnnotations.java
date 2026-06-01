package Annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@VeryImportant(times = 3)
public class CreatingAnnotations {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        @SuppressWarnings("unused")
        CreatingAnnotations annotations = new CreatingAnnotations();

        A obj = new A("Amisha");

        if (annotations.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("It is very important");
        } else {
            System.out.println("It is not very important");
        }

        for (Method method : obj.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(VeryImportant.class)) {
                VeryImportant annotation = method.getAnnotation(VeryImportant.class);
                for (int i = 0; i < annotation.times(); i++) {
                    method.invoke(obj);
                }

            }
        }
        for (Field field: obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(ImportantString.class)) {
                Object objectValue = field.get(obj);

                if (objectValue instanceof String stringValue) {
                    System.out.println(stringValue.toUpperCase());
                }

            }
        }
    }
}
