package cl.uchile.dcc.model.factories;

import cl.uchile.dcc.model.dinosaurs.Triceratops;

public class TriceratopsFactory extends AbstractDinosaurFactory {
  TriceratopsFactory(int attack, int hp) {
    super(attack, hp);
  }

  @Override
  public Triceratops create() {
    return new Triceratops(getAttack(), getHp());
  }

}
