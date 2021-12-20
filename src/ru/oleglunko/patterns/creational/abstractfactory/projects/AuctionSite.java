package ru.oleglunko.patterns.creational.abstractfactory.projects;

import ru.oleglunko.patterns.creational.abstractfactory.Developer;
import ru.oleglunko.patterns.creational.abstractfactory.ProjectManager;
import ru.oleglunko.patterns.creational.abstractfactory.ProjectTeamFactory;
import ru.oleglunko.patterns.creational.abstractfactory.Tester;
import ru.oleglunko.patterns.creational.abstractfactory.website.WebsiteTeamFactory;

public class AuctionSite {

    public static void main(String[] args) {
        ProjectTeamFactory teamFactory = new WebsiteTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager projectManager = teamFactory.getProjectManager();

        System.out.println("Create auction site!");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
