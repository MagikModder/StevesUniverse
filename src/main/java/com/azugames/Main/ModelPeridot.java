package com.azugames.Main;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;



public class ModelPeridot extends ModelBase
{
  //fields
    ModelRenderer hair_1;
    ModelRenderer hair_2;
    ModelRenderer hair_3;
    ModelRenderer hair_4;
    ModelRenderer hair_5;
    ModelRenderer hair_6;
    ModelRenderer hair_7;
    ModelRenderer hair_8;
    ModelRenderer hair_9;
    ModelRenderer hair_10;
    ModelRenderer hair_11;
    ModelRenderer hair_12;
    ModelRenderer hair_13;
    ModelRenderer hair_14;
    ModelRenderer hair_15;
    ModelRenderer head;
    ModelRenderer neck;
    ModelRenderer shoulder_pad;
    ModelRenderer chest;
    ModelRenderer right_arm_top;
    ModelRenderer right_arm_1;
    ModelRenderer right_arm_2;
    ModelRenderer right_arm_3;
    ModelRenderer right_arm_4;
    ModelRenderer right_arm_5;
    ModelRenderer right_index_finger;
    ModelRenderer right_middle_finger;
    ModelRenderer right_ring_finger;
    ModelRenderer right_pinky_finger;
    ModelRenderer right_thumb;
    ModelRenderer left_arm_top;
    ModelRenderer left_arm_1;
    ModelRenderer left_arm_2;
    ModelRenderer left_arm_3;
    ModelRenderer left_arm_4;
    ModelRenderer left_arm_5;
    ModelRenderer left_index_finger;
    ModelRenderer left_middle_finger;
    ModelRenderer left_ring_finger;
    ModelRenderer left_pinky;
    ModelRenderer left_thumb;
    ModelRenderer waist_1;
    ModelRenderer waist_2;
    ModelRenderer waist_3;
    ModelRenderer hips;
    ModelRenderer right_leg_1;
    ModelRenderer right_leg_2;
    ModelRenderer right_boot_1;
    ModelRenderer right_boot_2;
    ModelRenderer right_boot_3;
    ModelRenderer right_boot_4;
    ModelRenderer right_boot_end;
    ModelRenderer right_foot_1;
    ModelRenderer right_foot_2;
    ModelRenderer left_leg_1;
    ModelRenderer left_leg_2;
    ModelRenderer left_boot_1;
    ModelRenderer left_boot_2;
    ModelRenderer left_boot_3;
    ModelRenderer left_boot_4;
    ModelRenderer left_boot_end;
    ModelRenderer left_foot_1;
    ModelRenderer left_foot_2;
    ModelRenderer armpit_1;
    ModelRenderer armpit_2;
  
  public ModelPeridot()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      hair_1 = new ModelRenderer(this, 21, 25);
      hair_1.addBox(-4F, -12F, 0F, 7, 12, 6);
      hair_1.setRotationPoint(3F, -13F, 4F);
      hair_1.setTextureSize(128, 128);
      hair_1.mirror = true;
      setRotation(hair_1, -1.37881F, 0F, 0F);
      hair_2 = new ModelRenderer(this, 46, 3);
      hair_2.addBox(-12F, 0F, 0F, 12, 3, 7);
      hair_2.setRotationPoint(11F, -14.3F, -1F);
      hair_2.setTextureSize(128, 128);
      hair_2.mirror = true;
      setRotation(hair_2, 0F, 0F, 0.7853982F);
      hair_3 = new ModelRenderer(this, 21, 25);
      hair_3.addBox(1F, -12F, 0F, 2, 9, 7);
      hair_3.setRotationPoint(-4.6F, -15.8F, 2F);
      hair_3.setTextureSize(128, 128);
      hair_3.mirror = true;
      setRotation(hair_3, -1.553343F, 0.2268928F, 0F);
      hair_4 = new ModelRenderer(this, 46, 3);
      hair_4.addBox(0F, 0F, 0F, 12, 3, 7);
      hair_4.setRotationPoint(-6F, -14.3F, -1F);
      hair_4.setTextureSize(128, 128);
      hair_4.mirror = true;
      setRotation(hair_4, 0F, 0F, -0.7853982F);
      hair_5 = new ModelRenderer(this, 88, 24);
      hair_5.addBox(0F, -1F, 0F, 9, 1, 7);
      hair_5.setRotationPoint(6.4F, -6.5F, -1F);
      hair_5.setTextureSize(128, 128);
      hair_5.mirror = true;
      setRotation(hair_5, 0F, 0F, -1.033462F);
      hair_6 = new ModelRenderer(this, 18, 30);
      hair_6.addBox(-9F, -1F, 0F, 9, 1, 7);
      hair_6.setRotationPoint(-1.4F, -6.5F, -1F);
      hair_6.setTextureSize(128, 128);
      hair_6.mirror = true;
      setRotation(hair_6, 0F, 0F, 1.033462F);
      hair_7 = new ModelRenderer(this, 22, 29);
      hair_7.addBox(0F, 0F, 0F, 5, 3, 1);
      hair_7.setRotationPoint(0F, -19.1F, -1F);
      hair_7.setTextureSize(128, 128);
      hair_7.mirror = true;
      setRotation(hair_7, 0F, 0F, 0F);
      hair_8 = new ModelRenderer(this, 21, 31);
      hair_8.addBox(-3F, -4F, 0F, 12, 2, 12);
      hair_8.setRotationPoint(-3.8F, -16.4F, 1.9F);
      hair_8.setTextureSize(128, 128);
      hair_8.mirror = true;
      setRotation(hair_8, -1.596976F, -0.0174533F, -0.7941248F);
      hair_9 = new ModelRenderer(this, 28, 33);
      hair_9.addBox(0F, 0F, 0F, 7, 2, 1);
      hair_9.setRotationPoint(-1.5F, -6.7F, -1F);
      hair_9.setTextureSize(128, 128);
      hair_9.mirror = true;
      setRotation(hair_9, 0F, 0F, -1.972222F);
      hair_10 = new ModelRenderer(this, 18, 26);
      hair_10.addBox(-4F, -9F, 0F, 8, 4, 4);
      hair_10.setRotationPoint(2.5F, -10.6F, -3.1F);
      hair_10.setTextureSize(128, 128);
      hair_10.mirror = true;
      setRotation(hair_10, -1.570796F, 0F, 0F);
      hair_11 = new ModelRenderer(this, 28, 33);
      hair_11.addBox(-6F, 0F, 0F, 6, 2, 1);
      hair_11.setRotationPoint(-1F, -17.5F, -1F);
      hair_11.setTextureSize(128, 128);
      hair_11.mirror = true;
      setRotation(hair_11, 0F, 0F, -1.099557F);
      hair_12 = new ModelRenderer(this, 28, 33);
      hair_12.addBox(-7F, 0F, 0F, 7, 2, 1);
      hair_12.setRotationPoint(6.5F, -6.7F, -1F);
      hair_12.setTextureSize(128, 128);
      hair_12.mirror = true;
      setRotation(hair_12, 0F, 0F, 1.972222F);
      hair_13 = new ModelRenderer(this, 28, 33);
      hair_13.addBox(0F, 0F, 0F, 6, 2, 1);
      hair_13.setRotationPoint(6F, -17.5F, -1F);
      hair_13.setTextureSize(128, 128);
      hair_13.mirror = true;
      setRotation(hair_13, 0F, 0F, 1.099557F);
      hair_14 = new ModelRenderer(this, 21, 25);
      hair_14.addBox(-4F, 0F, 0F, 7, 12, 6);
      hair_14.setRotationPoint(3F, -13F, 4F);
      hair_14.setTextureSize(128, 128);
      hair_14.mirror = true;
      setRotation(hair_14, 1.256637F, 0F, 0F);
      hair_15 = new ModelRenderer(this, 21, 25);
      hair_15.addBox(-4F, -12F, 0F, 2, 9, 7);
      hair_15.setRotationPoint(10.6F, -15.8F, 2F);
      hair_15.setTextureSize(128, 128);
      hair_15.mirror = true;
      setRotation(hair_15, -1.553343F, -0.2268928F, 0F);
      head = new ModelRenderer(this, 75, 42);
      head.addBox(0F, -0.5F, 0F, 8, 9, 2);
      head.setRotationPoint(-1.5F, -16F, 0F);
      head.setTextureSize(128, 128);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      neck = new ModelRenderer(this, 79, 55);
      neck.addBox(0F, 0F, 0F, 2, 2, 1);
      neck.setRotationPoint(1.5F, -8F, 1F);
      neck.setTextureSize(128, 128);
      neck.mirror = true;
      setRotation(neck, 0F, 0F, 0F);
      shoulder_pad = new ModelRenderer(this, 70, 59);
      shoulder_pad.addBox(0F, 0F, 0F, 10, 1, 3);
      shoulder_pad.setRotationPoint(-2.5F, -6F, 0F);
      shoulder_pad.setTextureSize(128, 128);
      shoulder_pad.mirror = true;
      setRotation(shoulder_pad, 0F, 0F, 0F);
      chest = new ModelRenderer(this, 73, 64);
      chest.addBox(0F, 0F, 0F, 5, 5, 4);
      chest.setRotationPoint(0F, -5F, -1F);
      chest.setTextureSize(128, 128);
      chest.mirror = true;
      setRotation(chest, 0F, 0F, 0F);
      right_arm_top = new ModelRenderer(this, 110, 56);
      right_arm_top.addBox(0F, -5F, 0F, 2, 6, 2);
      right_arm_top.setRotationPoint(7F, -0.1F, 0F);
      right_arm_top.setTextureSize(128, 128);
      right_arm_top.mirror = true;
      setRotation(right_arm_top, 0F, 0F, -0.418879F);
      right_arm_1 = new ModelRenderer(this, 115, 90);
      right_arm_1.addBox(0F, 0F, 0F, 3, 3, 3);
      right_arm_1.setRotationPoint(6.5F, -0.2F, -0.5F);
      right_arm_1.setTextureSize(128, 128);
      right_arm_1.mirror = true;
      setRotation(right_arm_1, 0F, 0F, -0.1919862F);
      right_arm_2 = new ModelRenderer(this, 102, 65);
      right_arm_2.addBox(-1.5F, 0F, 0F, 3, 8, 3);
      right_arm_2.setRotationPoint(8F, -0.3F, -0.5F);
      right_arm_2.setTextureSize(128, 128);
      right_arm_2.mirror = true;
      setRotation(right_arm_2, -0.1745329F, 0F, 0.0174533F);
      right_arm_3 = new ModelRenderer(this, 115, 65);
      right_arm_3.addBox(-1.5F, 0F, 0F, 3, 8, 3);
      right_arm_3.setRotationPoint(8F, -0.3F, -0.5F);
      right_arm_3.setTextureSize(128, 128);
      right_arm_3.mirror = true;
      setRotation(right_arm_3, -0.1745329F, 0F, -0.3490659F);
      right_arm_4 = new ModelRenderer(this, 102, 77);
      right_arm_4.addBox(-1.5F, 0.5F, 0F, 3, 8, 3);
      right_arm_4.setRotationPoint(8F, -0.3F, -0.5F);
      right_arm_4.setTextureSize(128, 128);
      right_arm_4.mirror = true;
      setRotation(right_arm_4, 0.1745329F, 0F, 0.0174533F);
      right_arm_5 = new ModelRenderer(this, 115, 77);
      right_arm_5.addBox(-1.5F, 0.5F, 0F, 3, 8, 3);
      right_arm_5.setRotationPoint(8F, -0.3F, -0.5F);
      right_arm_5.setTextureSize(128, 128);
      right_arm_5.mirror = true;
      setRotation(right_arm_5, 0.1745329F, 0F, -0.3490659F);
      right_index_finger = new ModelRenderer(this, 108, 93);
      right_index_finger.addBox(0F, 0F, 0F, 1, 2, 1);
      right_index_finger.setRotationPoint(7F, 8.4F, -1F);
      right_index_finger.setTextureSize(128, 128);
      right_index_finger.mirror = true;
      setRotation(right_index_finger, -0.1570796F, 0F, 0.122173F);
      right_middle_finger = new ModelRenderer(this, 108, 93);
      right_middle_finger.addBox(0F, 0F, 0F, 1, 2, 1);
      right_middle_finger.setRotationPoint(8.5F, 8.6F, -1F);
      right_middle_finger.setTextureSize(128, 128);
      right_middle_finger.mirror = true;
      setRotation(right_middle_finger, -0.1570796F, 0F, -0.1047198F);
      right_ring_finger = new ModelRenderer(this, 108, 93);
      right_ring_finger.addBox(0F, 0F, 0F, 1, 2, 1);
      right_ring_finger.setRotationPoint(9.8F, 8.4F, -1F);
      right_ring_finger.setTextureSize(128, 128);
      right_ring_finger.mirror = true;
      setRotation(right_ring_finger, -0.1570796F, 0F, -0.3665191F);
      right_pinky_finger = new ModelRenderer(this, 108, 93);
      right_pinky_finger.addBox(0F, 0F, 0F, 1, 2, 1);
      right_pinky_finger.setRotationPoint(11.3F, 7.8F, -1F);
      right_pinky_finger.setTextureSize(128, 128);
      right_pinky_finger.mirror = true;
      setRotation(right_pinky_finger, -0.1570796F, 0F, -0.4886922F);
      right_thumb = new ModelRenderer(this, 108, 93);
      right_thumb.addBox(0F, 0F, 0F, 1, 2, 1);
      right_thumb.setRotationPoint(7.3F, 8.5F, 3F);
      right_thumb.setTextureSize(128, 128);
      right_thumb.mirror = true;
      setRotation(right_thumb, 0.3490659F, 0F, 0.0349066F);
      left_arm_top = new ModelRenderer(this, 45, 72);
      left_arm_top.addBox(-2F, -5F, 0F, 2, 6, 2);
      left_arm_top.setRotationPoint(-2F, -0.1F, 0F);
      left_arm_top.setTextureSize(128, 128);
      left_arm_top.mirror = true;
      setRotation(left_arm_top, 0F, 0F, 0.418879F);
      left_arm_1 = new ModelRenderer(this, 7, 93);
      left_arm_1.addBox(-3F, 0F, 0F, 3, 3, 3);
      left_arm_1.setRotationPoint(-1.5F, -0.2F, -0.5F);
      left_arm_1.setTextureSize(128, 128);
      left_arm_1.mirror = true;
      setRotation(left_arm_1, 0F, 0F, 0.1919862F);
      left_arm_2 = new ModelRenderer(this, 11, 81);
      left_arm_2.addBox(-1.5F, 0F, 0F, 3, 8, 3);
      left_arm_2.setRotationPoint(-3F, -0.3F, -0.5F);
      left_arm_2.setTextureSize(128, 128);
      left_arm_2.mirror = true;
      setRotation(left_arm_2, -0.1745329F, 0F, -0.0174533F);
      left_arm_3 = new ModelRenderer(this, 24, 81);
      left_arm_3.addBox(-1.5F, 0F, 0F, 3, 8, 3);
      left_arm_3.setRotationPoint(-3F, -0.3F, -0.5F);
      left_arm_3.setTextureSize(128, 128);
      left_arm_3.mirror = true;
      setRotation(left_arm_3, -0.1745329F, 0F, 0.3490659F);
      left_arm_4 = new ModelRenderer(this, 37, 81);
      left_arm_4.addBox(-1.5F, 0.5F, 0F, 3, 8, 3);
      left_arm_4.setRotationPoint(-3F, -0.3F, -0.5F);
      left_arm_4.setTextureSize(128, 128);
      left_arm_4.mirror = true;
      setRotation(left_arm_4, 0.1745329F, 0F, 0.3490659F);
      left_arm_5 = new ModelRenderer(this, 50, 81);
      left_arm_5.addBox(-1.5F, 0.5F, 0F, 3, 8, 3);
      left_arm_5.setRotationPoint(-3F, -0.3F, -0.5F);
      left_arm_5.setTextureSize(128, 128);
      left_arm_5.mirror = true;
      setRotation(left_arm_5, 0.1745329F, 0F, -0.0174533F);
      left_index_finger = new ModelRenderer(this, 46, 93);
      left_index_finger.addBox(-1F, 0F, 0F, 1, 2, 1);
      left_index_finger.setRotationPoint(-2F, 8.4F, -1F);
      left_index_finger.setTextureSize(128, 128);
      left_index_finger.mirror = true;
      setRotation(left_index_finger, -0.1570796F, 0F, -0.122173F);
      left_middle_finger = new ModelRenderer(this, 46, 93);
      left_middle_finger.addBox(-1F, 0F, 0F, 1, 2, 1);
      left_middle_finger.setRotationPoint(-3.5F, 8.6F, -1F);
      left_middle_finger.setTextureSize(128, 128);
      left_middle_finger.mirror = true;
      setRotation(left_middle_finger, -0.1570796F, 0F, 0.1047198F);
      left_ring_finger = new ModelRenderer(this, 46, 93);
      left_ring_finger.addBox(-1F, 0F, 0F, 1, 2, 1);
      left_ring_finger.setRotationPoint(-4.8F, 8.4F, -1F);
      left_ring_finger.setTextureSize(128, 128);
      left_ring_finger.mirror = true;
      setRotation(left_ring_finger, -0.1570796F, 0F, 0.3665191F);
      left_pinky = new ModelRenderer(this, 46, 93);
      left_pinky.addBox(-1F, 0F, 0F, 1, 2, 1);
      left_pinky.setRotationPoint(-6.3F, 7.8F, -1F);
      left_pinky.setTextureSize(128, 128);
      left_pinky.mirror = true;
      setRotation(left_pinky, -0.1570796F, 0F, 0.4886922F);
      left_thumb = new ModelRenderer(this, 46, 93);
      left_thumb.addBox(-1F, 0F, 0F, 1, 2, 1);
      left_thumb.setRotationPoint(-2.7F, 8.7F, 3F);
      left_thumb.setTextureSize(128, 128);
      left_thumb.mirror = true;
      setRotation(left_thumb, 0.3490659F, 0F, 0.0349066F);
      waist_1 = new ModelRenderer(this, 75, 74);
      waist_1.addBox(0F, 0F, 0F, 5, 3, 3);
      waist_1.setRotationPoint(0F, 0F, 0F);
      waist_1.setTextureSize(128, 128);
      waist_1.mirror = true;
      setRotation(waist_1, 0F, 0F, 0F);
      waist_2 = new ModelRenderer(this, 81, 75);
      waist_2.addBox(-2F, 0F, 0F, 2, 2, 3);
      waist_2.setRotationPoint(2F, 2F, 0F);
      waist_2.setTextureSize(128, 128);
      waist_2.mirror = true;
      setRotation(waist_2, 0F, 0F, 0.4363323F);
      waist_3 = new ModelRenderer(this, 75, 75);
      waist_3.addBox(0F, 0F, 0F, 2, 2, 3);
      waist_3.setRotationPoint(3F, 2F, 0F);
      waist_3.setTextureSize(128, 128);
      waist_3.mirror = true;
      setRotation(waist_3, 0F, 0F, -0.4363323F);
      hips = new ModelRenderer(this, 73, 81);
      hips.addBox(0F, 0F, 0F, 7, 3, 4);
      hips.setRotationPoint(-1F, 3F, -0.5F);
      hips.setTextureSize(128, 128);
      hips.mirror = true;
      setRotation(hips, 0F, 0F, 0F);
      right_leg_1 = new ModelRenderer(this, 88, 89);
      right_leg_1.addBox(0F, 0F, 0F, 2, 6, 2);
      right_leg_1.setRotationPoint(4F, 5F, 0F);
      right_leg_1.setTextureSize(128, 128);
      right_leg_1.mirror = true;
      setRotation(right_leg_1, 0F, 0F, -0.0523599F);
      right_leg_2 = new ModelRenderer(this, 98, 89);
      right_leg_2.addBox(-1F, 0F, 0F, 2, 6, 2);
      right_leg_2.setRotationPoint(4F, 5F, 0F);
      right_leg_2.setTextureSize(128, 128);
      right_leg_2.mirror = true;
      setRotation(right_leg_2, 0F, 0F, -0.2268928F);
      right_boot_1 = new ModelRenderer(this, 68, 98);
      right_boot_1.addBox(-1.5F, 0.5F, 0F, 4, 12, 3);
      right_boot_1.setRotationPoint(5F, 10.7F, -0.5F);
      right_boot_1.setTextureSize(128, 128);
      right_boot_1.mirror = true;
      setRotation(right_boot_1, -0.0785398F, 0F, 0.0785398F);
      right_boot_2 = new ModelRenderer(this, 83, 98);
      right_boot_2.addBox(-1.5F, 0.5F, 0F, 4, 12, 3);
      right_boot_2.setRotationPoint(5F, 10.7F, -0.5F);
      right_boot_2.setTextureSize(128, 128);
      right_boot_2.mirror = true;
      setRotation(right_boot_2, -0.0785398F, 0F, -0.0785398F);
      right_boot_3 = new ModelRenderer(this, 98, 98);
      right_boot_3.addBox(-1.5F, 0.5F, 0F, 4, 12, 3);
      right_boot_3.setRotationPoint(5F, 10.7F, -0.5F);
      right_boot_3.setTextureSize(128, 128);
      right_boot_3.mirror = true;
      setRotation(right_boot_3, 0.0785398F, 0F, 0.0785398F);
      right_boot_4 = new ModelRenderer(this, 113, 98);
      right_boot_4.addBox(-1.5F, 0.5F, 0F, 4, 12, 3);
      right_boot_4.setRotationPoint(5F, 10.7F, -0.5F);
      right_boot_4.setTextureSize(128, 128);
      right_boot_4.mirror = true;
      setRotation(right_boot_4, 0.0785398F, 0F, -0.0785398F);
      right_boot_end = new ModelRenderer(this, 88, 114);
      right_boot_end.addBox(0F, 0F, 0F, 6, 2, 5);
      right_boot_end.setRotationPoint(2.5F, 22F, -1.5F);
      right_boot_end.setTextureSize(128, 128);
      right_boot_end.mirror = true;
      setRotation(right_boot_end, 0F, 0F, 0F);
      right_foot_1 = new ModelRenderer(this, 90, 122);
      right_foot_1.addBox(0F, 0F, 0F, 4, 2, 3);
      right_foot_1.setRotationPoint(3.5F, 22F, -4F);
      right_foot_1.setTextureSize(128, 128);
      right_foot_1.mirror = true;
      setRotation(right_foot_1, 0.418879F, 0F, 0F);
      right_foot_2 = new ModelRenderer(this, 90, 122);
      right_foot_2.addBox(0F, 0F, 0F, 4, 2, 3);
      right_foot_2.setRotationPoint(3.5F, 22F, -4F);
      right_foot_2.setTextureSize(128, 128);
      right_foot_2.mirror = true;
      setRotation(right_foot_2, 0F, 0F, 0F);
      left_leg_1 = new ModelRenderer(this, 63, 89);
      left_leg_1.addBox(-2F, 0F, 0F, 2, 6, 2);
      left_leg_1.setRotationPoint(2F, 5F, 0F);
      left_leg_1.setTextureSize(128, 128);
      left_leg_1.mirror = true;
      setRotation(left_leg_1, 0F, 0F, 0.2268928F);
      left_leg_2 = new ModelRenderer(this, 73, 89);
      left_leg_2.addBox(-2F, 0F, 0F, 2, 6, 2);
      left_leg_2.setRotationPoint(1F, 5F, 0F);
      left_leg_2.setTextureSize(128, 128);
      left_leg_2.mirror = true;
      setRotation(left_leg_2, 0F, 0F, 0.0523599F);
      left_boot_1 = new ModelRenderer(this, 7, 100);
      left_boot_1.addBox(-2.5F, 0.5F, 0F, 4, 12, 3);
      left_boot_1.setRotationPoint(0F, 10.7F, -0.5F);
      left_boot_1.setTextureSize(128, 128);
      left_boot_1.mirror = true;
      setRotation(left_boot_1, 0.0785398F, 0F, -0.0785398F);
      left_boot_2 = new ModelRenderer(this, 22, 98);
      left_boot_2.addBox(-2.5F, 0.5F, 0F, 4, 12, 3);
      left_boot_2.setRotationPoint(0F, 10.7F, -0.5F);
      left_boot_2.setTextureSize(128, 128);
      left_boot_2.mirror = true;
      setRotation(left_boot_2, -0.0785398F, 0F, 0.0785398F);
      left_boot_3 = new ModelRenderer(this, 37, 98);
      left_boot_3.addBox(-2.5F, 0.5F, 0F, 4, 12, 3);
      left_boot_3.setRotationPoint(0F, 10.7F, -0.5F);
      left_boot_3.setTextureSize(128, 128);
      left_boot_3.mirror = true;
      setRotation(left_boot_3, 0.0785398F, 0F, 0.0785398F);
      left_boot_4 = new ModelRenderer(this, 52, 98);
      left_boot_4.addBox(-2.5F, 0.5F, 0F, 4, 12, 3);
      left_boot_4.setRotationPoint(0F, 10.7F, -0.5F);
      left_boot_4.setTextureSize(128, 128);
      left_boot_4.mirror = true;
      setRotation(left_boot_4, -0.0785398F, 0F, -0.0785398F);
      left_boot_end = new ModelRenderer(this, 65, 114);
      left_boot_end.addBox(0F, 0F, 0F, 6, 2, 5);
      left_boot_end.setRotationPoint(-3.5F, 22F, -1.5F);
      left_boot_end.setTextureSize(128, 128);
      left_boot_end.mirror = true;
      setRotation(left_boot_end, 0F, 0F, 0F);
      left_foot_1 = new ModelRenderer(this, 72, 122);
      left_foot_1.addBox(0F, 0F, 0F, 4, 2, 3);
      left_foot_1.setRotationPoint(-2.5F, 22F, -4F);
      left_foot_1.setTextureSize(128, 128);
      left_foot_1.mirror = true;
      setRotation(left_foot_1, 0F, 0F, 0F);
      left_foot_2 = new ModelRenderer(this, 72, 122);
      left_foot_2.addBox(0F, 0F, 0F, 4, 2, 3);
      left_foot_2.setRotationPoint(-2.5F, 22F, -4F);
      left_foot_2.setTextureSize(128, 128);
      left_foot_2.mirror = true;
      setRotation(left_foot_2, 0.418879F, 0F, 0F);
      armpit_1 = new ModelRenderer(this, 14, 12);
      armpit_1.addBox(0F, 0F, 0F, 1, 1, 2);
      armpit_1.setRotationPoint(4.7F, -5F, 0F);
      armpit_1.setTextureSize(128, 128);
      armpit_1.mirror = true;
      setRotation(armpit_1, 0F, 0F, -0.2094395F);
      armpit_2 = new ModelRenderer(this, 14, 12);
      armpit_2.addBox(0F, 0F, 0F, 1, 1, 2);
      armpit_2.setRotationPoint(-0.7F, -5.2F, 0F);
      armpit_2.setTextureSize(128, 128);
      armpit_2.mirror = true;
      setRotation(armpit_2, 0F, 0F, 0.2094395F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    hair_1.render(f5);
    hair_2.render(f5);
    hair_3.render(f5);
    hair_4.render(f5);
    hair_5.render(f5);
    hair_6.render(f5);
    hair_7.render(f5);
    hair_8.render(f5);
    hair_9.render(f5);
    hair_10.render(f5);
    hair_11.render(f5);
    hair_12.render(f5);
    hair_13.render(f5);
    hair_14.render(f5);
    hair_15.render(f5);
    head.render(f5);
    neck.render(f5);
    shoulder_pad.render(f5);
    chest.render(f5);
    right_arm_top.render(f5);
    right_arm_1.render(f5);
    right_arm_2.render(f5);
    right_arm_3.render(f5);
    right_arm_4.render(f5);
    right_arm_5.render(f5);
    right_index_finger.render(f5);
    right_middle_finger.render(f5);
    right_ring_finger.render(f5);
    right_pinky_finger.render(f5);
    right_thumb.render(f5);
    left_arm_top.render(f5);
    left_arm_1.render(f5);
    left_arm_2.render(f5);
    left_arm_3.render(f5);
    left_arm_4.render(f5);
    left_arm_5.render(f5);
    left_index_finger.render(f5);
    left_middle_finger.render(f5);
    left_ring_finger.render(f5);
    left_pinky.render(f5);
    left_thumb.render(f5);
    waist_1.render(f5);
    waist_2.render(f5);
    waist_3.render(f5);
    hips.render(f5);
    right_leg_1.render(f5);
    right_leg_2.render(f5);
    right_boot_1.render(f5);
    right_boot_2.render(f5);
    right_boot_3.render(f5);
    right_boot_4.render(f5);
    right_boot_end.render(f5);
    right_foot_1.render(f5);
    right_foot_2.render(f5);
    left_leg_1.render(f5);
    left_leg_2.render(f5);
    left_boot_1.render(f5);
    left_boot_2.render(f5);
    left_boot_3.render(f5);
    left_boot_4.render(f5);
    left_boot_end.render(f5);
    left_foot_1.render(f5);
    left_foot_2.render(f5);
    armpit_1.render(f5);
    armpit_2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
