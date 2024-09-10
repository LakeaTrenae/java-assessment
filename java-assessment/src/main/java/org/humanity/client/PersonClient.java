package org.humanity.client;

import org.humanity.Food;
import org.humanity.Person;
import org.humanity.VegetarianException;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Jay", LocalDate.of(1966, 12, 5));

        Person p2 = new Person("Kathryn", LocalDate.of(1977, 7, 26), true);

        Person p3 = new Person("Craig", LocalDate.of(1950, 11, 5));

        System.out.println(p1);
        System.out.println();

        System.out.println(p2);
        System.out.println();

        System.out.println(p3);
        System.out.println();

        p1.eat();
        try {
            p1.eat(Food.CHICKEN);
            p2.eat(Food.SALAD);
            p2.eat(Food.CHICKEN);
            p2.eat(Food.NUTS);
        } catch (VegetarianException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(p1.getName() + " is " + p1.getAge() + " years old.");
        System.out.println();
        System.out.println(p2.getName() + " is " + p2.getAge() + " years old.");
        System.out.println();
        System.out.println(p3.getName() + " is " + p3.getAge() + " years old.");
    }
}