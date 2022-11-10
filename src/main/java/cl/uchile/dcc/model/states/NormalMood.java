package cl.uchile.dcc.model.states;

public class NormalMood implements Mood {

  @Override
  public double getWeightForAttack() {
    return 1.0;
  }

}
