package oop.bank;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/17/2023, Tuesday
 **/
public class VisaAccount extends BankAccount{
  public static final String CARD_TYPE = "Visa";
  public static final int CREDIT_LIMIT = 100000000;

  @Override
  public void withDraw(int num) {
    System.out.println("with draw from accout : " + getAccountId() + ", card type : " + CARD_TYPE);
    if (getBalance() + CREDIT_LIMIT > num) {
      System.err.println("hello con di ngheo kho :)");
    } else {
      super.setBalance(getBalance() - num);
    }
  }
}
