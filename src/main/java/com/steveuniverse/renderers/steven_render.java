package com.steveuniverse.renderers;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class steven_render extends RenderLiving{

	public steven_render(ModelBase parModelBase, float parShadowSize) {
		super(parModelBase, parShadowSize);
	}


	public static final ResourceLocation textureLocation = new ResourceLocation("steveuniverse:textures/entity/steven.png");

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return textureLocation;
	}

}