package ua.edu.ucu.apps.builder;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Client extends User {
    public static void main(String[] args) {
        Client client = Client.builder()
                .email("andrii.yaroshevych@ucu.edu.ua")
                .build();
        System.out.println(client);
    }
}
