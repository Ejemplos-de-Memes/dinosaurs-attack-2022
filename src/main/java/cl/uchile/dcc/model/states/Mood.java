package cl.uchile.dcc.model.states;

public interface Mood {

  /**
   * Método que retorna el peso para el ataque dependiendo del estado de ánimo.
   *
   * @return El peso de ponderación para el ataque.
   */
  double getWeightForAttack();

}
