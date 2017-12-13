package com.example.nishant.professor;

/**
 * Created by nishant on 12/12/17.
 */

public class ProfessorList {


    String professor_name;

    public ProfessorList(){

    }

    public ProfessorList(String professor_name){this.professor_name=professor_name;}

    public void setProfessor_name(String professor_name){this.professor_name=professor_name;}
    public String getProfessor_name(){return professor_name;}
}
