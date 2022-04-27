package com.grismarpickles.lozitemsmobs.events;

import com.grismarpickles.lozitemsmobs.LoZItemsMobs;
import com.grismarpickles.lozitemsmobs.entities.custom.BokoblinRedEntity;
//import com.grismarpickles.lozitemsmobs.entities.custom.ChuchuPlainEntity;
import com.grismarpickles.lozitemsmobs.entities.custom.ModEntityTypes;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = LoZItemsMobs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents
{
    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event)
    {
        event.put(ModEntityTypes.RED_BOKOBLIN.get(), BokoblinRedEntity.setCustomAttributes().build());
      //  event.put(ModEntityTypes.CHUCHU.get(), ChuchuPlainEntity.setCustomAttributes().build());
    }
}
