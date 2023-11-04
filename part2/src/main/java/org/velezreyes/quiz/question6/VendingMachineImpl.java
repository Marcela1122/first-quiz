package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

  private int quarters;

  private static VendingMachine instance = new VendingMachineImpl();

  private VendingMachineImpl() {
    this.quarters = 0;
  }

  public static VendingMachine getInstance() {
    return instance;
  }

  @Override
  public void insertQuarter() {
    quarters++;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    if ("ScottCola".equals(name)) {
      if (quarters >= 3) {
        quarters -= 3;
        return new ScottCola();
      } else {
        throw new NotEnoughMoneyException();
      }
    } else if ("KarenTea".equals(name)) {
      if (quarters >= 4) {
        quarters -= 4;
        return new KarenTea();
      } else {
        throw new NotEnoughMoneyException();
      }
    } else {
      throw new UnknownDrinkException();
    }
  }
}
