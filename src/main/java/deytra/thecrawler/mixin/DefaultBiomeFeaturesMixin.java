package deytra.thecrawler.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import deytra.thecrawler.entity.ModEntities;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

@Mixin(DefaultBiomeFeatures.class)
public class DefaultBiomeFeaturesMixin {

	@Inject(method = "Lnet/minecraft/world/gen/feature/DefaultBiomeFeatures;addMonsters(Lnet/minecraft/world/biome/SpawnSettings$Builder;IIIZ)V", at = @At("HEAD"))
	private static void theCrawler$addMonsters(SpawnSettings.Builder builder, int zombieWeight, int zombieVillagerWeight, int skeletonWeight, boolean drowned, CallbackInfo ci) {
		builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(ModEntities.CRAWLER, 3, 1, 1));
	}

	@Inject(method = "Lnet/minecraft/world/gen/feature/DefaultBiomeFeatures;addFarmAnimals(Lnet/minecraft/world/biome/SpawnSettings$Builder;)V", at = @At("HEAD"))
	private static void theCrawler$addFarmAnimals(SpawnSettings.Builder builder, CallbackInfo ci) {
		builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(ModEntities.SHRILL, 20, 1, 1));
	}

}
