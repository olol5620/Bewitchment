package com.bewitchment.client.render.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * lilith2 - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelLilith extends ModelBase {
	public ModelRenderer bipedBody;
	public ModelRenderer stomach;
	public ModelRenderer boobs;
	public ModelRenderer bipedHead;
	public ModelRenderer bipedLeftArm;
	public ModelRenderer bipedRightArm;
	public ModelRenderer bipedLeftLeg;
	public ModelRenderer bipedRightLeg;
	public ModelRenderer hips;
	public ModelRenderer skirtB;
	public ModelRenderer skirtF;
	public ModelRenderer lSkirt;
	public ModelRenderer rSkirt;
	public ModelRenderer lHorn01;
	public ModelRenderer rHorn01;
	public ModelRenderer mhair01;
	public ModelRenderer lHair01;
	public ModelRenderer rHair01;
	public ModelRenderer mhair02;
	public ModelRenderer upperJaw;
	public ModelRenderer lowerJaw;
	public ModelRenderer lEara;
	public ModelRenderer rEara;
	public ModelRenderer lHorn02;
	public ModelRenderer lHorn03a;
	public ModelRenderer lHorn03b;
	public ModelRenderer lHorn03c;
	public ModelRenderer lHorn03d;
	public ModelRenderer lHorn04a;
	public ModelRenderer lHorn04b;
	public ModelRenderer lHorn04c;
	public ModelRenderer lHorn04d;
	public ModelRenderer lHorn05;
	public ModelRenderer rHorn02;
	public ModelRenderer rHorn03a;
	public ModelRenderer rHorn03b;
	public ModelRenderer rHorn03c;
	public ModelRenderer rHorn03d;
	public ModelRenderer rHorn04a;
	public ModelRenderer rHorn04b;
	public ModelRenderer rHorn04c;
	public ModelRenderer rHorn04d;
	public ModelRenderer rHorn05;
	public ModelRenderer nose;
	public ModelRenderer lFang;
	public ModelRenderer rFang;
	public ModelRenderer lEarb;
	public ModelRenderer rEarb;
	public ModelRenderer lArm02;
	public ModelRenderer lClaw;
	public ModelRenderer lWing01;
	public ModelRenderer lWing02;
	public ModelRenderer lWing01b;
	public ModelRenderer lWing03;
	public ModelRenderer lWing02b;
	public ModelRenderer lWing04;
	public ModelRenderer lWing03b;
	public ModelRenderer lWing05;
	public ModelRenderer lWing04b;
	public ModelRenderer lWing05b;
	public ModelRenderer lWing05c;
	public ModelRenderer rArm02;
	public ModelRenderer rClaw;
	public ModelRenderer rWing01;
	public ModelRenderer rWing02;
	public ModelRenderer rWing01b;
	public ModelRenderer rWing03;
	public ModelRenderer rWing02b;
	public ModelRenderer rWing04;
	public ModelRenderer rWing03b;
	public ModelRenderer rWing05;
	public ModelRenderer rWing04b;
	public ModelRenderer rWing05b;
	public ModelRenderer rWing05c;
	public ModelRenderer lLeg02;
	public ModelRenderer lLeg03;
	public ModelRenderer lHoof;
	public ModelRenderer rLeg02;
	public ModelRenderer rLeg03;
	public ModelRenderer rHoof;

	public ModelLilith() {
		this.textureWidth = 128;
		this.textureHeight = 64;
		this.lowerJaw = new ModelRenderer(this, 32, 58);
		this.lowerJaw.setRotationPoint(0.0F, -1.0F, -3.0F);
		this.lowerJaw.addBox(-2.0F, -0.5F, -2.0F, 4, 1, 2, 0.0F);
		this.setRotateAngle(lowerJaw, -0.13962634015954636F, 0.0F, 0.0F);
		this.lHorn01 = new ModelRenderer(this, 37, 0);
		this.lHorn01.setRotationPoint(2.0F, -6.4F, 1.5F);
		this.lHorn01.addBox(0.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(lHorn01, 0.0F, 0.0F, -0.6632251157578453F);
		this.bipedLeftArm = new ModelRenderer(this, 44, 16);
		this.bipedLeftArm.setRotationPoint(4.5F, 2.3F, -0.0F);
		this.bipedLeftArm.addBox(-1.0F, -2.0F, -1.5F, 3, 11, 3, 0.0F);
		this.setRotateAngle(bipedLeftArm, 0.10471975511965977F, 0.0F, -0.10000736613927509F);
		this.lWing04b = new ModelRenderer(this, 81, 25);
		this.lWing04b.setRotationPoint(0.0F, 1.7F, 0.8F);
		this.lWing04b.addBox(-0.5F, -1.2F, -0.7F, 1, 2, 7, 0.0F);
		this.rHorn02 = new ModelRenderer(this, 37, 6);
		this.rHorn02.mirror = true;
		this.rHorn02.setRotationPoint(-1.5F, 0.1F, 0.0F);
		this.rHorn02.addBox(-3.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F);
		this.setRotateAngle(rHorn02, 0.0F, 0.0F, 0.5235987755982988F);
		this.rSkirt = new ModelRenderer(this, 112, 45);
		this.rSkirt.mirror = true;
		this.rSkirt.setRotationPoint(-3.0F, 0.3F, -0.1F);
		this.rSkirt.addBox(-1.4F, -0.8F, -2.0F, 2, 12, 5, 0.0F);
		this.setRotateAngle(rSkirt, -0.22689280275926282F, 0.0F, 0.06981317007977318F);
		this.lHorn03d = new ModelRenderer(this, 47, 0);
		this.lHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03d.addBox(0.0F, -0.2F, -0.2F, 3, 1, 1, 0.0F);
		this.nose = new ModelRenderer(this, 46, 58);
		this.nose.setRotationPoint(0.0F, -0.8F, -2.0F);
		this.nose.addBox(-1.5F, -2.9F, 0.0F, 3, 3, 0, 0.0F);
		this.setRotateAngle(nose, 0.13962634015954636F, 0.0F, 0.0F);
		this.lClaw = new ModelRenderer(this, 46, 48);
		this.lClaw.setRotationPoint(0.0F, 11.5F, -0.6F);
		this.lClaw.addBox(0.0F, 0.0F, -1.0F, 1, 5, 2, 0.0F);
		this.setRotateAngle(lClaw, -0.3490658503988659F, 0.0F, 0.0F);
		this.rWing05 = new ModelRenderer(this, 64, 46);
		this.rWing05.mirror = true;
		this.rWing05.setRotationPoint(0.0F, 0.0F, 6.6F);
		this.rWing05.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F);
		this.setRotateAngle(rWing05, 0.3490658503988659F, 0.0F, 0.0F);
		this.lEara = new ModelRenderer(this, 22, 0);
		this.lEara.setRotationPoint(2.9F, -4.0F, 0.0F);
		this.lEara.addBox(-2.0F, -4.5F, -0.5F, 4, 5, 1, 0.0F);
		this.setRotateAngle(lEara, -0.13962634015954636F, -0.6981317007977318F, 0.6981317007977318F);
		this.rClaw = new ModelRenderer(this, 46, 48);
		this.rClaw.mirror = true;
		this.rClaw.setRotationPoint(0.0F, 11.5F, -0.6F);
		this.rClaw.addBox(-1.0F, 0.0F, -1.0F, 1, 5, 2, 0.0F);
		this.setRotateAngle(rClaw, -0.3490658503988659F, 0.0F, 0.0F);
		this.rHair01 = new ModelRenderer(this, 109, 0);
		this.rHair01.setRotationPoint(-2.7F, -5.5F, 0.6F);
		this.rHair01.addBox(-0.5F, 0.0F, -3.5F, 1, 10, 7, 0.0F);
		this.setRotateAngle(rHair01, 0.3665191429188092F, 0.0F, 0.22689280275926282F);
		this.rWing05c = new ModelRenderer(this, 67, 55);
		this.rWing05c.mirror = true;
		this.rWing05c.setRotationPoint(0.0F, 0.2F, 7.4F);
		this.rWing05c.addBox(-0.5F, -0.5F, -0.7F, 1, 1, 6, 0.0F);
		this.setRotateAngle(rWing05c, 0.19198621771937624F, 0.0F, 0.0F);
		this.lHoof = new ModelRenderer(this, 0, 58);
		this.lHoof.setRotationPoint(0.0F, 7.4F, -0.2F);
		this.lHoof.addBox(-1.5F, 0.0F, -2.3F, 3, 1, 4, 0.0F);
		this.setRotateAngle(lHoof, 0.03490658503988659F, 0.0F, 0.0F);
		this.bipedHead = new ModelRenderer(this, 0, 0);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.addBox(-3.5F, -7.0F, -3.5F, 7, 7, 7, 0.0F);
		this.rHorn03d = new ModelRenderer(this, 47, 0);
		this.rHorn03d.mirror = true;
		this.rHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03d.addBox(-3.0F, -0.2F, -0.2F, 3, 1, 1, 0.0F);
		this.rHorn04b = new ModelRenderer(this, 47, 0);
		this.rHorn04b.mirror = true;
		this.rHorn04b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn04b.addBox(-3.0F, -0.2F, -0.8F, 3, 1, 1, 0.0F);
		this.rEarb = new ModelRenderer(this, 29, 8);
		this.rEarb.mirror = true;
		this.rEarb.setRotationPoint(0.9F, -4.0F, 0.0F);
		this.rEarb.addBox(-1.0F, -3.2F, -0.5F, 2, 3, 1, 0.0F);
		this.setRotateAngle(rEarb, 0.0F, 0.0F, 0.22689280275926282F);
		this.rWing01 = new ModelRenderer(this, 64, 17);
		this.rWing01.mirror = true;
		this.rWing01.setRotationPoint(0.0F, 11.0F, 0.0F);
		this.rWing01.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 5, 0.0F);
		this.setRotateAngle(rWing01, 0.10471975511965977F, 0.0F, -0.13962634015954636F);
		this.lWing02 = new ModelRenderer(this, 64, 26);
		this.lWing02.setRotationPoint(0.01F, 0.2F, 4.1F);
		this.lWing02.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 6, 0.0F);
		this.setRotateAngle(lWing02, 0.41887902047863906F, 0.0F, 0.0F);
		this.boobs = new ModelRenderer(this, 19, 48);
		this.boobs.setRotationPoint(0.0F, 1.3F, -0.3F);
		this.boobs.addBox(-3.5F, 0.0F, -2.0F, 7, 4, 4, 0.0F);
		this.setRotateAngle(boobs, -0.593411945678072F, 0.0F, 0.0F);
		this.lHorn04a = new ModelRenderer(this, 47, 0);
		this.lHorn04a.setRotationPoint(2.7F, 0.1F, 0.0F);
		this.lHorn04a.addBox(0.0F, -0.8F, -0.8F, 3, 1, 1, 0.0F);
		this.setRotateAngle(lHorn04a, 0.0F, 0.0F, -0.3141592653589793F);
		this.rHorn04a = new ModelRenderer(this, 47, 0);
		this.rHorn04a.mirror = true;
		this.rHorn04a.setRotationPoint(-2.7F, 0.1F, 0.0F);
		this.rHorn04a.addBox(-3.0F, -0.8F, -0.8F, 3, 1, 1, 0.0F);
		this.setRotateAngle(rHorn04a, 0.0F, 0.0F, 0.3141592653589793F);
		this.rWing03b = new ModelRenderer(this, 74, 38);
		this.rWing03b.mirror = true;
		this.rWing03b.setRotationPoint(0.0F, 1.5F, 0.3F);
		this.rWing03b.addBox(-0.5F, -1.2F, -0.7F, 1, 2, 8, 0.0F);
		this.lFang = new ModelRenderer(this, 14, 57);
		this.lFang.setRotationPoint(1.5F, 0.0F, -1.4F);
		this.lFang.addBox(-0.49F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		this.rHorn03a = new ModelRenderer(this, 47, 0);
		this.rHorn03a.mirror = true;
		this.rHorn03a.setRotationPoint(-2.7F, 0.1F, 0.0F);
		this.rHorn03a.addBox(-3.0F, -0.8F, -0.8F, 3, 1, 1, 0.0F);
		this.setRotateAngle(rHorn03a, 0.0F, 0.0F, 0.3665191429188092F);
		this.rWing02 = new ModelRenderer(this, 64, 26);
		this.rWing02.mirror = true;
		this.rWing02.setRotationPoint(-0.01F, 0.2F, 4.1F);
		this.rWing02.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 6, 0.0F);
		this.setRotateAngle(rWing02, 0.41887902047863906F, 0.0F, 0.0F);
		this.lHair01 = new ModelRenderer(this, 90, 0);
		this.lHair01.setRotationPoint(2.7F, -5.5F, 0.6F);
		this.lHair01.addBox(-0.5F, 0.0F, -3.5F, 1, 10, 7, 0.0F);
		this.setRotateAngle(lHair01, 0.3665191429188092F, 0.0F, -0.22689280275926282F);
		this.rHoof = new ModelRenderer(this, 0, 58);
		this.rHoof.mirror = true;
		this.rHoof.setRotationPoint(0.0F, 7.4F, -0.2F);
		this.rHoof.addBox(-1.5F, 0.0F, -2.3F, 3, 1, 4, 0.0F);
		this.setRotateAngle(rHoof, 0.03490658503988659F, 0.0F, 0.0F);
		this.rHorn01 = new ModelRenderer(this, 37, 0);
		this.rHorn01.mirror = true;
		this.rHorn01.setRotationPoint(-2.0F, -6.4F, 1.5F);
		this.rHorn01.addBox(-2.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(rHorn01, 0.0F, 0.0F, 0.6632251157578453F);
		this.rWing04 = new ModelRenderer(this, 63, 36);
		this.rWing04.mirror = true;
		this.rWing04.setRotationPoint(0.0F, 0.0F, 6.6F);
		this.rWing04.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F);
		this.setRotateAngle(rWing04, 0.3490658503988659F, 0.0F, 0.0F);
		this.rLeg02 = new ModelRenderer(this, 0, 32);
		this.rLeg02.mirror = true;
		this.rLeg02.setRotationPoint(-0.2F, 7.6F, -0.3F);
		this.rLeg02.addBox(-1.5F, 0.0F, -2.0F, 3, 8, 4, 0.0F);
		this.setRotateAngle(rLeg02, 0.6981317007977318F, 0.0F, -0.10471975511965977F);
		this.lHorn04d = new ModelRenderer(this, 47, 0);
		this.lHorn04d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn04d.addBox(0.0F, -0.2F, -0.2F, 3, 1, 1, 0.0F);
		this.rWing04b = new ModelRenderer(this, 81, 25);
		this.rWing04b.mirror = true;
		this.rWing04b.setRotationPoint(0.0F, 1.7F, 0.8F);
		this.rWing04b.addBox(-0.5F, -1.2F, -0.7F, 1, 2, 7, 0.0F);
		this.stomach = new ModelRenderer(this, 19, 28);
		this.stomach.setRotationPoint(0.0F, 5.8F, 0.0F);
		this.stomach.addBox(-3.0F, 0.0F, -1.5F, 6, 7, 3, 0.0F);
		this.lHorn05 = new ModelRenderer(this, 47, 5);
		this.lHorn05.setRotationPoint(2.8F, 0.0F, 0.0F);
		this.lHorn05.addBox(0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
		this.setRotateAngle(lHorn05, 0.0F, 0.0F, -0.22689280275926282F);
		this.lHorn04c = new ModelRenderer(this, 47, 0);
		this.lHorn04c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn04c.addBox(0.0F, -0.8F, -0.2F, 3, 1, 1, 0.0F);
		this.upperJaw = new ModelRenderer(this, 19, 57);
		this.upperJaw.setRotationPoint(0.0F, -1.9F, -3.2F);
		this.upperJaw.addBox(-2.0F, -1.5F, -2.0F, 4, 2, 2, 0.0F);
		this.rArm02 = new ModelRenderer(this, 44, 31);
		this.rArm02.mirror = true;
		this.rArm02.setRotationPoint(-0.4F, 8.4F, 0.1F);
		this.rArm02.addBox(-1.5F, 0.0F, -1.5F, 3, 12, 3, 0.0F);
		this.setRotateAngle(rArm02, -0.3665191429188092F, 0.0F, 0.0F);
		this.lWing04 = new ModelRenderer(this, 63, 36);
		this.lWing04.setRotationPoint(0.0F, 0.0F, 6.6F);
		this.lWing04.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F);
		this.setRotateAngle(lWing04, 0.3490658503988659F, 0.0F, 0.0F);
		this.lWing01 = new ModelRenderer(this, 64, 17);
		this.lWing01.setRotationPoint(0.0F, 11.0F, 0.0F);
		this.lWing01.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 5, 0.0F);
		this.setRotateAngle(lWing01, 0.10471975511965977F, 0.0F, 0.13962634015954636F);
		this.rHorn05 = new ModelRenderer(this, 47, 5);
		this.rHorn05.mirror = true;
		this.rHorn05.setRotationPoint(-2.8F, 0.0F, 0.0F);
		this.rHorn05.addBox(-3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
		this.setRotateAngle(rHorn05, 0.0F, 0.0F, 0.22689280275926282F);
		this.rWing03 = new ModelRenderer(this, 63, 36);
		this.rWing03.mirror = true;
		this.rWing03.setRotationPoint(0.0F, 0.2F, 5.6F);
		this.rWing03.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F);
		this.setRotateAngle(rWing03, 0.3665191429188092F, 0.0F, 0.0F);
		this.lWing03 = new ModelRenderer(this, 63, 36);
		this.lWing03.setRotationPoint(0.0F, 0.2F, 5.6F);
		this.lWing03.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F);
		this.setRotateAngle(lWing03, 0.3665191429188092F, 0.0F, 0.0F);
		this.lWing02b = new ModelRenderer(this, 81, 25);
		this.lWing02b.setRotationPoint(0.0F, 1.7F, 0.0F);
		this.lWing02b.addBox(-0.5F, -1.2F, -0.7F, 1, 2, 7, 0.0F);
		this.lLeg02 = new ModelRenderer(this, 0, 32);
		this.lLeg02.setRotationPoint(0.2F, 7.6F, -0.3F);
		this.lLeg02.addBox(-1.5F, 0.0F, -2.0F, 3, 8, 4, 0.0F);
		this.setRotateAngle(lLeg02, 0.6981317007977318F, 0.0F, 0.10471975511965977F);
		this.skirtB = new ModelRenderer(this, 98, 19);
		this.skirtB.setRotationPoint(0.0F, -0.1F, 1.5F);
		this.skirtB.addBox(-4.0F, 0.0F, -0.9F, 8, 12, 2, 0.0F);
		this.lHorn02 = new ModelRenderer(this, 37, 6);
		this.lHorn02.setRotationPoint(1.5F, 0.1F, 0.0F);
		this.lHorn02.addBox(0.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F);
		this.setRotateAngle(lHorn02, 0.0F, 0.0F, -0.5235987755982988F);
		this.bipedRightLeg = new ModelRenderer(this, 0, 16);
		this.bipedRightLeg.mirror = true;
		this.bipedRightLeg.setRotationPoint(-1.7F, 14.7F, -0.2F);
		this.bipedRightLeg.addBox(-2.0F, -1.0F, -2.5F, 4, 10, 5, 0.0F);
		this.setRotateAngle(bipedRightLeg, -0.3141592653589793F, 0.0F, 0.10471975511965977F);
		this.lWing05 = new ModelRenderer(this, 64, 46);
		this.lWing05.setRotationPoint(0.0F, 0.0F, 6.6F);
		this.lWing05.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F);
		this.setRotateAngle(lWing05, 0.3490658503988659F, 0.0F, 0.0F);
		this.lHorn03a = new ModelRenderer(this, 47, 0);
		this.lHorn03a.setRotationPoint(2.7F, 0.1F, 0.0F);
		this.lHorn03a.addBox(0.0F, -0.8F, -0.8F, 3, 1, 1, 0.0F);
		this.setRotateAngle(lHorn03a, 0.0F, 0.0F, -0.3665191429188092F);
		this.rHorn04c = new ModelRenderer(this, 47, 0);
		this.rHorn04c.mirror = true;
		this.rHorn04c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn04c.addBox(-3.0F, -0.8F, -0.2F, 3, 1, 1, 0.0F);
		this.lWing01b = new ModelRenderer(this, 81, 18);
		this.lWing01b.setRotationPoint(0.0F, 1.8F, 0.0F);
		this.lWing01b.addBox(-0.5F, -1.2F, 0.0F, 1, 2, 5, 0.0F);
		this.lHorn03c = new ModelRenderer(this, 47, 0);
		this.lHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03c.addBox(0.0F, -0.8F, -0.2F, 3, 1, 1, 0.0F);
		this.lLeg03 = new ModelRenderer(this, 0, 46);
		this.lLeg03.setRotationPoint(0.0F, 7.4F, -0.2F);
		this.lLeg03.addBox(-1.0F, 0.0F, -1.5F, 2, 8, 3, 0.0F);
		this.setRotateAngle(lLeg03, -0.41887902047863906F, 0.0F, 0.0F);
		this.rHorn04d = new ModelRenderer(this, 47, 0);
		this.rHorn04d.mirror = true;
		this.rHorn04d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn04d.addBox(-3.0F, -0.2F, -0.2F, 3, 1, 1, 0.0F);
		this.rLeg03 = new ModelRenderer(this, 0, 46);
		this.rLeg03.mirror = true;
		this.rLeg03.setRotationPoint(0.0F, 7.4F, -0.2F);
		this.rLeg03.addBox(-1.0F, 0.0F, -1.5F, 2, 8, 3, 0.0F);
		this.setRotateAngle(rLeg03, -0.41887902047863906F, 0.0F, 0.0F);
		this.rFang = new ModelRenderer(this, 14, 57);
		this.rFang.mirror = true;
		this.rFang.setRotationPoint(-1.5F, 0.0F, -1.4F);
		this.rFang.addBox(-0.51F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		this.rHorn03c = new ModelRenderer(this, 47, 0);
		this.rHorn03c.mirror = true;
		this.rHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03c.addBox(-3.0F, -0.8F, -0.2F, 3, 1, 1, 0.0F);
		this.lWing05b = new ModelRenderer(this, 81, 49);
		this.lWing05b.setRotationPoint(0.0F, 1.6F, 0.2F);
		this.lWing05b.addBox(-0.49F, -1.2F, -0.7F, 1, 2, 8, 0.0F);
		this.setRotateAngle(lWing05b, 0.19198621771937624F, 0.0F, 0.0F);
		this.lHorn03b = new ModelRenderer(this, 47, 0);
		this.lHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03b.addBox(0.0F, -0.2F, -0.8F, 3, 1, 1, 0.0F);
		this.bipedRightArm = new ModelRenderer(this, 44, 16);
		this.bipedRightArm.mirror = true;
		this.bipedRightArm.setRotationPoint(-4.5F, 2.3F, 0.0F);
		this.bipedRightArm.addBox(-2.0F, -2.0F, -1.5F, 3, 11, 3, 0.0F);
		this.setRotateAngle(bipedRightArm, 0.10471975511965977F, 0.0F, 0.10000736613927509F);
		this.skirtF = new ModelRenderer(this, 93, 35);
		this.skirtF.setRotationPoint(0.0F, -0.1F, -1.3F);
		this.skirtF.addBox(-4.5F, -0.6F, -0.9F, 9, 12, 2, 0.0F);
		this.setRotateAngle(skirtF, -0.3490658503988659F, 0.0F, 0.0F);
		this.rWing05b = new ModelRenderer(this, 81, 49);
		this.rWing05b.mirror = true;
		this.rWing05b.setRotationPoint(0.0F, 1.6F, 0.2F);
		this.rWing05b.addBox(-0.51F, -1.2F, -0.7F, 1, 2, 8, 0.0F);
		this.setRotateAngle(rWing05b, 0.19198621771937624F, 0.0F, 0.0F);
		this.lArm02 = new ModelRenderer(this, 44, 31);
		this.lArm02.setRotationPoint(0.4F, 8.4F, 0.1F);
		this.lArm02.addBox(-1.5F, 0.0F, -1.5F, 3, 12, 3, 0.0F);
		this.setRotateAngle(lArm02, -0.3665191429188092F, 0.0F, 0.0F);
		this.rEara = new ModelRenderer(this, 22, 0);
		this.rEara.mirror = true;
		this.rEara.setRotationPoint(-2.9F, -4.0F, 0.0F);
		this.rEara.addBox(-2.0F, -4.5F, -0.5F, 4, 5, 1, 0.0F);
		this.setRotateAngle(rEara, -0.13962634015954636F, 0.6981317007977318F, -0.6981317007977318F);
		this.lWing05c = new ModelRenderer(this, 67, 55);
		this.lWing05c.setRotationPoint(0.0F, 0.2F, 7.4F);
		this.lWing05c.addBox(-0.5F, -0.5F, -0.7F, 1, 1, 6, 0.0F);
		this.setRotateAngle(lWing05c, 0.19198621771937624F, 0.0F, 0.0F);
		this.mhair02 = new ModelRenderer(this, 75, 0);
		this.mhair02.setRotationPoint(0.0F, -2.0F, 3.0F);
		this.mhair02.addBox(-3.0F, -1.0F, 0.0F, 6, 8, 1, 0.0F);
		this.setRotateAngle(mhair02, 0.41887902047863906F, 0.0F, 0.0F);
		this.lEarb = new ModelRenderer(this, 29, 8);
		this.lEarb.setRotationPoint(-0.9F, -4.0F, 0.0F);
		this.lEarb.addBox(-1.0F, -3.2F, -0.5F, 2, 3, 1, 0.0F);
		this.setRotateAngle(lEarb, 0.0F, 0.0F, -0.22689280275926282F);
		this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
		this.bipedLeftLeg.setRotationPoint(1.7F, 14.7F, -0.2F);
		this.bipedLeftLeg.addBox(-2.0F, -1.0F, -2.5F, 4, 10, 5, 0.0F);
		this.setRotateAngle(bipedLeftLeg, -0.3141592653589793F, 0.0F, -0.10471975511965977F);
		this.rHorn03b = new ModelRenderer(this, 47, 0);
		this.rHorn03b.mirror = true;
		this.rHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03b.addBox(-3.0F, -0.2F, -0.8F, 3, 1, 1, 0.0F);
		this.lWing03b = new ModelRenderer(this, 74, 38);
		this.lWing03b.setRotationPoint(0.0F, 1.5F, 0.3F);
		this.lWing03b.addBox(-0.5F, -1.2F, -0.7F, 1, 2, 8, 0.0F);
		this.mhair01 = new ModelRenderer(this, 57, 0);
		this.mhair01.setRotationPoint(0.0F, -5.6F, 3.1F);
		this.mhair01.addBox(-3.5F, -1.0F, 0.0F, 7, 10, 1, 0.0F);
		this.setRotateAngle(mhair01, 0.5235987755982988F, 0.0F, 0.0F);
		this.bipedBody = new ModelRenderer(this, 19, 16);
		this.bipedBody.setRotationPoint(0.0F, -12.6F, 0.0F);
		this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 6, 4, 0.0F);
		this.hips = new ModelRenderer(this, 19, 39);
		this.hips.setRotationPoint(0.0F, 6.3F, 0.0F);
		this.hips.addBox(-3.5F, 0.0F, -2.0F, 7, 4, 4, 0.0F);
		this.rWing01b = new ModelRenderer(this, 81, 18);
		this.rWing01b.mirror = true;
		this.rWing01b.setRotationPoint(0.0F, 1.8F, 0.0F);
		this.rWing01b.addBox(-0.5F, -1.2F, 0.0F, 1, 2, 5, 0.0F);
		this.rWing02b = new ModelRenderer(this, 81, 25);
		this.rWing02b.mirror = true;
		this.rWing02b.setRotationPoint(0.0F, 1.7F, 0.0F);
		this.rWing02b.addBox(-0.5F, -1.2F, -0.7F, 1, 2, 7, 0.0F);
		this.lSkirt = new ModelRenderer(this, 112, 45);
		this.lSkirt.setRotationPoint(3.0F, 0.3F, -0.1F);
		this.lSkirt.addBox(-0.6F, -0.8F, -2.0F, 2, 12, 5, 0.0F);
		this.setRotateAngle(lSkirt, -0.22689280275926282F, 0.0F, -0.06981317007977318F);
		this.lHorn04b = new ModelRenderer(this, 47, 0);
		this.lHorn04b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn04b.addBox(0.0F, -0.2F, -0.8F, 3, 1, 1, 0.0F);
		this.bipedHead.addChild(this.lowerJaw);
		this.bipedHead.addChild(this.lHorn01);
		this.bipedBody.addChild(this.bipedLeftArm);
		this.lWing04.addChild(this.lWing04b);
		this.rHorn01.addChild(this.rHorn02);
		this.hips.addChild(this.rSkirt);
		this.lHorn03a.addChild(this.lHorn03d);
		this.upperJaw.addChild(this.nose);
		this.lArm02.addChild(this.lClaw);
		this.rWing04.addChild(this.rWing05);
		this.bipedHead.addChild(this.lEara);
		this.rArm02.addChild(this.rClaw);
		this.bipedHead.addChild(this.rHair01);
		this.rWing05b.addChild(this.rWing05c);
		this.lLeg03.addChild(this.lHoof);
		this.bipedBody.addChild(this.bipedHead);
		this.rHorn03a.addChild(this.rHorn03d);
		this.rHorn04a.addChild(this.rHorn04b);
		this.rEara.addChild(this.rEarb);
		this.rArm02.addChild(this.rWing01);
		this.lWing01.addChild(this.lWing02);
		this.bipedBody.addChild(this.boobs);
		this.lHorn03a.addChild(this.lHorn04a);
		this.rHorn03a.addChild(this.rHorn04a);
		this.rWing03.addChild(this.rWing03b);
		this.upperJaw.addChild(this.lFang);
		this.rHorn02.addChild(this.rHorn03a);
		this.rWing01.addChild(this.rWing02);
		this.bipedHead.addChild(this.lHair01);
		this.rLeg03.addChild(this.rHoof);
		this.bipedHead.addChild(this.rHorn01);
		this.rWing03.addChild(this.rWing04);
		this.bipedRightLeg.addChild(this.rLeg02);
		this.lHorn04a.addChild(this.lHorn04d);
		this.rWing04.addChild(this.rWing04b);
		this.bipedBody.addChild(this.stomach);
		this.lHorn04a.addChild(this.lHorn05);
		this.lHorn04a.addChild(this.lHorn04c);
		this.bipedHead.addChild(this.upperJaw);
		this.bipedRightArm.addChild(this.rArm02);
		this.lWing03.addChild(this.lWing04);
		this.lArm02.addChild(this.lWing01);
		this.rHorn04a.addChild(this.rHorn05);
		this.rWing02.addChild(this.rWing03);
		this.lWing02.addChild(this.lWing03);
		this.lWing02.addChild(this.lWing02b);
		this.bipedLeftLeg.addChild(this.lLeg02);
		this.hips.addChild(this.skirtB);
		this.lHorn01.addChild(this.lHorn02);
		this.bipedBody.addChild(this.bipedRightLeg);
		this.lWing04.addChild(this.lWing05);
		this.lHorn02.addChild(this.lHorn03a);
		this.rHorn04a.addChild(this.rHorn04c);
		this.lWing01.addChild(this.lWing01b);
		this.lHorn03a.addChild(this.lHorn03c);
		this.lLeg02.addChild(this.lLeg03);
		this.rHorn04a.addChild(this.rHorn04d);
		this.rLeg02.addChild(this.rLeg03);
		this.upperJaw.addChild(this.rFang);
		this.rHorn03a.addChild(this.rHorn03c);
		this.lWing05.addChild(this.lWing05b);
		this.lHorn03a.addChild(this.lHorn03b);
		this.bipedBody.addChild(this.bipedRightArm);
		this.hips.addChild(this.skirtF);
		this.rWing05.addChild(this.rWing05b);
		this.bipedLeftArm.addChild(this.lArm02);
		this.bipedHead.addChild(this.rEara);
		this.lWing05b.addChild(this.lWing05c);
		this.bipedHead.addChild(this.mhair02);
		this.lEara.addChild(this.lEarb);
		this.bipedBody.addChild(this.bipedLeftLeg);
		this.rHorn03a.addChild(this.rHorn03b);
		this.lWing03.addChild(this.lWing03b);
		this.bipedHead.addChild(this.mhair01);
		this.stomach.addChild(this.hips);
		this.rWing01.addChild(this.rWing01b);
		this.rWing02.addChild(this.rWing02b);
		this.hips.addChild(this.lSkirt);
		this.lHorn04a.addChild(this.lHorn04b);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.bipedBody.render(f5);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
