package deytra.thecrawler.entity.client;

import deytra.thecrawler.entity.custom.RoofsEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RoofsRenderer extends GeoEntityRenderer<RoofsEntity> {

	public RoofsRenderer(EntityRendererFactory.Context ctx) {
		super(ctx, new RoofsModel());
		this.shadowRadius = 1f;
	}

	@Override
	public RenderLayer getRenderType(RoofsEntity animatable, float partialTicks, MatrixStack stack, VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
			Identifier textureLocation) {
		stack.scale(0.5f, 0.5f, 0.5f);
		return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
	}

}
