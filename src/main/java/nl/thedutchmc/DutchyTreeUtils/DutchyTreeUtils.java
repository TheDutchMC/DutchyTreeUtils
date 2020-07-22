package nl.thedutchmc.DutchyTreeUtils;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class DutchyTreeUtils extends JavaPlugin {

	public static DutchyTreeUtils INSTANCE;
	
	@Override
	public void onEnable() {
		INSTANCE = this;
		
		Bukkit.getPluginManager().registerEvents(new TreeRemove(), this);
		Bukkit.getPluginManager().registerEvents(new LeaveDecay(), this);
		
	}
}
