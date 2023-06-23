package gr.aueb.cf.model;

import gr.aueb.cf.exceptions.InsufficientBalanceException;
import gr.aueb.cf.exceptions.NegativeAmountException;
import gr.aueb.cf.exceptions.SsnNotValidException;

public class OverdraftAccount extends Account {

    public OverdraftAccount() {}

    public OverdraftAccount(User holder, String iban, double balance) {
        super(holder, iban, balance);
    }

    @Override
    public void withdraw(double amount, String Ssn)
            throws InsufficientBalanceException, SsnNotValidException, NegativeAmountException {
        try {
            if (amount < 0) throw new NegativeAmountException(amount);
            if(!isSsnValid(Ssn)) throw new SsnNotValidException(Ssn);

            setBalance(getBalance() - amount);
        } catch (SsnNotValidException | NegativeAmountException e) {
            System.out.println("Error: withdrawal");
            throw e;
        }
    }
}
