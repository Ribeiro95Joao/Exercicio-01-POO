package resources;

import entities.Person;

public class FindPerson {

    private Person person;
    private String name;


    public FindPerson(Person person, String name) {
        this.person = person;
        this.name = name;
    }

    public boolean findPerson(){
        if(person.getName().equals(name) == true){
            System.out.println(person.getName() + " has " + person.getAge() + " years old.");
            return true;
        }
        else{
            return false;
        }
    }
}
