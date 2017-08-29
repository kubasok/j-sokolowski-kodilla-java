package com.kodilla.good.patterns.ordering;

public class MailService implements InformationService {
    public void inform(User user, boolean orderStatus){
        if (orderStatus) {
            System.out.println("Ordered successfully. E-mail sent to user: " + user.getUsername());
        } else {
            System.out.println("Order failed. E-mail sent to user: " + user.getUsername());
        }
    }
}
