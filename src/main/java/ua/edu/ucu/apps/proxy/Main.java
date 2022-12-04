package ua.edu.ucu.apps.proxy;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProxyImage realImage = new ProxyImage("img.jpg");
        System.out.println("To show the image, answer True or False (t/f):");
        System.out.println("""
                WLLN guarantees that for every distribution 𝐹 with mean 𝜇 and every 𝜀>0 one can find
                𝑁>0 such that as soon as a sample from distribution 𝐹 is of size 𝑛≥𝑁,
                then its sample mean 𝐱 satisfies |𝐱−𝜇|≤𝜀""");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("false") || answer.equalsIgnoreCase("f")) {
            realImage.display();
        } else {
            System.out.println("You are not allowed to see the image");
        }
    }
}