package deytra.thecrawler.entity.client;

import deytra.thecrawler.TheCrawler;
import deytra.thecrawler.entity.custom.RoofsEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RoofsModel extends AnimatedGeoModel<RoofsEntity> {

	@Override
	public Identifier getModelResource(RoofsEntity object) {
		return new Identifier(TheCrawler.MOD_ID, "geo/roofs.geo.json");
	}

	@Override
	public Identifier getTextureResource(RoofsEntity object) {
		return new Identifier(TheCrawler.MOD_ID, "textures/entity/roofs_texture.png");
	}

	@Override
	public Identifier getAnimationResource(RoofsEntity animatable) {
		return new Identifier(TheCrawler.MOD_ID, "animations/roofs.animation.json");
	}

}
