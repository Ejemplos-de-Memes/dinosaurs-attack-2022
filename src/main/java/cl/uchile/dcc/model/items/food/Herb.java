package cl.uchile.dcc.model.items.food;

import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

public class Herb implements HerbivorousFood {

  private final int hpToHeal;

  public Herb(int hpToHeal) {
    this.hpToHeal = hpToHeal;
  }

  @Override
  public String toString() {
    return "Herb{" +
        "hpToHeal=" + hpToHeal +
        '}';
  }

  @Override
  public void updateStats(Dinosaur dinosaur) {
    dinosaur.increaseHp(hpToHeal);
  }

  @Override
  public int totalHpToHeal() {
    return hpToHeal;
  }

  @Override
  public int totalAtkToIncrease() {
    return 0;
  }

  @Override
  public String asString(int space) {
    return " ".repeat(space) + toString();
  }
}
