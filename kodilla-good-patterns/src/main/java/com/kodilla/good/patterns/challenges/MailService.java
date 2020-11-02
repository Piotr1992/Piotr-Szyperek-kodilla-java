
package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {

    public void inform(User getUser) {

        System.out.println("\nSending data of order on email...\nE-mail:\t" + getUser.getAddressEmail());
    }
}
