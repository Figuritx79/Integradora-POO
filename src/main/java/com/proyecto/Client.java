package com.proyecto;

public class Client {
    String name;
    int age;
    String matricula;

    public Client(String name, int age, String matricula) {
        this.name = name;
        this.age = age;
        this.matricula = matricula;
    }

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
