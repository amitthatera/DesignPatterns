package com.example.reflection;

import com.example.reflection.entity.User;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReflectionDemo {

    public static void main(String[] args) throws IllegalAccessException {
        User user = new User();  // Create an instance of User
        Field[] fields = User.class.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            if (field.getType() == String.class) {
                field.set(user, "Amit thatera");
                System.out.println(field.get(user));
            }
        }
    }
}
