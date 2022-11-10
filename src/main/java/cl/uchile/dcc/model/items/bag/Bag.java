package cl.uchile.dcc.model.items.bag;

import java.util.ArrayList;

public class Bag implements ItemComponent {

  private final String name;

  public Bag(String name) {

    this.name = name;
  }

  private final ArrayList<ItemComponent> items = new ArrayList<>();

  public void add(ItemComponent item) {
    items.add(item);
  }

  public void remove(ItemComponent item) {
    items.remove(item);
  }

  public ArrayList<ItemComponent> getItems() {
    return items;
  }


  @Override
  public int totalHpToHeal() {
    int sum = 0;
    for (ItemComponent item : items) {
      sum += item.totalHpToHeal();
    }
    return sum;
  }

  @Override
  public int totalAtkToIncrease() {
    int sum = 0;
    for (ItemComponent item : items) {
      sum += item.totalAtkToIncrease();
    }
    return sum;
  }

  @Override
  public String asString(int space) {
    String tab = " ".repeat(space);
    StringBuilder toReturn = new StringBuilder(tab + name + ": [\n");
    for (ItemComponent item :
        items) {
      toReturn.append(item.asString(space + 2)).append(",\n");
    }
    toReturn.append(tab).append(']');
    return toReturn.toString();
  }

  @Override
  public String toString() {
    return asString(0);
  }
}
