package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        //MARK: dog section
//        Dog bruce = new Dog("Bruce");
//        String nameWithType = bruce.getName("German");
//        String nameWithBreed = bruce.getName("German", "Red");
//
//        //MARK: user section
//        User kwame = new User("Kwame");
//        Status kwameStatus = kwame.getStatus();
//        if (kwameStatus.isActive()){
//
//        }

        //create a new instance of the payment class
        Payment payment = new Payment("0500294411","VOD",10.56,"GHS");
        System.out.println(payment.getPhoneNumber());


    }




}
