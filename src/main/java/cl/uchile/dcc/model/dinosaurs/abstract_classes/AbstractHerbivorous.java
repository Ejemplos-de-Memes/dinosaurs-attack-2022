package cl.uchile.dcc.model.dinosaurs.abstract_classes;

import cl.uchile.dcc.model.dinosaurs.interfaces.Herbivorous;

public abstract class AbstractHerbivorous extends AbstractDinosaur implements Herbivorous {

  /**
   * Constructor.
   *
   * @param attack puntos de ataque.
   * @param hp     puntos de vida.
   */
  public AbstractHerbivorous(int attack, int hp) {
    super(attack, hp);
  }
}
