package cl.uchile.dcc.model.items.food;

import cl.uchile.dcc.model.dinosaurs.interfaces.Dinosaur;
import cl.uchile.dcc.model.items.bag.ItemComponent;

public interface Food extends ItemComponent {

  void updateStats(Dinosaur dinosaur);

}
