package com.steveuniverse.items;

import com.steveuniverse.client.ModCreativeTabs;
import com.steveuniverse.main.StevesUniverse;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static void MainRegistry(){
		initItems();
		regItems();
	}
	
	public static Item alexadrite, amethyst, amethyst_heart, amethyst_whip, bagel, chips, cookie_cat, creamed_corn, dog_nut, 
	durian_juice, fry_bits, giant_woman, jasper, jasper_crashhelmet, jasper_heart, lapis_heart, lapis_hydro, lapis_wings,
	malachite, opal, pearl, pearl_heart, pearl_spear, peridot, peridot_claw, peridot_heart, rainbow, rose, rose_heart, rose_sword, rose_shield,
	ruby_glove,	ruby, ruby_heart, sapphire, sapphire_glove, sapphire_heart, sapphire_screech, sardonyx, steven_uklele, sugilite, whip_it_up;
	
	public static ToolMaterial Pearl = EnumHelper.addToolMaterial("Pearl", 3, 1000000, 16.0f, 5.0f, 1);
	public static ToolMaterial Amethyst = EnumHelper.addToolMaterial("Amethyst", 3, 1000000, 16.0f, 5.0f, 1);
	public static ToolMaterial Rose = EnumHelper.addToolMaterial("Rose", 3, 1000000, 16.0f, 5.0f, 1);
	public static ToolMaterial Quartz = EnumHelper.addToolMaterial("Quartz", 3, 1000000, 16.0f, 5.0f, 1);
	public static ToolMaterial Ruby = EnumHelper.addToolMaterial("Ruby", 3, 1000000, 16.0f, 10.5f, 1);
	
	public static void initItems(){
<<<<<<< HEAD
		amethyst = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":amethyst").setUnlocalizedName("amethyst");
		amethyst_heart = new amethyst_heart().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":amethyst").setUnlocalizedName("amethyst_heart");
		amethyst_whip = new amethyst_whip().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":amethyst_whip").setUnlocalizedName("amthyst_whip");
		bagel = new ItemFood(3, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":bagel_sandwich").setUnlocalizedName("bagel");
		chips = new ItemFood(4, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":chips").setUnlocalizedName("chips");
		cookie_cat = new ItemFood(10, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":cookie_cat").setUnlocalizedName("cookie_cat");
		creamed_corn = new ItemFood(5, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":creamed_corn").setUnlocalizedName("creamed_corn");
		dog_nut = new ItemFood(7, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":dog_nut").setUnlocalizedName("dog_nut");
		durian_juice = new ItemFood(3, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":durian_juice").setUnlocalizedName("durian_juice");
		fry_bits = new ItemFood(4, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":fry_bits").setUnlocalizedName("fry_bits");
		giant_woman = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":giant_woman").setUnlocalizedName("giant_woman");
		jasper = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":jasper").setUnlocalizedName("jasper");
		jasper_crashhelmet = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":jasper_crashhelmet").setUnlocalizedName("jasper_crashhelmet");
		jasper_heart = new jasper_heart().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":jasper").setUnlocalizedName("jasper_heart");
		lapis_heart = new lapis_heart().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":lapislazuli").setUnlocalizedName("lapis_heart");
		lapis_wings = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":lapis_wings").setUnlocalizedName("lapis_wings");
		malachite = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":malachite").setUnlocalizedName("malachite");
		opal = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":opal").setUnlocalizedName("opal");
		pearl = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":pearl").setUnlocalizedName("pearl");
		pearl_heart = new pearl_heart().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":pearl").setUnlocalizedName("pearl_heart");
		pearl_spear = new pearl_spear(Pearl).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":pearl_spear").setUnlocalizedName("pearl_spear");
		peridot = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":peridot").setUnlocalizedName("peridot");
		peridot_claw = new peridot_claw().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":peridot_claw").setUnlocalizedName("peridot_claw");
		peridot_heart = new peridot_heart().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":peridot").setUnlocalizedName("peridot_heart");
		rainbow = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":rainbow").setUnlocalizedName("rainbow");
		rose = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":rose").setUnlocalizedName("rose_heart");
		rose_heart = new rose_heart().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":rose").setUnlocalizedName("rose");
		rose_sword = new ItemSword(Rose).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":rose_sword").setUnlocalizedName("rose");
		rose_shield = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":rose_sheild").setUnlocalizedName("rose_sheild");
		ruby = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":ruby").setUnlocalizedName("ruby");
		ruby_glove = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":ruby_glove").setUnlocalizedName("ruby_glove");
		ruby_heart = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":ruby").setUnlocalizedName("ruby_heart");
		sapphire = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":sapphire").setUnlocalizedName("sapphire");
		sapphire_screech = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":sonic").setUnlocalizedName("sapphire_screech");
		sapphire_glove = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":sapphire_glove").setUnlocalizedName("sapphire_glove");
		sapphire_heart = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":sapphire").setUnlocalizedName("sapphire_heart");
		sardonyx = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":sardonyx").setUnlocalizedName("sardonyx");
		steven_uklele = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":steven_ukulele").setUnlocalizedName("steven_uklele");
		sugilite = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":sugilite").setUnlocalizedName("sugilite");
		whip_it_up = new ItemFood(6, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":whip_it_up").setUnlocalizedName("whip_it_up");
=======
		amethyst_heart = new amethyst_heart().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":amethyst").setUnlocalizedName("amethyst_heart");
		amethyst_whip = new amethyst_whip().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":amethyst_whip");
		bagel = new ItemFood(3, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":bagel_sandwich");
		chips = new ItemFood(4, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":CHAAAPS");
		cookie_cat = new ItemFood(10, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":cookie_cat");
		creamed_corn = new ItemFood(5, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":creamed_corn");
		dog_nut = new ItemFood(7, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":dog_nut");
		durian_juice = new ItemFood(3, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":durian_juice");
		fry_bits = new ItemFood(4, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":fry_bits");
		giant_woman = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":giant_woman");
		jasper_crashhelmet = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":jasper_crashhelmet");
		jasper_heart = new jasper_heart().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":jasper_heart");
		lapis_heart = new lapis_heart().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":lapis");
		lapis_wings = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":lapis_wings");
		pearl_heart = new pearl_heart().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":pearl");
		pearl_spear = new pearl_spear(Pearl).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":pearl_spear").setUnlocalizedName("pearl_spear");
		peridot_claw = new peridot_claw().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":peridot_claw");
		peridot_heart = new peridot_heart().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":peridot");
		rose_heart = new rose_heart().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":rose");
		rose_sword = new ItemSword(Rose).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":rose_sword");
		rose_shield = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":rose_sheild");
		ruby_glove = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":ruby_glove");
		ruby_heart = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":ruby");
		sapphire_screech = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":sonic");
		sapphire_glove = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":sapphire_glove");
		sapphire_heart = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":sapphire");
		steven_uklele = new Item().setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":steven_ukulele");
		whip_it_up = new ItemFood(6, false).setCreativeTab(ModCreativeTabs.tabSU).setTextureName(StevesUniverse.MODID + ":whip_it_up");
>>>>>>> origin/master
		
		
	}

	public static void regItems(){
		GameRegistry.registerItem(amethyst, "amethyst");
		GameRegistry.registerItem(amethyst_heart, "amethyst_heart");
		GameRegistry.registerItem(amethyst_whip, "amethyst_whip");
		GameRegistry.registerItem(bagel, "bagel");
		GameRegistry.registerItem(chips, "chips");
		GameRegistry.registerItem(cookie_cat, "cookie_cat");
		GameRegistry.registerItem(creamed_corn, "creamed_corn");
		GameRegistry.registerItem(dog_nut, "dog_nut");
		GameRegistry.registerItem(durian_juice, "durian_juice");
		GameRegistry.registerItem(fry_bits, "fry_bits");
		GameRegistry.registerItem(giant_woman, "giant_woman");
		GameRegistry.registerItem(jasper, "jasper");
		GameRegistry.registerItem(jasper_crashhelmet, "jasper_crashhelmet");
		GameRegistry.registerItem(jasper_heart, "jasper_heart");
		GameRegistry.registerItem(lapis_heart, "lapis_heart");
		GameRegistry.registerItem(lapis_wings, "lapis_wings");
		GameRegistry.registerItem(pearl, "pearl");
		GameRegistry.registerItem(pearl_heart, "pearl_heart");
		GameRegistry.registerItem(pearl_spear, "pearl_spear");
		GameRegistry.registerItem(peridot, "peridot");
		GameRegistry.registerItem(peridot_claw, "peridot_claw");
		GameRegistry.registerItem(peridot_heart, "peridot_heart");
		GameRegistry.registerItem(rose, "rose");
		GameRegistry.registerItem(rose_heart, "rose_heart");
		GameRegistry.registerItem(rose_shield, "rose_shield");
		GameRegistry.registerItem(rose_sword, "rose_sword");
		GameRegistry.registerItem(ruby, "ruby");
		GameRegistry.registerItem(ruby_glove, "ruby_glove");
		GameRegistry.registerItem(ruby_heart, "ruby_heart");
		GameRegistry.registerItem(sapphire, "sapphire");
		GameRegistry.registerItem(sapphire_glove, "sapphire_glove");
		GameRegistry.registerItem(sapphire_heart, "sapphire_heart");
		GameRegistry.registerItem(sapphire_screech, "sapphire_screech");
		GameRegistry.registerItem(steven_uklele, "steven_uklele");
		GameRegistry.registerItem(whip_it_up, "whip_it_up");
		
	}
}
