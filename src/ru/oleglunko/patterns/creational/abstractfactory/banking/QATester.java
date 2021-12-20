package ru.oleglunko.patterns.creational.abstractfactory.banking;

import ru.oleglunko.patterns.creational.abstractfactory.Tester;

public class QATester implements Tester {

    @Override
    public void testCode() {
        System.out.println("QA tester tests banking code");
    }
}
