package cl.uchile.dcc.model.factories;

import cl.uchile.dcc.model.dinosaurs.Velociraptor;

public class VelociraptorFactory extends AbstractDinosaurFactory {

  VelociraptorFactory(int attack, int hp) {
    super(attack, hp);
  }

  @Override
  public Velociraptor create() {
    return new Velociraptor(getAttack(), getHp());
  }
}
