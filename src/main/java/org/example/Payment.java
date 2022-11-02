package org.example;

/**
 * created to handle all payments momo payments
 */
public class Payment {
    //number to process payment
    private String phoneNumber;
    //payment network
    private String network;
    //amount to pay
    private double amount;
    //the currency of the payment
    private String currency;

    /**
     * Initial constructor for the payment class
     * @param phoneNumber phone number for payment
     * @param network payment network
     * @param amount the amount in double to pay for
     * @param currency the currency for payment
     */
    public Payment(String phoneNumber, String network, double amount, String currency){
        this.amount = amount;
        this.currency = currency;
        this.network = network;
        this.phoneNumber = formatPhoneNumber(phoneNumber);

    }

    /**
     *
     * @param number the number to be formatted
     * @return a string of number with +233
     */
    private String formatPhoneNumber(String number){
        if (number.startsWith("0") && number.length() == 10){
            return  "+233" + number.substring(1,10);
        }
        return number;
    }

    /**
     *
     * @return string of the payment number with +233
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
