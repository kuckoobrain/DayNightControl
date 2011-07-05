package me.kuckoobrain.DayNightControl;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class DayNightControl extends JavaPlugin {

	@Override
	public void onDisable() {
		PluginDescriptionFile pdf = this.getDescription();
		System.out.println(pdf.getName() + " " + pdf.getVersion() + " disabled");
		
	}

	@Override
	public void onEnable() {
		registerHooks();
		PluginDescriptionFile pdf = this.getDescription();
		System.out.println(pdf.getName() + " " + pdf.getVersion() + " enabled");
	}
	
	public void registerHooks() {
	}

}
