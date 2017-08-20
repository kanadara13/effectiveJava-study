package com.effective.study.rule1;

import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class StaticFactoryTest {


    @Test
    public void test(){
        //StaticFactory factory = new StaticFactory();
        Person factory = Person.getInstanceWithNameForReadability("java");
        assertEquals("java",factory.getName());
        assertNotNull(factory);

        //Inaccessible
        Parents parents = new Parents();
        parents.setName("go");
        Person.Child child = new Person.Child(parents);
        assertEquals("go",child.getParents().getName());

        Person.getFamily("Ruby on the jail");

        System.out.println(Person.getFamilyDescription("Ruby on the jail"));

        assertNotNull(Person.getChild("java"));
        assertEquals("java",Person.getChild("java").getParents().getName());

        //Collections.checkedList()
        Teams.getSalesTeam();
        Teams.getTechTeam();
    }
}