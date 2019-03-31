/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.time.LocalDate;



/**
 *
 * @author 79803
 */
public class Persons implements Person{
    private String name;            // имя
    private LocalDate birthdate;    // дата рождения
    
    Persons (String name, LocalDate birthdate){
        this.name = name;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return  name + " " +birthdate;
    }
    
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthdate;
    }

    @Override
    public int compareTo(Object o) {              // сравнивает текущий объект с другим объектом
        Persons pers = (Persons)o;
        if(this.name.compareTo(pers.name)>0){ return 1;}
        else if (this.name.compareTo(pers.name) < 0) {return -1;} 
        else if (this.birthdate.compareTo(pers.birthdate) > 0) {return 1;}
        else if (this.birthdate.compareTo(pers.birthdate) < 0) {return -1;}
        else {return 0;}
    }
    
}
