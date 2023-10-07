package deytra.thecrawler.entity.client;

import deytra.thecrawler.entity.custom.RoofStalkerEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RoofStalkerRenderer extends GeoEntityRenderer<RoofStalkerEntity> {

	public RoofStalkerRenderer(EntityRendererFactory.Context ctx) {
		super(ctx, new RoofStalkerModel());
		this.shadowRadius = 1f;
	}

	@Override
	public RenderLayer getRenderType(RoofStalkerEntity animatable, float partialTicks, MatrixStack stack, VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
			Identifier textureLocation) {
		stack.scale(0.5f, 0.5f, 0.5f);
		return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
	}

}
