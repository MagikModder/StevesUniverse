package com.stevenuniverse.event;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.steveuniverse.items.ModItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class EventGemPowers {
@SubscribeEvent
public void onPlayerTick(PlayerTickEvent event)
{
EntityPlayer player = event.player;
ItemStack heldItem = player.getCurrentEquippedItem();
if (event.phase == Phase.START)
{
//if(heldItem != null && heldItem.getItem() instanceof ModItems.ruby_heart)
{
	System.out.println("TEST"); 
}
}
}
}

