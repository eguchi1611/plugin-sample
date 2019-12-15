package io.github.ktasra;

import org.bukkit.plugin.java.JavaPlugin;

public class SamplePlugin extends JavaPlugin {

	@Override
	public void onEnable() {

		getLogger().info("enabled.");
	}
}
