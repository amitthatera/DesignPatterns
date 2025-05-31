package com.example.design_patterns.singleton;


//BEST PRACTICE FOR SINGLETON PATTERN BECAUSE ENUM ARE :
// REFLECTION-SAFE, SERIALIZATION-SAFE, THREAD-SAFE

/* LIMITATION:
   1.  Cant lazy load with argument cause it always eagerly load
   2.  Enums are final can't be subclassed or mock. Harder to unit test
   3.  Not inheritable
 */
public enum DatabaseConnectionManagerEnum {

    INSTANCE;

    private static DatabaseConnectionManagerEnum instance;

    public void getConnection() {
        System.out.println("Connecting to database...");
    }
}
