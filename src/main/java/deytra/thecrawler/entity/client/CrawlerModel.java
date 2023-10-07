package deytra.thecrawler.entity.client;

import deytra.thecrawler.TheCrawler;
import deytra.thecrawler.entity.custom.CrawlerEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CrawlerModel extends AnimatedGeoModel<CrawlerEntity> {

	@Override
	public Identifier getModelResource(CrawlerEntity object) {
		return new Identifier(TheCrawler.MOD_ID, "geo/crawler.geo.json");
	}

	@Override
	public Identifier getTextureResource(CrawlerEntity object) {
		return new Identifier(TheCrawler.MOD_ID, "textures/entity/crawler_texture.png");
	}

	@Override
	public Identifier getAnimationResource(CrawlerEntity animatable) {
		return new Identifier(TheCrawler.MOD_ID, "animations/crawler.animation.json");
	}

}
