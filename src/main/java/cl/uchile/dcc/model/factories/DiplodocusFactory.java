package cl.uchile.dcc.model.factories;

import cl.uchile.dcc.model.dinosaurs.Diplodocus;
import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

public class DiplodocusFactory extends AbstractDinosaurFactory {
  DiplodocusFactory(int attack, int hp) {
    super(attack, hp);
  }

  @Override
  public Diplodocus create() {
    return new Diplodocus(getAttack(), getHp());
  }
}
