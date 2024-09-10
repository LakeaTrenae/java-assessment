package org.humanity;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private String name;
    private LocalDate birthDate;

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    private boolean isVegetarian;

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

   public Person(String name, LocalDate birthDate){
        this.name = name;
        this.birthDate = birthDate;
   }

    public Person(String name, LocalDate birthDate, boolean isVegetarian) {
        this.name = name;
        this.birthDate = birthDate;
        this.isVegetarian = isVegetarian;
    }

    public void eat(){
        System.out.println(getName() + " is eating their favorite food.");
    }

    public void eat(Food favoriteFood) throws VegetarianException{
        if (isVegetarian && (favoriteFood == Food.CHICKEN || favoriteFood == Food.FISH)){
            throw new VegetarianException(getName() + " is a vegetarian and does not eat" + favoriteFood);
        }
        System.out.println(name + " is eating " + favoriteFood.name().toLowerCase() + ".");
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name ='" + getName() + "', birthDate="
                + getBirthDate() + " isVegetarian = " + isVegetarian();
    }
}