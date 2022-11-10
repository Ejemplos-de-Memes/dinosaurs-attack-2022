package cl.uchile.dcc.model.states;

import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

public interface Mood {

  /**
   * Método que retorna el peso para el ataque dependiendo del estado de ánimo.
   *
   * @return El peso de ponderación para el ataque.
   */
  double getWeightForAttack();

  void setDinosaur(Dinosaur dinosaur);

  void toFuriousMood();

  void toNormalMood();

  void toSadMood();

  void toTiredMood();

}
