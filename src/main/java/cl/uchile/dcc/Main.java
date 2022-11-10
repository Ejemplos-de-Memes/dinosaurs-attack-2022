package cl.uchile.dcc;

import cl.uchile.dcc.model.dinosaurs.TRex;
import cl.uchile.dcc.model.states.FuriousMood;
import cl.uchile.dcc.model.states.NormalMood;
import cl.uchile.dcc.model.states.SadMood;
import cl.uchile.dcc.model.states.TiredMood;

public class Main {

  public static void main(String[] args) {
    TRex tRex = new TRex(20, 20);
    System.out.println("Ataque: " + tRex.getAttack());
    tRex.toFuriousMood();
    System.out.println("Ataque: " + tRex.getAttack());
    tRex.toTiredMood();
    System.out.println("Ataque: " + tRex.getAttack());
    // Lanza error
//    tRex.toSadMood();
//    System.out.println("Ataque: " + tRex.getAttack());
  }
}
