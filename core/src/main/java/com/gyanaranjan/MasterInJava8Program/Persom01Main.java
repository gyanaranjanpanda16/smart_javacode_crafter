package com.gyanaranjan.MasterInJava8Program;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Persom01Main {
    public static void main(String[] args) {
        List<Person01> people = new ArrayList<>();
        people.add(new Person01("Abc",30,new Address("Bhadark"),
                new ContactInfo("87877898")));
        people.add(new Person01("Rahul",20,new Address("Bhubanswar"),
                new ContactInfo("8787788989")));
        people.add(new Person01("Radha",15,new Address("Bangalore"),
                new ContactInfo("87788998")));
        people.add(new Person01("Apple",35,new Address("Bangalore"),
                new ContactInfo("87788998")));
        //sort according to address :--
        people.sort(Comparator.comparing((Person01 person1)->person1.getAddress().getCity()).thenComparing(Person01::getName));
        people.forEach(p->System.out.println(p.getName()+" : "+p.getAge()+" : "+p.getAddress().getCity()+"  :  "+p.getContactInfo().getPhoneNumber()));
    }
}
