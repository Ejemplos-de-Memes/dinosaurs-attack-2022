package cl.uchile.dcc;

import cl.uchile.dcc.model.dinosaurs.TRex;
import cl.uchile.dcc.model.factories.TRexFactory;
import cl.uchile.dcc.model.items.bag.Bag;
import cl.uchile.dcc.model.items.food.Herb;
import cl.uchile.dcc.model.items.food.Meat;
import cl.uchile.dcc.model.items.food.NullFood;
import cl.uchile.dcc.model.states.FuriousMood;
import cl.uchile.dcc.model.states.NormalMood;
import cl.uchile.dcc.model.states.SadMood;
import cl.uchile.dcc.model.states.TiredMood;

public class Main {

  public static void main(String[] args) {
    TRexFactory tRexFactory = new TRexFactory(20, 20);
    TRex tRex = tRexFactory.create();
    System.out.println("Ataque: " + tRex.getAttack());
    tRex.toFuriousMood();
    System.out.println("Ataque: " + tRex.getAttack());
    tRex.toTiredMood();
    System.out.println("Ataque: " + tRex.getAttack());
    // Lanza error
//    tRex.toSadMood();
//    System.out.println("Ataque: " + tRex.getAttack());
    tRexFactory.setHp(30);
    TRex otherTRex = tRexFactory.create();
    System.out.println(tRex);
    System.out.println(otherTRex);

    Bag bag1 = new Bag("Principal");
    Bag bag2 = new Bag("Mochila 1");
    bag2.add(new Herb(42));
    bag1.add(bag2);
    bag2.add(new Meat(32, 23));
    Bag bag3 = new Bag("Mochila 2");
    bag1.add(bag3);
    bag3.add(new Meat(13, 31));
    bag1.add(new NullFood());
    System.out.println(bag1);

  }
}
