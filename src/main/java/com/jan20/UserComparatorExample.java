package com.jan20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserComparatorExample {
    public static void main(String[] args) {
        // Create a list of users
        List<User> users = new ArrayList<>();
        users.add(new User("john.doe@example.com", "John", "1234567890"));
        users.add(new User("jane.doe@example.com", "Jane", "0987654321"));
        users.add(new User("alice.smith@example.com", "Alice", "5678901234"));
        users.add(new User("bob.brown@example.com", "Bob", "8765432109"));

        // Print unsorted list
        System.out.println("Before Sorting:");
        for (User user : users) {
            System.out.println(user);
        }

        // Sort the users by name
        Collections.sort(users);

        // Print sorted list
        System.out.println("\nAfter Sorting by Name:");
        for (User user : users) {
            System.out.println(user);
        }
    }
}