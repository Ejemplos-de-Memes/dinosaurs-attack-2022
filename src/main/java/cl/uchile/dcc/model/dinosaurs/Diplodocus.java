package cl.uchile.dcc.model.dinosaurs;

import cl.uchile.dcc.model.dinosaurs.abstract_classes.AbstractHerbivorous;

public class Diplodocus extends AbstractHerbivorous {

  /**
   * Constructor.
   *
   * @param attack puntos de ataque.
   * @param hp     puntos de vida.
   */
  public Diplodocus(int attack, int hp) {
    super(attack, hp);
  }

  @Override
  public void attackedByVelociraptor(Velociraptor velociraptor) {
    receiveDamage(velociraptor.getWeightedAttack(0.5));
  }

  @Override
  public void attackedByTRex(TRex tRex) {
    receiveDamage(tRex.getWeightedAttack(1.0));
  }
}
