package pakage.util;

import pakage.Annotation.NotBlank;

import java.lang.reflect.Field;

public class ValidationException extends RuntimeException {
    public ValidationException(String message) {
        super(message);
    }

    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(NotBlank.class)) {
                field.setAccessible(true);
                try {
                    if (field.get(object) == null) {
                        throw new ValidationException("Field " + field.getName() + " is null");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
