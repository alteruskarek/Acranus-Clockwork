package io.github.moonlightarborstudios.examplesword;

import io.github.moonlightarborstudios.examplesword.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleSword.MODID)

public class ExampleSword {

	// You can't really change it once you create it... pick a good name.
	// Otherwise you'd have to go through all of your resources and rename it
	public static final String MODID = "examplesword";
	
	// This is the entry point into the mod - where everything gets loaded/referenced from.
	public ExampleSword() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		// Causes the bus to listen to this passenger so it can "pick up" events
		ItemInit.ITEMS.register(bus);
	}
	
}
