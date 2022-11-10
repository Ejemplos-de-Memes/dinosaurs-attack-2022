package cl.uchile.dcc.model.dinosaurs;

import cl.uchile.dcc.model.dinosaurs.abstract_classes.AbstractCarnivorous;
import cl.uchile.dcc.model.dinosaurs.interfaces.AttackedByAVelociraptor;

public class Velociraptor extends AbstractCarnivorous {

  /**
   * Constructor.
   *
   * @param attack puntos de ataque.
   * @param hp     puntos de vida.
   */
  public Velociraptor(int attack, int hp) {
    super(attack, hp);
  }

  /**
   * Attacks a dinosaur
   * @param dinosaur a dinosaur
   */
  public void attack(AttackedByAVelociraptor dinosaur) {
    dinosaur.attackedByVelociraptor(this);
  }

  @Override
  public void attackedByTriceratops(Triceratops triceratops) {
    receiveDamage(triceratops.getWeightedAttack(1.0));
  }

  @Override
  public void attackedByTRex(TRex tRex) {
    receiveDamage(tRex.getWeightedAttack(2.0));
  }
}
