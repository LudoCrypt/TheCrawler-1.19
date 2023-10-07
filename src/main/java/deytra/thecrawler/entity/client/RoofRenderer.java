package deytra.thecrawler.entity.client;

import deytra.thecrawler.TheCrawler;
import deytra.thecrawler.entity.custom.RoofEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RoofRenderer extends GeoEntityRenderer<RoofEntity> {

	public RoofRenderer(EntityRendererFactory.Context ctx) {
		super(ctx, new RoofModel());
		this.shadowRadius = 1f;
	}

	@Override
	public Identifier getTextureResource(RoofEntity instance) {
		return new Identifier(TheCrawler.MOD_ID, "textures/entity/roof_texture.png");
	}

	@Override
	public RenderLayer getRenderType(RoofEntity animatable, float partialTicks, MatrixStack stack, VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
			Identifier textureLocation) {
		stack.scale(0.5f, 0.5f, 0.5f);
		return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
	}

}
