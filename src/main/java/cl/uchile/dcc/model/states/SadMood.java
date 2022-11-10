package cl.uchile.dcc.model.states;

public class SadMood implements Mood {

  @Override
  public double getWeightForAttack() {
    return 0.5;
  }
}
