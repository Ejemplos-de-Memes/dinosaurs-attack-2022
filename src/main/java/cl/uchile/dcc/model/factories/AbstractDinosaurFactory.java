package cl.uchile.dcc.model.factories;

public abstract class AbstractDinosaurFactory implements DinosaurFactory {

  private int attack;
  private int hp;

  public AbstractDinosaurFactory(int attack, int hp) {
    this.attack = attack;
    this.hp = hp;
  }

  public int getAttack() {
    return attack;
  }

  public void setAttack(int attack) {
    this.attack = attack;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }
}
