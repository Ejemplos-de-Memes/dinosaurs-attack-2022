package cl.uchile.dcc.model.items;

import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

public class Meat implements CarnivorousFood {

  private final int hpToHeal;
  private final int atkToIncrease;

  public Meat(int hpToHeal, int atkToIncrease) {

    this.hpToHeal = hpToHeal;
    this.atkToIncrease = atkToIncrease;
  }

  @Override
  public void updateStats(Dinosaur dinosaur) {
    dinosaur.increaseHp(hpToHeal);
    dinosaur.increaseAttack(atkToIncrease);
  }
}
