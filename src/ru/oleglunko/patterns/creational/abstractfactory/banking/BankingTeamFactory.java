package ru.oleglunko.patterns.creational.abstractfactory.banking;

import ru.oleglunko.patterns.creational.abstractfactory.Developer;
import ru.oleglunko.patterns.creational.abstractfactory.ProjectManager;
import ru.oleglunko.patterns.creational.abstractfactory.ProjectTeamFactory;
import ru.oleglunko.patterns.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
