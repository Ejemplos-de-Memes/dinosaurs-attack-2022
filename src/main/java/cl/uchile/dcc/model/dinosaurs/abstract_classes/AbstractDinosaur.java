package cl.uchile.dcc.model.dinosaurs.abstract_classes;

import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;

public abstract class AbstractDinosaur implements Dinosaur {

  private final int attack;
  private int hp;

  /**
   * Constructor.
   *
   * @param attack puntos de ataque.
   * @param hp puntos de vida.
   */
  public AbstractDinosaur(int attack, int hp) {
    this.attack = attack;
    this.hp = hp;
  }

  /**
   * Gets the HP
   * @return the HP
   */
  private int getHp() {
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
  private int getAttack() {
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
