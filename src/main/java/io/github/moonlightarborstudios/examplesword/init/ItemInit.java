package io.github.moonlightarborstudios.examplesword.init;

import io.github.moonlightarborstudios.examplesword.ExampleSword;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	// Registers objects of only item type, creates it with our MODID
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleSword.MODID);
	
	// create an object to be registered
	// This is only the registry name, not the object name
	public static final RegistryObject<Item> SWORDY_SWORD = ITEMS.register( "the_swordy_sword", 
			() -> new SwordItem(Tiers.DIAMOND, 0, 0, new Item.Properties()
					.durability(100)
					.fireResistant()
					.rarity(Rarity.EPIC) ) );
}
