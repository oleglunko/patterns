package ru.oleglunko.patterns.creational.abstractfactory.banking;

import ru.oleglunko.patterns.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code");
    }
}
