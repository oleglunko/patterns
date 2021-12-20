package ru.oleglunko.patterns.creational.abstractfactory.website;

import ru.oleglunko.patterns.creational.abstractfactory.Developer;
import ru.oleglunko.patterns.creational.abstractfactory.ProjectManager;
import ru.oleglunko.patterns.creational.abstractfactory.ProjectTeamFactory;
import ru.oleglunko.patterns.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
