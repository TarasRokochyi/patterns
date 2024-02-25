package org.example.creational.prototype;

import javax.swing.*;

public class Patron implements Prototype{

    public String Name;
    public String Species;
    public String Skills;

    public Patron(String name, String species, String skills){
        Name = name;
        Species = species;
        Skills = skills;
    }

    @Override
    public Prototype doClone() {
        return new Patron(Name, Species, Skills);
    }

    @Override
    public String toString() {
        return "Name: "+Name+", Species: "+Species+", Skills: "+Skills;
    }
}
