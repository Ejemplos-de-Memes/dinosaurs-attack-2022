package cl.uchile.dcc.model.dinosaurs.interfaces;

import cl.uchile.dcc.model.dinosaurs.TRex;

public interface Dinosaur {

  /**
   * To use Double Dispatch in attack
   * @param tRex a TRex
   */
  void attackedByTRex(TRex tRex);

}
