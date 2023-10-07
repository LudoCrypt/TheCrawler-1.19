package deytra.thecrawler;

import java.util.logging.Logger;

import deytra.thecrawler.entity.ModEntities;
import deytra.thecrawler.entity.custom.CrawlerEntity;
import deytra.thecrawler.entity.custom.RoofEntity;
import deytra.thecrawler.entity.custom.RoofStalkerEntity;
import deytra.thecrawler.entity.custom.RoofsEntity;
import deytra.thecrawler.entity.custom.ShrillEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import software.bernie.geckolib3.GeckoLib;

public class TheCrawler implements ModInitializer {

	public static final String MOD_ID = "thecrawler";
	public static final Logger LOGGER = Logger.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		GeckoLib.initialize();
		FabricDefaultAttributeRegistry.register(ModEntities.CRAWLER, CrawlerEntity.setAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.SHRILL, ShrillEntity.setAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.ROOF, RoofEntity.setAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.ROOFS, RoofsEntity.setAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.ROOFSTALKER, RoofStalkerEntity.setAttributes());
	}

}
