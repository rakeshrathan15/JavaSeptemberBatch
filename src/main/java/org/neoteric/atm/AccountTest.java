package org.neoteric.atm;

public class AccountTest {
    public static void main(String[] args) {
        AccountService accountService= new AccountService();
        User user= new User();
        user.userName="Rakesh";
        user.adharNumber="12345";
        user.pan="22222";
        user.mobileNumber="7013776567";



       Account rakeshAccount= accountService.createAccount(user);

        System.out.println(rakeshAccount.accountNumber);

        accountService.issueDebitCard(rakeshAccount);



    }
}
