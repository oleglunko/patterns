package ru.oleglunko.patterns.creational.factorymethod;

public class PythonDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Python-developer writes Python code");
    }
}
