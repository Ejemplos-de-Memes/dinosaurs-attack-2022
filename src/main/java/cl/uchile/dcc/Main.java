package cl.uchile.dcc;

import cl.uchile.dcc.model.dinosaurs.TRex;
import cl.uchile.dcc.model.factories.TRexFactory;
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
  }
}
