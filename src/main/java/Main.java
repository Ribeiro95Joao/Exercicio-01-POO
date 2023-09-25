import entities.Person;
import resources.FindPerson;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Person> namesList = new ArrayList<>();

        System.out.println("Enter the number of the people to record:");
        int numberOfPeople = scan.nextInt();

        for(int i = 0; i < numberOfPeople; i++){
            scan.nextLine();
            System.out.println("Enter the name of the person:");
            String name = scan.nextLine();
            System.out.println("Enter the age of " + name + ":");
            int age = scan.nextInt();
            Person person = new Person(age, name);
            namesList.add(person);
        }

        System.out.println("Enter the name that want to see the data:");
        scan.nextLine();
        String name = scan.nextLine();
        boolean finded = false;

        for(Person p : namesList){
            FindPerson findPerson = new FindPerson(p, name);
            if(findPerson.findPerson() == true){
                finded =  true;
            }
        }

        if(finded == false){
            System.out.println(name + " inst in the list!");
        }


    }
}
