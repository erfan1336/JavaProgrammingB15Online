package day52.WarmUp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {

    public static void main(String[] args) {

        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account("John",10000));
        accountList.add(new Account("Vlad",180000));
        accountList.add(new Account("Hannah",10000));
        accountList.add(new Account("Emme",100250));
        accountList.add(new Account("Atakan",16000));

        //Collections.sort(accountList);


        //Create another account with your name:
        //transfer everyone's money to your account
        Account myAccount = new Account("ERFAN",0);
        for (Account each : accountList){
            each.transferAll(myAccount);
        }
        System.out.println("myAccount = " + myAccount);
    }
}
