package ru.oleglunko.patterns.creational.factorymethod;

public class PythonDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
