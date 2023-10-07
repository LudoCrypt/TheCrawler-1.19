package deytra.thecrawler.entity.client;

import deytra.thecrawler.TheCrawler;
import deytra.thecrawler.entity.custom.ShrillEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ShrillModel extends AnimatedGeoModel<ShrillEntity> {

	@Override
	public Identifier getModelResource(ShrillEntity object) {
		return new Identifier(TheCrawler.MOD_ID, "geo/shrill.geo.json");
	}

	@Override
	public Identifier getTextureResource(ShrillEntity object) {
		return new Identifier(TheCrawler.MOD_ID, "textures/entity/shrill_texture.png");
	}

	@Override
	public Identifier getAnimationResource(ShrillEntity animatable) {
		return new Identifier(TheCrawler.MOD_ID, "animations/shrill.animation.json");
	}

}
