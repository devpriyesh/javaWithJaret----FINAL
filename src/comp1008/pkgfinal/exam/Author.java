/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1008.pkgfinal.exam;

/**
 *
 * @author Priyesh Hingrajia == 200397594
 */
public class Author {
    private String name , email ;
    private char gender ;

    /**
     * constructor
     * @param name
     * @param email
     * @param gender 
     */
    public Author(String name, String email, char gender) {
        setName(name);
        setEmail(email);
        setGender(gender);
    }
/**
 * getName()
 * @return 
 */
    public String getName() {
        return name;
    }
/**
 * setName()
 * @param name 
 */
    public void setName(String name) {
        if(!name.isEmpty())
            this.name = name;
        else 
            throw new IllegalArgumentException("Name can not be empty !! Please enter the valid name.");
    }

    /**
     * getEmail()
     * @return 
     */
    public String getEmail() {
        return email;
    }

    /**
     * setEmail()
     * @param email 
     */
    public void setEmail(String email) {
        if(!email.isEmpty())
            this.email = email;
        else 
            throw new IllegalArgumentException("Email can not be empty !! Please enter the valid email.");
    }

    
    /**
     * getGender()
     * @return 
     */
    public char getGender() {
        return gender;
    }

    
    /**
     * setGender()
     * @param gender 
     */
    public void setGender(char gender) {
        if(gender == 'm' ||
           gender == 'f' ||
           gender == 'o') {
            this.gender = gender;
        }else {
             throw new IllegalArgumentException("Please select from Male , Female or Others");
        }
    }
    
    /**
     * toString()
     * @return 
     */
    public String toString() {
        return String.format("%s -> %s", name , email);
    }
}
