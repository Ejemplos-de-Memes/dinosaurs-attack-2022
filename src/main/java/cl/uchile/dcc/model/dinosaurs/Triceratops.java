package cl.uchile.dcc.model.dinosaurs;

import cl.uchile.dcc.model.dinosaurs.abstract_classes.AbstractHerbivorous;
import cl.uchile.dcc.model.dinosaurs.interfaces.Carnivorous;

public class Triceratops extends AbstractHerbivorous {

  /**
   * Constructor.
   *
   * @param attack puntos de ataque.
   * @param hp     puntos de vida.
   */
  public Triceratops(int attack, int hp) {
    super(attack, hp);
  }

  /**
   * Attacks a dinosaur
   * @param dinosaur a dinosaur
   */
  public void attack(Carnivorous dinosaur) {
    dinosaur.attackedByTriceratops(this);
  }

  @Override
  public void attackedByVelociraptor(Velociraptor velociraptor) {
    receiveDamage(velociraptor.getWeightedAttack(0.75));
  }

  @Override
  public void attackedByTRex(TRex tRex) {
    receiveDamage(tRex.getWeightedAttack(1.5));
  }
}
