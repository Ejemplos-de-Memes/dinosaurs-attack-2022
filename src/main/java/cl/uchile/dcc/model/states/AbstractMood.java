package cl.uchile.dcc.model.states;

import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;
import cl.uchile.dcc.model.exceptions.NotPermittedMoodException;

public abstract class AbstractMood implements Mood {

  private Dinosaur dinosaur;

  @Override
  public void setDinosaur(Dinosaur dinosaur) {
    this.dinosaur = dinosaur;
  }

  private Dinosaur getDinosaur() {
    return dinosaur;
  }

  public void changeMood(Mood mood) {
    getDinosaur().setMood(mood);
  }

  private void error() {
    throw new NotPermittedMoodException("Wrong mood.");
  }

  @Override
  public void toFuriousMood() {
    error();
  }

  @Override
  public void toNormalMood() {
    error();
  }

  @Override
  public void toSadMood() {
    error();
  }

  @Override
  public void toTiredMood() {
    error();
  }
}
