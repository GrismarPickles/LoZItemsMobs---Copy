package com.grismarpickles.lozitemsmobs;

import com.grismarpickles.lozitemsmobs.client.render.BokoblinRedRenderer;
//import com.grismarpickles.lozitemsmobs.client.render.ChuchuPlainRenderer;
import com.grismarpickles.lozitemsmobs.entities.custom.BokoblinRedEntity;
//import com.grismarpickles.lozitemsmobs.entities.custom.ChuchuPlainEntity;
import com.grismarpickles.lozitemsmobs.entities.custom.ModEntityTypes;
import com.grismarpickles.lozitemsmobs.util.RegistryHandler;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("lzim")
public class LoZItemsMobs
{

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "lzim";

    public LoZItemsMobs()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        com.grismarpickles.lozitemsmobs.entities.custom.ModEntityTypes.register(eventBus);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        DeferredWorkQueue.runLater(() ->
        {

        });
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.RED_BOKOBLIN.get(), BokoblinRedRenderer::new);
    //    RenderingRegistry.registerEntityRenderingHandler(com.grismarpickles.lozitemsmobs.entities.custom.ModEntityTypes.CHUCHU.get(), ChuchuPlainRenderer::new);
    }

    public static final ItemGroup TAB = new ItemGroup("lzimTab")
    {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegistryHandler.TRUE_MASTER_SWORD.get());
        }

    };

}
