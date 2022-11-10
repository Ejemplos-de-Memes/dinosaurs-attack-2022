package cl.uchile.dcc.model.factories;

import cl.uchile.dcc.model.dinosaurs.Diplodocus;
import cl.uchile.dcc.model.dinosaurs.TRex;

public class TRexFactory extends AbstractDinosaurFactory {
  public TRexFactory(int attack, int hp) {
    super(attack, hp);
  }

  @Override
  public TRex create() {
    return new TRex(getAttack(), getHp());
  }
}
