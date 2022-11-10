package cl.uchile.dcc.model.states;

public class FuriousMood extends AbstractMood {

  @Override
  public double getWeightForAttack() {
    return 1.5;
  }

  @Override
  public void toTiredMood() {
    changeMood(new TiredMood());
  }
}
