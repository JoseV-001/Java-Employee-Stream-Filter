package application;

import model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();

            }


            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            System.out.printf("Email of people whose salary is more than %.2f%n", salary);

            List<String> result = list.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(e -> e.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            result.forEach(System.out::println);

            System.out.print("Enter the initial letter: ");
            char initial = sc.next().toUpperCase().charAt(0);

            boolean exists = list.stream()
                    .anyMatch(e -> e.getName().toUpperCase().startsWith(String.valueOf(initial)));

            if (!exists) {
                System.out.println("No employees with that initial. Try another letter.");
            } else {

                double resultC = list.stream()
                        .filter(e -> e.getName().toUpperCase().startsWith(String.valueOf(initial)))
                        .map(e -> e.getSalary())
                        .reduce(0.0, (x, y) -> x + y);

                System.out.printf("Total salary of employees whose name starts with '%c': %.2f%n", initial, resultC);

            }


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}