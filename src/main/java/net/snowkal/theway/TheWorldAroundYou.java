package net.snowkal.theway;

import net.fabricmc.api.ModInitializer;

import net.snowkal.theway.block.ModBlocks;
import net.snowkal.theway.item.WayItemGroups;
import net.snowkal.theway.item.ModItems;
import net.snowkal.theway.sound.WaySounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheWorldAroundYou implements ModInitializer {
	public static final String MOD_ID = "theway";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		WayItemGroups.registerItemGroups();
		WaySounds.registerSounds();
	}
}