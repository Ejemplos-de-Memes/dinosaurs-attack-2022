package cl.uchile.dcc.model.items;

import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

public class NullFood implements CarnivorousFood, HerbivorousFood {

  @Override
  public void updateStats(Dinosaur dinosaur) {

  }
}
