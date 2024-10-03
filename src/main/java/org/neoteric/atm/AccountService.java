package org.neoteric.atm;

import java.time.Period;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;

public class AccountService {

    public Account createAccount(User user){

        Account account=new Account();
        account.accountNumber= UUID.randomUUID().toString();
        account.user=user;


        return account;

    }

    public DebitCard issueDebitCard(Account account) {
        DebitCard debitCard = new DebitCard();
        debitCard.atmNumber = "222222";
        debitCard.cvv = "889";

        // Get current date and time in UTC
        ZonedDateTime utcNow = ZonedDateTime.now(ZoneOffset.UTC);
        debitCard.fromDate = Date.from(utcNow.toInstant());

        // Set expiry date to 5 years in the future
        ZonedDateTime expiryDate = utcNow.plus(Period.ofYears(5));
        debitCard.toDate = Date.from(expiryDate.toInstant());

        return debitCard;
    }
}
