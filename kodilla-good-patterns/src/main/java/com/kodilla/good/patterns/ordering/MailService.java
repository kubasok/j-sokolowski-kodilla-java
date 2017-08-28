package com.kodilla.good.patterns.ordering;

public class MailService implements InformationService {
    public void inform(User user){
        System.out.println("E-mail sent to user: " + user.getUsername());
    }
}
