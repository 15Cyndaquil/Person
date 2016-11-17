package Person;

/**
 * GNU License
 * Date 11/17/2016
 * @author John Tyler Gafford
 * Purpose:
 * Person class to set name and age.
 */

public class Person {
    private String name;
    private int age;
    /**
     * Initializes person with default name and age: 'Me' and '0'
     */
    public Person(){
        name="Me";
        age=0;
    }
    /**
     * Initializes person with parameter name and age
     * @param name the name of a person
     * @param age the age of a person
     */
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    /**
     * Returns name of person in string
     * @return
     */
    public String getName(){
        return this.name;
    }
    /**
     * Returns age of person in int
     * @return
     */
    public int getAge(){
        return this.age;
    }
    /**
     * Sets name of person with parameter name
     * @param name the new name of a person
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * Sets age of person with parameter age
     * @param age the new age of a person
     */
    public void setAge(int age){
        this.age = age;
    }
    /**
     * Sets name and age of person with parameter
     * @param name the new name of a person
     * @param age the new age of a person
     */
    public void setNameAge(String name, int age){
        this.name = name;
        this.age = age;
    }
    /**
     * Returns both the persons name and age
     */
    public String toString(){
        return "Name: "+this.name+", Age: "+this.age;
    }

}

