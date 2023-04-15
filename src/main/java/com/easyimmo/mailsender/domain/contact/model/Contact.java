package com.easyimmo.mailsender.domain.contact.model;

public class Contact {
    private Integer id;
    private String name;
    private String role;
    private String emailAdress;
    private Integer userId;

    private Contact(Builder builder) {
        id = builder.id;
        name = builder.name;
        role = builder.role;
        emailAdress = builder.emailAdress;
        userId = builder.userId;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public Integer getUserId() {
        return userId;
    }


    public static final class Builder {
        private Integer id;
        private String name;
        private String role;
        private String emailAdress;
        private Integer userId;

        public Builder() {
        }

        public Builder withId(Integer val) {
            id = val;
            return this;
        }

        public Builder withName(String val) {
            name = val;
            return this;
        }

        public Builder withRole(String val) {
            role = val;
            return this;
        }

        public Builder withEmailAdress(String val) {
            emailAdress = val;
            return this;
        }

        public Builder withUserId(Integer val) {
            userId = val;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }
    }
}
