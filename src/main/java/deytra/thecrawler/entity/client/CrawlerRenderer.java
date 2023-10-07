package deytra.thecrawler.entity.client;

import deytra.thecrawler.TheCrawler;
import deytra.thecrawler.entity.custom.CrawlerEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class CrawlerRenderer extends GeoEntityRenderer<CrawlerEntity> {

	public CrawlerRenderer(EntityRendererFactory.Context ctx) {
		super(ctx, new CrawlerModel());
		this.shadowRadius = 1.0f;
	}

	@Override
	public Identifier getTextureResource(CrawlerEntity instance) {
		return new Identifier(TheCrawler.MOD_ID, "textures/entity/crawler_texture.png");
	}

}
