package deytra.thecrawler.client;

import deytra.thecrawler.entity.ModEntities;
import deytra.thecrawler.entity.client.CrawlerRenderer;
import deytra.thecrawler.entity.client.RoofRenderer;
import deytra.thecrawler.entity.client.RoofStalkerRenderer;
import deytra.thecrawler.entity.client.RoofsRenderer;
import deytra.thecrawler.entity.client.ShrillRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class TheCrawlerClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		EntityRendererRegistry.register(ModEntities.CRAWLER, CrawlerRenderer::new);
		EntityRendererRegistry.register(ModEntities.SHRILL, ShrillRenderer::new);
		EntityRendererRegistry.register(ModEntities.ROOF, RoofRenderer::new);
		EntityRendererRegistry.register(ModEntities.ROOFS, RoofsRenderer::new);
		EntityRendererRegistry.register(ModEntities.ROOFSTALKER, RoofStalkerRenderer::new);
	}

}
