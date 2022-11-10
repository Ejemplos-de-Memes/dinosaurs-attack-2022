package cl.uchile.dcc.model.dinosaurs.interfaces;

import cl.uchile.dcc.model.dinosaurs.Velociraptor;

public interface AttackedByAVelociraptor {

  /**
   * To use Double Dispatch in attack
   * @param velociraptor a Velociraptor
   */
  void attackedByVelociraptor(Velociraptor velociraptor);

}
