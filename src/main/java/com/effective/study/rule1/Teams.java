package com.effective.study.rule1;

import java.util.Collections;

public class Teams {

    private Teams() {

    }

    public static SalesTeam getSalesTeam(){
        return new SalesTeam();
    }


    public static TechTeam getTechTeam(){
        return new TechTeam();
    }

}
