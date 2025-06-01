package com.example.design_patterns.builder;

/*
  Definition:
  The Builder Design Pattern is a creational pattern used in software design to construct complex objects step by step.
  It allows the construction process to vary depending on the type of object being built, while keeping the construction logic separate
  from the object itself.

  For example, imagine you want to create a User object that contains many fields, some of which are optional.
  Without using the builder pattern:
  -> You would have to overload constructors multiple times, which is hard to manage and remember due to the number and order of
  parameters.
  -> Alternatively, you could use getters and setters, but this approach makes the object mutable, which might not be desirable
  in all cases.

  To solve these issues, the Builder Pattern is a good choice because it:
  -> Helps achieve immutability
  -> Ensures object consistency
  -> Constructs the object only when all required values are set

  cons:
  -> More Code to Write
  -> Complexity for Simple Objects
  -> Duplication of Fields
  -> Harder to Debug:
  	If there's a bug in object creation, it may be harder to trace because of the extra layer introduced by the builder.
 */


public class UserProfile {

    // required parameters
    private String name;

    private String email;

    // optional parameters
    private String phone;

    private String address;

    private String linkedinUrl;

    private String skills;

    public UserProfile(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
        this.linkedinUrl = builder.linkedinUrl;
        this.skills = builder.skills;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", linkedinUrl='" + linkedinUrl + '\'' +
                ", skills='" + skills + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private String email;
        private String phone = "";
        private String address = "";
        private String linkedinUrl = "";
        private String skills = "";

        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder linkedinUrl(String linkedinUrl) {
            this.linkedinUrl = linkedinUrl;
            return this;
        }

        public Builder skills(String skills) {
            this.skills = skills;
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this);
        }
    }
}
