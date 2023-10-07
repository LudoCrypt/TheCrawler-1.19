package deytra.thecrawler.entity.client;

import deytra.thecrawler.TheCrawler;
import deytra.thecrawler.entity.custom.RoofEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RoofModel extends AnimatedGeoModel<RoofEntity> {

	@Override
	public Identifier getModelResource(RoofEntity object) {
		return new Identifier(TheCrawler.MOD_ID, "geo/roof.geo.json");
	}

	@Override
	public Identifier getTextureResource(RoofEntity object) {
		return new Identifier(TheCrawler.MOD_ID, "textures/entity/roof_texture.png");
	}

	@Override
	public Identifier getAnimationResource(RoofEntity animatable) {
		return new Identifier(TheCrawler.MOD_ID, "animations/roof.animation.json");
	}

}
