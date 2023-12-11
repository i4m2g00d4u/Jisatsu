package de.just2g00d.jisatsu;

import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonMain;

@AddonMain
public class Jisatsu extends LabyAddon<JisatsuConfiguration> {

  @Override
  protected void enable() {
    this.registerSettingCategory();



  }

  @Override
  protected Class<? extends JisatsuConfiguration> configurationClass() {
    return JisatsuConfiguration.class;
  }
}
