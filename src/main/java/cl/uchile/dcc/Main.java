package cl.uchile.dcc;

import cl.uchile.dcc.model.dinosaurs.TRex;
import cl.uchile.dcc.model.factories.TRexFactory;
import cl.uchile.dcc.model.items.bag.Bag;
import cl.uchile.dcc.model.items.food.Herb;
import cl.uchile.dcc.model.items.food.Meat;
import cl.uchile.dcc.model.items.food.NullFood;

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

    Bag principal = new Bag("Principal");
    Bag mochila1 = new Bag("Mochila 1");
    mochila1.add(new Herb(42));
    principal.add(mochila1);
    mochila1.add(new Meat(32, 23));
    Bag mochila2 = new Bag("Mochila 2");
    principal.add(mochila2);
    mochila2.add(new Meat(13, 31));
    principal.add(new NullFood());
    System.out.println(principal);

  }
}
