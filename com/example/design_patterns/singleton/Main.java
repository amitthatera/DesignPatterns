package com.example.design_patterns.singleton;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        lazy initialization
//        DatabaseConnectionManager manager1 = DatabaseConnectionManager.getDatabaseConnectionManagerInstanceLazily();
//        DatabaseConnectionManager manager2 = DatabaseConnectionManager.getDatabaseConnectionManagerInstanceLazily();
//        System.out.println(manager1.hashCode() == manager2.hashCode());
//        manager1.getConnection();
//        manager2.getConnection();

//        serialization vulnerability
//        DatabaseConnectionManager manager1 = DatabaseConnectionManager.getDatabaseConnectionManagerInstanceLazily();
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("db.ser"));
//        objectOutputStream.writeObject(manager1);
//        objectOutputStream.close();
//
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("db.ser"));
//        DatabaseConnectionManager manager2 = (DatabaseConnectionManager) objectInputStream.readObject();
//        objectInputStream.close();
//
//        System.out.println("manager1.hashCode(): [" + manager1.hashCode() +"]");
//        System.out.println("manager2.hashCode(): [" + manager2.hashCode() +"]");


        //reflection attack
//        DatabaseConnectionManager manager1 = DatabaseConnectionManager.getDatabaseConnectionManagerInstanceLazily();
//        Constructor<DatabaseConnectionManager> constructor = DatabaseConnectionManager.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        DatabaseConnectionManager manager2 = constructor.newInstance();
//
//        System.out.println("manager1.hashCode(): [" + manager1.hashCode() + "]");
//        System.out.println("manager2.hashCode(): [" + manager2.hashCode() +"]");


        DatabaseConnectionManagerEnum manager1 = DatabaseConnectionManagerEnum.INSTANCE;
        DatabaseConnectionManagerEnum manager2 = DatabaseConnectionManagerEnum.INSTANCE;

        System.out.println("manager1.hashCode(): [" + manager1.hashCode() + "]");
        System.out.println("manager2.hashCode(): [" + manager2.hashCode() +"]");
        manager1.getConnection();
    }
}
