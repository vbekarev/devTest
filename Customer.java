package net.proselyte.gittutorial.company;

import java.util.Set;

/**
 * Simple JavaBean domain object that represents a Customer
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */
public class Customer {
    private Set projects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getProjects() {
        return projects;
    }

    public void setProjects(Set projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", projects=" + projects +
                '}';
    }
}
