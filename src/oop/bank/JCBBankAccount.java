package oop.bank;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/17/2023, Tuesday
 **/
public class JCBBankAccount extends BankAccount{
  public static final String CARD_TYPE = "JCB";
  public static final int MIN_BALANCE = 50000;

  @Override
  public void withDraw(int num) throws NotEnoughMoneyExeption {
    System.out.println("with draw from accout : " + getAccountId() + ", card type : " + CARD_TYPE);
    if (num > getBalance() - MIN_BALANCE) {
      throw new NotEnoughMoneyExeption("Balance : " + getBalance());
    }
    super.setBalance(getBalance() - num);
  }
}
