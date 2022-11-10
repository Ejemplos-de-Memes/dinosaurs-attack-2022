package cl.uchile.dcc.model.dinosaurs.abstract_classes;

import cl.uchile.dcc.model.dinosaurs.interfaces.Carnivorous;

public abstract class AbstractCarnivorous extends AbstractDinosaur implements Carnivorous {

  /**
   * Constructor.
   *
   * @param attack puntos de ataque.
   * @param hp     puntos de vida.
   */
  public AbstractCarnivorous(int attack, int hp) {
    super(attack, hp);
  }
}
