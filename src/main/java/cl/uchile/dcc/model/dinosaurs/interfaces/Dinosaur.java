package cl.uchile.dcc.model.dinosaurs.interfaces;

import cl.uchile.dcc.model.dinosaurs.TRex;
import cl.uchile.dcc.model.states.Mood;

public interface Dinosaur {

  /**
   * To use Double Dispatch in attack
   * @param tRex a TRex
   */
  void attackedByTRex(TRex tRex);

  /**
   * Setea un mood
   * @param mood un mood
   */
  void setMood(Mood mood);

  void toFuriousMood();

  void toNormalMood();

  void toSadMood();

  void toTiredMood();

}
