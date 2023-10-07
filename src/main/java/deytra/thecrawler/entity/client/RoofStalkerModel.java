package deytra.thecrawler.entity.client;

import deytra.thecrawler.TheCrawler;
import deytra.thecrawler.entity.custom.RoofStalkerEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RoofStalkerModel extends AnimatedGeoModel<RoofStalkerEntity> {

	@Override
	public Identifier getModelResource(RoofStalkerEntity object) {
		return new Identifier(TheCrawler.MOD_ID, "geo/roofstalker.geo.json");
	}

	@Override
	public Identifier getTextureResource(RoofStalkerEntity object) {
		return new Identifier(TheCrawler.MOD_ID, "textures/entity/roofstalker_texture.png");
	}

	@Override
	public Identifier getAnimationResource(RoofStalkerEntity animatable) {
		return new Identifier(TheCrawler.MOD_ID, "animations/roofstalker.animation.json");
	}

}
