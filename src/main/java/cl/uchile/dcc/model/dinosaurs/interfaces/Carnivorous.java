package cl.uchile.dcc.model.dinosaurs.interfaces;

import cl.uchile.dcc.model.dinosaurs.Triceratops;

public interface Carnivorous extends Dinosaur {

  /**
   * To use Double Dispatch in attack
   * @param triceratops a Triceratops
   */
  void attackedByTriceratops(Triceratops triceratops);

}
