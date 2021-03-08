package com.lauti.firstplugin;



import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import net.minecraft.server.v1_16_R2.Block;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		
		System.out.println("PLUGIN ENABLED");
		
		getCommand("ChestDrop").setExecutor(new ChestDrop());
		
	}
		
}

			
  	

	
	


	
	
	


	
	



	
	
	
