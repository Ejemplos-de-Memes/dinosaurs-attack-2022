package cl.uchile.dcc.model.items.food;

import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

public class NullFood implements CarnivorousFood, HerbivorousFood {

  @Override
  public void updateStats(Dinosaur dinosaur) {

  }

  @Override
  public String toString() {
    return "NullFood{}";
  }

  @Override
  public int totalHpToHeal() {
    return 0;
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
