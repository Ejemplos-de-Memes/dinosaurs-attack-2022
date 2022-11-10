package cl.uchile.dcc.model.items.bag;

public interface ItemComponent {

  int totalHpToHeal();

  int totalAtkToIncrease();

  String asString(int space);
}
