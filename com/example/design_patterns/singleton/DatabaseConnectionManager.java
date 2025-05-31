package com.example.design_patterns.singleton;

import java.io.Serializable;

/* The singleton design pattern ensures a class has only one instance and provides a global point of access to it.
   This is a creational design pattern, meaning it deals with how objects are created. It's used in situations where you need to manage shared resources,
   like a database connection pool or a logger, where only one instance should be active
 */

/* Limitation
   1. Violates Single Responsibility Principle. It handles both lifecycle management and actual business logic like creation of instance and providing connection
   2. Hard to test and manage. If in DatabaseConnectionManger Connection failed because of any reason like username, db_url etc. It's hard to fix.
   3. Difficult to unit test. Can't mock connection. Always hit real database.
   4. Concurrency issue (If not properly synchronized)
   5. Difficult to extend or inherit (private constructor)
   6. Global state -> All classes share the same instance. If one part of code change the state. It affects all other part. For example Anyone who calls
      setConnectionString(...) changes it for the entire application.
 */
public class DatabaseConnectionManager implements Serializable {

    private static DatabaseConnectionManager instance;

    //to prevent reflection attack
    private static boolean initialized = false;

//    private String connectionString;

    private DatabaseConnectionManager() {
        super();
        if (initialized) {
            throw new IllegalStateException("DatabaseConnectionManager instance has already been initialized");
        }
        System.out.println("Initializing DatabaseConnectionManager");
    }

    public static DatabaseConnectionManager getDatabaseConnectionManagerInstanceLazily() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
            initialized = true;
        }
        return instance;
    }

    public static DatabaseConnectionManager getConcurrentDatabaseConnectionManagerInstance() {
        if (instance == null) {  // this check avoid locking if instance already created
            synchronized (DatabaseConnectionManager.class) {
                if (instance == null) { // (with lock) ensure only one thread initialize
                    instance = new DatabaseConnectionManager();
                    initialized = true;
                }
            }
        }
        return instance;
    }

    public void getConnection() {
        System.out.println("Connecting to database...");
    }

//    public String getConnectionString() {
//        return connectionString;
//    }

//    public void setConnectionString(String connectionString) {
//        this.connectionString = connectionString;
//    }


//    private Object readResolve() {
//        return instance;                // To resolve serialization issue
//    }
}
