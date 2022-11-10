package cl.uchile.dcc.model.dinosaurs.abstract_classes;

import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;
import cl.uchile.dcc.model.states.Mood;
import cl.uchile.dcc.model.states.NormalMood;

public abstract class AbstractDinosaur implements Dinosaur {

  private final int attack;
  private int hp;
  private Mood mood;

  /**
   * Constructor.
   *
   * @param attack puntos de ataque.
   * @param hp puntos de vida.
   */
  public AbstractDinosaur(int attack, int hp) {
    this.attack = attack;
    this.hp = hp;
    this.mood = new NormalMood();
    this.mood.setDinosaur(this);
  }

  /**
   * Gets the HP
   * @return the HP
   */
  public int getHp() {
    return hp;
  }

  /**
   * Sets the HP
   * @param hp the HP to set
   */
  private void setHp(int hp) {
    this.hp = hp;
  }

  /**
   * Gets the attack
   * @return the attack
   */
  public int getAttack() {
    return (int) (getBaseAttack() * mood.getWeightForAttack());
  }

  @Override
  public void setMood(Mood mood) {
    this.mood = mood;
    this.mood.setDinosaur(this);
  }

  @Override
  public void toFuriousMood() {
    mood.toFuriousMood();
  }

  @Override
  public void toNormalMood() {
    mood.toNormalMood();
  }

  @Override
  public void toSadMood() {
    mood.toSadMood();
  }

  @Override
  public void toTiredMood() {
    mood.toTiredMood();
  }

  public int getBaseAttack() {
    return attack;
  }

  /**
   * Method to receive damage
   * @param damage the damage
   */
  protected void receiveDamage(int damage) {
    setHp(getHp() - damage);
  }

  /**
   * Gets the weighted damage
   * @param weight the weight
   * @return the damage weighted
   */
  public int getWeightedAttack(double weight) {
    return (int) weight * getAttack();
  }
}
