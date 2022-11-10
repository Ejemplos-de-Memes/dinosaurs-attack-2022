package cl.uchile.dcc.model.items;

import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

public class Herb implements Food {

  private final int hpToHeal;

  public Herb(int hpToHeal) {
    this.hpToHeal = hpToHeal;
  }

  @Override
  public void updateStats(Dinosaur dinosaur) {
    dinosaur.increaseHp(hpToHeal);
  }
}
