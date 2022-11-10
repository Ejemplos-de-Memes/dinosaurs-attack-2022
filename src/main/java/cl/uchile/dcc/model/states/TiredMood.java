package cl.uchile.dcc.model.states;

public class TiredMood extends AbstractMood {

  @Override
  public double getWeightForAttack() {
    return 0.75;
  }

  @Override
  public void toNormalMood() {
    changeMood(new NormalMood());
  }
}
