package ua.edu.ucu.apps.builder;

import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@ToString
public class User {
    private int id;
    private String name;
    private String email;
    private int age;
    private double weight;
    private double height;
    @Singular
    private List<String> occupations;

    public static void main(String[] args) {
        User user = User.builder()
                .id(1)
                .name("Andrew")
                .email("ayaroshlvua@gmail.com")
                .age(18)
                .weight(70.5)
                .height(185.5)
                .occupation("Student")
                .occupation("Programmer")
                .build();
        System.out.println(user);
    }
}
