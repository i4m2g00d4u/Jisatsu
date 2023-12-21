package de.just2g00d.jisatsu.v1_16_5;

import de.just2g00d.jisatsu.versioned.MinecraftVersionController;
import net.labymod.api.models.Implements;

import javax.inject.Singleton;

@Singleton
@Implements(MinecraftVersionController.class)
public class VersionedMinecraftVersionController implements MinecraftVersionController {

  @Override
  public void onJump() {

  }
}
