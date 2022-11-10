package cl.uchile.dcc.model.states;

public class SadMood extends AbstractMood {

  @Override
  public double getWeightForAttack() {
    return 0.5;
  }

  @Override
  public void toNormalMood() {
    changeMood(new NormalMood());
  }
}
