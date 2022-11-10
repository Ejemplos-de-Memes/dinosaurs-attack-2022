package cl.uchile.dcc.model.states;

public class TiredMood implements Mood {

  @Override
  public double getWeightForAttack() {
    return 0.75;
  }
}
