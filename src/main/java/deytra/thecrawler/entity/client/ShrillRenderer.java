package deytra.thecrawler.entity.client;

import deytra.thecrawler.TheCrawler;
import deytra.thecrawler.entity.custom.ShrillEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ShrillRenderer extends GeoEntityRenderer<ShrillEntity> {

	public ShrillRenderer(EntityRendererFactory.Context ctx) {
		super(ctx, new ShrillModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public Identifier getTextureResource(ShrillEntity instance) {
		return new Identifier(TheCrawler.MOD_ID, "textures/entity/shrill_texture.png");
	}

}
