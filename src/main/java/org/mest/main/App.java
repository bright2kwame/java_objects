package org.mest.main;

import org.mest.abs_tracts.Business;
import org.mest.abs_tracts.Shape;
import org.mest.abs_tracts.Subject;
import org.mest.abs_tracts.Tech;
import org.mest.cl_asses.Dog;
import org.mest.cl_asses.Payment;
import org.mest.cl_asses.Status;
import org.mest.cl_asses.User;
import org.mest.en_numerators.NetworkType;
import org.mest.in_heritance.Rectangle;
import org.mest.in_heritance.Square;
import org.mest.in_terfaces.BusinessInt;
import org.mest.in_terfaces.SubjectInt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

       //MARK: dog section
        Dog bruce = new Dog("Bruce");
        String nameWithType = bruce.getName("German");
        String nameWithBreed = bruce.getName("German", "Red");

        //MARK: user section
        User kwame = new User("Kwame");
        Status kwameStatus = kwame.getStatus();
        if (kwameStatus.isActive()){

        }

        //create a new instance of the payment class
        Payment payment = new Payment("0500294411", "VOD", 10.56, "GHS");
        System.out.println(payment.getPhoneNumber());


        Shape shape1 = new Square(10, 400);
        Shape shape2 = new Rectangle(10, 400, 500);

        double areaOfSquare = shape1.findArea();
        double areaOfRec = shape2.findArea();

        System.out.println("Area is: " + areaOfSquare);
        System.out.println("Area is: " + areaOfRec);

        chooseNetwork(NetworkType.AIRTEL_TIGO);

        List<String> seniorNames = new ArrayList<>();
        seniorNames.add("Bright");

        List<String> juniorNames = new ArrayList<>();
        juniorNames.add("Tiny");

        seniorNames.addAll(juniorNames);

        HashMap<Integer, String> seniorNameHash = new HashMap<Integer,String>();
        seniorNameHash.put(10,"Bright");


        //MARK: using the subject abstracts
        Subject business = new Business(10);
        business.represent();

        Subject tech = new Tech(10);
        tech.represent();

        SubjectInt businessInt = new BusinessInt();
        businessInt.represent();

    }

    private static void chooseNetwork(NetworkType networkType) {
        networkType.name();
    }


}
