package com.grismarpickles.lozitemsmobs.client.render;

import com.grismarpickles.lozitemsmobs.LoZItemsMobs;
import com.grismarpickles.lozitemsmobs.entities.model.BokoblinRedModel;
import com.grismarpickles.lozitemsmobs.entities.custom.BokoblinRedEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BokoblinRedRenderer extends MobRenderer<BokoblinRedEntity, BokoblinRedModel<BokoblinRedEntity>>
{

    protected static final ResourceLocation TEXTURE = new ResourceLocation(LoZItemsMobs.MOD_ID, "textures/entity/bokoblinred.png");

    public BokoblinRedRenderer(EntityRendererManager p_i50961_1_) {
        super(p_i50961_1_, new BokoblinRedModel<>(), 0.55F);
    }

    @Override
    public ResourceLocation getTextureLocation (BokoblinRedEntity entity)
    {
        return TEXTURE;
    }
}
