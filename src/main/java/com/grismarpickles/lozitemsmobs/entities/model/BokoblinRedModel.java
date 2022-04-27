package com.grismarpickles.lozitemsmobs.entities.model;

import com.grismarpickles.lozitemsmobs.entities.custom.BokoblinRedEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class BokoblinRedModel  <T extends BokoblinRedEntity> extends EntityModel<T>
{
    private final ModelRenderer root;
    private final ModelRenderer body;
    private final ModelRenderer body2_r1;
    private final ModelRenderer armLeftUpper;
    private final ModelRenderer armLeftUpper_r1;
    private final ModelRenderer armLeft;
    private final ModelRenderer thumbLeft_r1;
    private final ModelRenderer middleLeft_r1;
    private final ModelRenderer indexLeft_r1;
    private final ModelRenderer handLeft_r1;
    private final ModelRenderer armLeftLower_r1;
    private final ModelRenderer armRightUpper;
    private final ModelRenderer armRightUpper_r1;
    private final ModelRenderer armRight;
    private final ModelRenderer thumbRight_r1;
    private final ModelRenderer middleRight_r1;
    private final ModelRenderer indexRight_r1;
    private final ModelRenderer handRight_r1;
    private final ModelRenderer armRightLower_r1;
    private final ModelRenderer club;
    private final ModelRenderer club4_r1;
    private final ModelRenderer handle_r1;
    private final ModelRenderer head;
    private final ModelRenderer earRight_r1;
    private final ModelRenderer horn2_r1;
    private final ModelRenderer horn1_r1;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw_r1;
    private final ModelRenderer legLeftUpper;
    private final ModelRenderer legUpperLeft_r1;
    private final ModelRenderer legLeft;
    private final ModelRenderer footLeft_r1;
    private final ModelRenderer legLowerLeft_r1;
    private final ModelRenderer legRightUpper;
    private final ModelRenderer legUpperRight_r1;
    private final ModelRenderer legRight;
    private final ModelRenderer footRight_r1;
    private final ModelRenderer legLowerRight_r1;

    public BokoblinRedModel() {
        texWidth = 64;
        texHeight = 64;

        root = new ModelRenderer(this);
        root.setPos(0.0F, 24.0F, 0.0F);


        body = new ModelRenderer(this);
        body.setPos(0.0F, -11.5998F, -0.9251F);
        root.addChild(body);
        setRotationAngle(body, 0.0436F, 0.0F, 0.0F);
        body.texOffs(24, 8).addBox(-3.5F, -0.3709F, -1.5817F, 7.0F, 6.0F, 4.0F, 0.0F, false);

        body2_r1 = new ModelRenderer(this);
        body2_r1.setPos(0.0F, -3.3709F, 0.4183F);
        body.addChild(body2_r1);
        setRotationAngle(body2_r1, 0.2618F, 0.0F, 0.0F);
        body2_r1.texOffs(0, 20).addBox(-4.0F, -2.5F, -3.0F, 8.0F, 6.0F, 4.0F, 0.0F, false);

        armLeftUpper = new ModelRenderer(this);
        armLeftUpper.setPos(4.0F, -4.4002F, -1.0749F);
        body.addChild(armLeftUpper);


        armLeftUpper_r1 = new ModelRenderer(this);
        armLeftUpper_r1.setPos(2.5F, 0.1391F, 0.0218F);
        armLeftUpper.addChild(armLeftUpper_r1);
        setRotationAngle(armLeftUpper_r1, 0.2618F, 0.0F, 0.5236F);
        armLeftUpper_r1.texOffs(39, 23).addBox(-2.75F, 0.0F, -1.5F, 5.0F, 3.0F, 3.0F, 0.0F, false);

        armLeft = new ModelRenderer(this);
        armLeft.setPos(4.7376F, 3.112F, -0.4257F);
        armLeftUpper.addChild(armLeft);
        setRotationAngle(armLeft, 0.0436F, 0.0F, 0.0F);


        thumbLeft_r1 = new ModelRenderer(this);
        thumbLeft_r1.setPos(4.0305F, 2.7856F, -2.4951F);
        armLeft.addChild(thumbLeft_r1);
        setRotationAngle(thumbLeft_r1, 0.2182F, -1.0908F, 1.1781F);
        thumbLeft_r1.texOffs(40, 44).addBox(0.5F, 1.0F, -2.25F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        middleLeft_r1 = new ModelRenderer(this);
        middleLeft_r1.setPos(4.0305F, 2.7856F, -2.4951F);
        armLeft.addChild(middleLeft_r1);
        setRotationAngle(middleLeft_r1, 0.1309F, -1.1781F, 0.6109F);
        middleLeft_r1.texOffs(0, 45).addBox(1.0F, -0.4F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        indexLeft_r1 = new ModelRenderer(this);
        indexLeft_r1.setPos(4.0305F, 2.7856F, -2.4951F);
        armLeft.addChild(indexLeft_r1);
        setRotationAngle(indexLeft_r1, 0.1309F, -0.9599F, 0.3927F);
        indexLeft_r1.texOffs(45, 1).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        handLeft_r1 = new ModelRenderer(this);
        handLeft_r1.setPos(3.2624F, 2.0271F, -1.0524F);
        armLeft.addChild(handLeft_r1);
        setRotationAngle(handLeft_r1, 0.1309F, -1.1781F, 0.5236F);
        handLeft_r1.texOffs(8, 45).addBox(-1.1F, -0.3F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        armLeftLower_r1 = new ModelRenderer(this);
        armLeftLower_r1.setPos(0.2624F, -0.4729F, 0.9476F);
        armLeft.addChild(armLeftLower_r1);
        setRotationAngle(armLeftLower_r1, 0.1309F, -1.1781F, 0.5236F);
        armLeftLower_r1.texOffs(10, 34).addBox(-1.5F, -0.25F, -4.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);

        armRightUpper = new ModelRenderer(this);
        armRightUpper.setPos(-4.0F, -4.4002F, -1.0749F);
        body.addChild(armRightUpper);


        armRightUpper_r1 = new ModelRenderer(this);
        armRightUpper_r1.setPos(-1.731F, 1.5285F, 0.2488F);
        armRightUpper.addChild(armRightUpper_r1);
        setRotationAngle(armRightUpper_r1, 0.2618F, 0.0F, -0.5236F);
        armRightUpper_r1.texOffs(26, 36).addBox(-2.5F, -1.5F, -1.5F, 5.0F, 3.0F, 3.0F, 0.0F, false);

        armRight = new ModelRenderer(this);
        armRight.setPos(-6.6799F, 5.3202F, -3.121F);
        armRightUpper.addChild(armRight);
        setRotationAngle(armRight, 0.0436F, 0.0F, 0.0F);


        thumbRight_r1 = new ModelRenderer(this);
        thumbRight_r1.setPos(-1.749F, 2.2352F, -1.3274F);
        armRight.addChild(thumbRight_r1);
        setRotationAngle(thumbRight_r1, 0.48F, 0.6545F, -0.2182F);
        thumbRight_r1.texOffs(20, 34).addBox(0.1F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        middleRight_r1 = new ModelRenderer(this);
        middleRight_r1.setPos(-2.2138F, 1.2239F, -1.2891F);
        armRight.addChild(middleRight_r1);
        setRotationAngle(middleRight_r1, 0.4363F, 1.0908F, -0.4363F);
        middleRight_r1.texOffs(40, 0).addBox(-0.85F, -0.5F, -1.75F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        indexRight_r1 = new ModelRenderer(this);
        indexRight_r1.setPos(-1.935F, 0.9123F, -2.1108F);
        armRight.addChild(indexRight_r1);
        setRotationAngle(indexRight_r1, 0.3927F, 0.7854F, -0.3927F);
        indexRight_r1.texOffs(26, 42).addBox(-0.4F, -0.3F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        handRight_r1 = new ModelRenderer(this);
        handRight_r1.setPos(-1.1555F, -1.2954F, -0.4855F);
        armRight.addChild(handRight_r1);
        setRotationAngle(handRight_r1, 0.2182F, 0.8727F, -0.3927F);
        handRight_r1.texOffs(32, 44).addBox(-1.3F, 0.7F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        armRightLower_r1 = new ModelRenderer(this);
        armRightLower_r1.setPos(0.8788F, -1.1113F, 2.4411F);
        armRight.addChild(armRightLower_r1);
        setRotationAngle(armRightLower_r1, 0.2182F, 0.8727F, -0.3927F);
        armRightLower_r1.texOffs(29, 28).addBox(-0.25F, -1.0F, -3.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);

        club = new ModelRenderer(this);
        club.setPos(2.1864F, -0.0575F, -6.3077F);
        armRight.addChild(club);
        setRotationAngle(club, 0.0436F, 0.0F, 0.0F);


        club4_r1 = new ModelRenderer(this);
        club4_r1.setPos(-1.0065F, 0.7256F, -1.5506F);
        club.addChild(club4_r1);
        setRotationAngle(club4_r1, 0.0F, -0.6981F, -0.3054F);
        club4_r1.texOffs(21, 0).addBox(0.9F, -2.9F, -6.25F, 2.0F, 1.0F, 3.0F, 0.0F, false);
        club4_r1.texOffs(28, 0).addBox(-0.1F, -1.9F, -6.25F, 4.0F, 4.0F, 4.0F, 0.0F, false);
        club4_r1.texOffs(0, 30).addBox(0.4F, -1.4F, -2.25F, 3.0F, 3.0F, 5.0F, 0.0F, false);
        club4_r1.texOffs(11, 30).addBox(0.9F, -0.9F, 2.75F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        handle_r1 = new ModelRenderer(this);
        handle_r1.setPos(-2.0065F, 1.7256F, 4.4494F);
        club.addChild(handle_r1);
        setRotationAngle(handle_r1, 0.0F, -0.6981F, -0.3054F);
        handle_r1.texOffs(40, 31).addBox(-1.5F, -1.0F, -0.75F, 1.0F, 1.0F, 5.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(0.0F, -9.2977F, -3.1976F);
        body.addChild(head);
        setRotationAngle(head, 0.0436F, 0.0F, 0.0F);
        head.texOffs(42, 5).addBox(-1.5F, 1.0574F, -3.7927F, 3.0F, 2.0F, 3.0F, 0.0F, false);

        earRight_r1 = new ModelRenderer(this);
        earRight_r1.setPos(0.0F, 3.0574F, -0.2927F);
        head.addChild(earRight_r1);
        setRotationAngle(earRight_r1, 0.1309F, 0.0F, 0.0F);
        earRight_r1.texOffs(35, 18).addBox(-8.5F, -3.75F, 0.75F, 5.0F, 4.0F, 1.0F, 0.0F, false);
        earRight_r1.texOffs(14, 42).addBox(3.5F, -3.75F, 0.75F, 5.0F, 4.0F, 1.0F, 0.0F, false);
        earRight_r1.texOffs(0, 0).addBox(-3.5F, -4.75F, -2.25F, 7.0F, 5.0F, 7.0F, 0.0F, false);

        horn2_r1 = new ModelRenderer(this);
        horn2_r1.setPos(0.0F, -3.4426F, 0.7073F);
        head.addChild(horn2_r1);
        setRotationAngle(horn2_r1, 0.1309F, 0.0F, 0.0F);
        horn2_r1.texOffs(0, 20).addBox(-0.5F, -0.25F, -1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        horn1_r1 = new ModelRenderer(this);
        horn1_r1.setPos(0.0F, -1.9426F, 0.2073F);
        head.addChild(horn1_r1);
        setRotationAngle(horn1_r1, 0.1309F, 0.0F, 0.0F);
        horn1_r1.texOffs(46, 10).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        jaw = new ModelRenderer(this);
        jaw.setPos(0.0F, 3.6309F, 1.0878F);
        head.addChild(jaw);


        jaw_r1 = new ModelRenderer(this);
        jaw_r1.setPos(0.0F, 0.0F, 0.0F);
        jaw.addChild(jaw_r1);
        setRotationAngle(jaw_r1, 0.1745F, 0.0F, 0.0F);
        jaw_r1.texOffs(0, 12).addBox(-3.5F, -0.5F, -3.5F, 7.0F, 1.0F, 7.0F, 0.0F, false);

        legLeftUpper = new ModelRenderer(this);
        legLeftUpper.setPos(2.0F, 5.5998F, -0.0749F);
        body.addChild(legLeftUpper);


        legUpperLeft_r1 = new ModelRenderer(this);
        legUpperLeft_r1.setPos(0.5F, 0.5F, -0.5F);
        legLeftUpper.addChild(legUpperLeft_r1);
        setRotationAngle(legUpperLeft_r1, 0.3054F, -0.5672F, 0.0F);
        legUpperLeft_r1.texOffs(19, 26).addBox(-0.5F, -1.5F, -3.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);

        legLeft = new ModelRenderer(this);
        legLeft.setPos(2.7073F, 3.1664F, -2.1036F);
        legLeftUpper.addChild(legLeft);


        footLeft_r1 = new ModelRenderer(this);
        footLeft_r1.setPos(0.023F, 2.5794F, -0.0361F);
        legLeft.addChild(footLeft_r1);
        setRotationAngle(footLeft_r1, 1.6144F, -0.5672F, 0.0F);
        footLeft_r1.texOffs(0, 12).addBox(-1.0F, -4.0F, -0.5F, 2.0F, 5.0F, 1.0F, 0.0F, false);

        legLowerLeft_r1 = new ModelRenderer(this);
        legLowerLeft_r1.setPos(1.4545F, -1.0125F, -2.283F);
        legLeft.addChild(legLowerLeft_r1);
        setRotationAngle(legLowerLeft_r1, 1.7453F, -0.5672F, 0.0F);
        legLowerLeft_r1.texOffs(0, 38).addBox(-1.0F, 1.0F, -3.75F, 2.0F, 2.0F, 5.0F, 0.0F, false);

        legRightUpper = new ModelRenderer(this);
        legRightUpper.setPos(-2.0F, 5.5998F, -0.0749F);
        body.addChild(legRightUpper);


        legUpperRight_r1 = new ModelRenderer(this);
        legUpperRight_r1.setPos(5.5996F, 0.6504F, -0.3649F);
        legRightUpper.addChild(legUpperRight_r1);
        setRotationAngle(legUpperRight_r1, 0.3054F, 0.5672F, 0.0F);
        legUpperRight_r1.texOffs(24, 18).addBox(-7.5F, -2.5F, -5.5F, 3.0F, 3.0F, 5.0F, 0.0F, false);

        legRight = new ModelRenderer(this);
        legRight.setPos(-2.233F, 1.3038F, -2.4515F);
        legRightUpper.addChild(legRight);


        footRight_r1 = new ModelRenderer(this);
        footRight_r1.setPos(-0.8128F, 4.7298F, -0.2528F);
        legRight.addChild(footRight_r1);
        setRotationAngle(footRight_r1, 1.6144F, 0.5672F, 0.0F);
        footRight_r1.texOffs(0, 0).addBox(-1.0F, -2.5F, -0.5F, 2.0F, 5.0F, 1.0F, 0.0F, false);

        legLowerRight_r1 = new ModelRenderer(this);
        legLowerRight_r1.setPos(-0.3971F, 1.923F, 1.0459F);
        legRight.addChild(legLowerRight_r1);
        setRotationAngle(legLowerRight_r1, 1.7453F, 0.5672F, 0.0F);
        legLowerRight_r1.texOffs(37, 37).addBox(-0.65F, -1.3F, -2.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {

    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    @Override
    public void renderToBuffer(MatrixStack p_225598_1_, IVertexBuilder p_225598_2_, int p_225598_3_, int p_225598_4_, float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {

    }
}
