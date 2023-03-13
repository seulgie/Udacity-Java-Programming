/* Dates and Calendar */

import java.util.Date;

public class TransactionTester {

    public static void main(String[] args) {
    
        Transaction transaction = new Transaction( description: "Withdrawl", new Date(), account: "1111", amount: 20.0);
        System.out.println(transaction);        
    }
}
