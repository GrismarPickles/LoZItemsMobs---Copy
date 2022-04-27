package com.grismarpickles.lozitemsmobs.entities.custom;

import com.grismarpickles.lozitemsmobs.LoZItemsMobs;
//import com.grismarpickles.lozitemsmobs.entities.ChuchuEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes
{
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, LoZItemsMobs.MOD_ID);

    public static final RegistryObject<EntityType<BokoblinRedEntity>> RED_BOKOBLIN =
            ENTITY_TYPES.register("red_bokoblin", () -> EntityType.Builder.of(BokoblinRedEntity::new,
                    EntityClassification.MONSTER).sized(1f, 1.5f)
                    .build(new ResourceLocation(LoZItemsMobs.MOD_ID, "red_bokoblin").toString()));

   // public static final RegistryObject<EntityType<ChuchuPlainEntity>> CHUCHU =
      //      ENTITY_TYPES.register("chuchu", () -> EntityType.Builder.of(ChuchuPlainEntity::new,
        //                    EntityClassification.MONSTER).sized(0.5f, 0.5f)
         //           .build(new ResourceLocation(LoZItemsMobs.MOD_ID, "chuchu").toString()));

    public static void register(IEventBus eventBus)
    {
        ENTITY_TYPES.register(eventBus);
    }
}
