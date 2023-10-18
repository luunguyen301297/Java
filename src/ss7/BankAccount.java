package ss7;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/17/2023, Tuesday
 **/
public abstract class BankAccount {
  private int balance;
  private String accountId;

  public void deposit(int num) {
    this.balance += num;
  }

  public abstract void withDraw(int num) throws NotEnoughMoneyExeption;

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAccountId() {
    return accountId;
  }

  public void setId(String accountId) {
    this.accountId = accountId;
  }
}
