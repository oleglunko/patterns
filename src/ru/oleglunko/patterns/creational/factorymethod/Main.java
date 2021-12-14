package ru.oleglunko.patterns.creational.factorymethod;

public class Main {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty(Specialty.PYTHON);
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    private static DeveloperFactory createDeveloperBySpecialty(Specialty specialty) {
        if (specialty.name().equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.name().equalsIgnoreCase("python")) {
            return new PythonDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is not supported");
        }
    }
}
