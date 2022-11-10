package cl.uchile.dcc.model.states;

public class NormalMood extends AbstractMood {

  @Override
  public double getWeightForAttack() {
    return 1.0;
  }

  @Override
  public void toFuriousMood() {
    changeMood(new FuriousMood());
  }

  @Override
  public void toSadMood() {
    changeMood(new SadMood());
  }
}
