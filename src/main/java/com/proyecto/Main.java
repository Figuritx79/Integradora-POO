package com.proyecto;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Client client;
    private static final String CSVROUTE = "./cliente.csv";

    public static void main(String[] args) {
        // Preguntamos cuantos alumnos desea ingresar
        System.out.println("Cuantos alumnos desea crear");
        int alumnosCrear = scanner.nextInt();

        try (BufferedWriter writer = Files.newBufferedWriter(
                Paths.get(CSVROUTE),
                StandardOpenOption.APPEND,
                StandardOpenOption.CREATE);
                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT)) {
            csvPrinter.printRecord("Name", "Age", "Matricula");
            // Creamos un buble para registrar a los alumnos
            for (int i = 0; i < alumnosCrear; i++) {
                // Llamamos a la funcion o metodo
                Client storageClient = createStudent();
                csvPrinter.printRecord(storageClient.getName(), storageClient.getAge(), storageClient.getMatricula());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    // Este metedo crea un nuevo estudiate
    public static Client createStudent() {
        client = new Client();

        System.out.println("Ingresa el nombre del estudiante");
        String name = scanner.next();
        client.setName(name);

        System.out.println("Ingresa la edad del estudiante");
        int age = scanner.nextInt();
        client.setAge(age);

        System.out.println("Ingresa la matricula del estudiante");
        String matricula = scanner.next();
        client.setMatricula(matricula);

        return client;
    }

}