package com.effective.study.rule1;

import sun.dc.pr.PRError;

import java.util.Collections;

public class Person {

    private int seq;
    private String name;
    private int age;
    private Child child;

    public void setChild(Child child) {
        this.child = child;
    }

    public Child getChild() {
        return child;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //do not let accept this constructor
    private Person() {}

    //it's horrible constructor way
    private Person(String name) {
        this.name = name;
    }

    //it's horrible constructor way
    private Person(int seq , String name) {
        this.seq  = seq;
        this.name = name;
    }

    public static Person getInstanceWithNameForReadability(String name){
        return new Person(name);
    }

    public static Child getChild(String name){
     /*   Person person = new Person(name);*/
        /*
        person.setChild(new Child(parents));
        return person.getChild();*/
        Parents parents = new Parents();
        parents.setName(name);
        return new Child(parents);
    }

    public static Family getFamily(String name){
        Family f = new Family(name);
        return f;
    }

    public static String getFamilyDescription(String name){
        Family f = new Family(name);
        return f.getDescription();
    }

    private class Relation {

    }

    private static class Family {

        private String description;

        public Family(String name) {
            this.description = name + " has family";
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    static class Child {

        private Parents parents;
        private int age;
        private String name;

        public Child(Parents parents) {
            this.parents = parents;
        }

        public Parents getParents() {
            return parents;
        }

        public void setParents(Parents parents) {
            this.parents = parents;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    //Collections
}
