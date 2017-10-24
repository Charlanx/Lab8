

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    /**
     * BankAccountType.
     *
     */
    public enum BankAccountType {
        /**
         * checkings type.
         */
        CHECKINGS,
        /**
         * Savings type.
         */
        SAVINGS,
        /**
         * Student type.
         */
        STUDENT,
        /**
         * Workplace type.
         */
        WORKPLACE,


    }
    /**
     * accountNumber.
     */
    private double accountNumber;
    /**
     * The type of bank account.
     */
    private BankAccountType accountType;
    /**
     * accountbal.
     */
    private double accountBalance;
    /**
     * accountbal.
     * @return accountbal
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     * set account bal.
     * @param number - number.
     */
    public void setAccountBalance(final double number) {
        accountBalance = number;
    }
    /**
     * owner's name.
     */
    private String ownerName;
    /**
     * The interest rate of the bank account.
     */
    private double interestRate;
    /**
     * Interest earned.
     */
    private double interestEarned;
    /**
     *
     * Implementing BankAccount.
     * @param name - name of user
     * @param accountCategory - what type of bank account it is
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
    }
    /**
     * returns name.
     * @return ownername
     */
    public String getName() {

        return ownerName;
    }
    /**
     * gets bank account.
     * @return BankAccountType
     */
    public BankAccountType getBankAccountType() {
        return accountType;
    }
    /**
     * set name.
     * @param name - ..
     */
    public void setName(final String name) {
        ownerName = name;
    }
    /**
     * set account name.
     * @param accountCategory - l.
     */
    public void setAccountType(final BankAccountType accountCategory) {
        accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}



