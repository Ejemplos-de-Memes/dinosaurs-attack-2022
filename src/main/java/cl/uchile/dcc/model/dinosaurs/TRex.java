package cl.uchile.dcc.model.dinosaurs;

import cl.uchile.dcc.model.dinosaurs.abstract_classes.AbstractCarnivorous;
import cl.uchile.dcc.model.dinosaurs.interfaces.AttackedByAVelociraptor;
import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

public class TRex extends AbstractCarnivorous implements AttackedByAVelociraptor {

  /**
   * Constructor.
   *
   * @param attack puntos de ataque.
   * @param hp     puntos de vida.
   */
  public TRex(int attack, int hp) {
    super(attack, hp);
  }

  /**
   * Attacks a dinosaur
   * @param dinosaur a dinosaur
   */
  public void attack(Dinosaur dinosaur) {
    dinosaur.attackedByTRex(this);
  }

  @Override
  public void attackedByVelociraptor(Velociraptor velociraptor) {
    receiveDamage(velociraptor.getWeightedAttack(0.75));
  }

  @Override
  public void attackedByTriceratops(Triceratops triceratops) {
    receiveDamage(triceratops.getWeightedAttack(1.0));
  }

  @Override
  public void attackedByTRex(TRex tRex) {
    receiveDamage(tRex.getWeightedAttack(1.5));
  }
}
