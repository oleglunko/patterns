package ru.oleglunko.patterns.creational.abstractfactory.website;

import ru.oleglunko.patterns.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("PHP developer writes PHP code");
    }
}
