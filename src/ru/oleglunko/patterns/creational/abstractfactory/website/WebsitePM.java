package ru.oleglunko.patterns.creational.abstractfactory.website;

import ru.oleglunko.patterns.creational.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Website PM manage website project");
    }
}
