package com.company.Collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Example {
    public static void main(String[] args) {
        Set<User> group = new TreeSet<>();
        group.add(new User("login1", "pass1", "email@.com"));
        group.add(new User("login1", "pass3", "email1@.com"));
        User user = new User("login2", "pass2", "email333@.com");
        group.add(user);
        group.add(user);
        System.out.println(group);
    }
}
class User implements Comparable<User>{
    String login;
    String password;
    String email;
    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return this.login.compareTo(o.login) * this.email.compareTo(o.email);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return login.equals(user.login) || email.equals(user.email);
//
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(login + email);
//    }
}
