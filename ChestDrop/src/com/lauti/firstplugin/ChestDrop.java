package com.lauti.firstplugin;


import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Chest;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ChestDrop implements CommandExecutor{
	
	@Override
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Random rnd=  new Random();
		int x = rnd.nextInt(1000*2) - 1000;
		int z=  rnd.nextInt(1000*2) - 1000;
		Player player = (Player) sender;
		World world = Bukkit.getWorld("world");
		int y= world.getHighestBlockYAt(x,z);
		Location chestLoc = new Location(world, x, y, z);
		chestLoc.getBlock().setType(Material.CHEST);
		Chest chest = (Chest) chestLoc.getBlock().getState();
		Inventory inv = chest.getInventory();
		ItemStack ep = new ItemStack(Material.ENDER_PEARL, 2);
		ItemStack gold = new ItemStack(Material.GOLD_INGOT, 16);
		ItemStack food = new ItemStack(Material.COOKED_BEEF, 12);
		ItemStack rod = new ItemStack(Material.BLAZE_ROD, 1);
		ItemMeta em = ep.getItemMeta();
		ItemMeta gm = gold.getItemMeta();
		ItemMeta fm = food.getItemMeta();
		ItemMeta rm = rod.getItemMeta();
		ep.setItemMeta(em);
		gold.setItemMeta(gm);
		food.setItemMeta(fm);
		rod.setItemMeta(rm);
		inv.addItem(ep, gold, food, rod);
		Bukkit.getServer().broadcastMessage(ChatColor.AQUA + "El cofre ha sido spawneado en: "+ x + "," + y + "," + z);
		
	
		return false;
	}

}
