package cl.uchile.dcc.model.states;

public class FuriousMood implements Mood {

  @Override
  public double getWeightForAttack() {
    return 1.5;
  }
}
