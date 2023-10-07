package deytra.thecrawler.entity;

import deytra.thecrawler.TheCrawler;
import deytra.thecrawler.entity.custom.CrawlerEntity;
import deytra.thecrawler.entity.custom.RoofEntity;
import deytra.thecrawler.entity.custom.RoofStalkerEntity;
import deytra.thecrawler.entity.custom.RoofsEntity;
import deytra.thecrawler.entity.custom.ShrillEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.mixin.object.builder.SpawnRestrictionAccessor;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction.Location;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Heightmap;

public class ModEntities {

	public static final EntityType<CrawlerEntity> CRAWLER = Registry.register(Registry.ENTITY_TYPE, new Identifier(TheCrawler.MOD_ID, "thecrawler"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, CrawlerEntity::new).dimensions(EntityDimensions.fixed(1.0f, 1f)).build());
	public static final EntityType<ShrillEntity> SHRILL = Registry.register(Registry.ENTITY_TYPE, new Identifier(TheCrawler.MOD_ID, "shrill"),
			FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ShrillEntity::new).dimensions(EntityDimensions.fixed(1f, 1f)).build());
	public static final EntityType<RoofEntity> ROOF = Registry.register(Registry.ENTITY_TYPE, new Identifier(TheCrawler.MOD_ID, "roof"),
			FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, RoofEntity::new).dimensions(EntityDimensions.fixed(2f, 3f)).build());
	public static final EntityType<RoofsEntity> ROOFS = Registry.register(Registry.ENTITY_TYPE, new Identifier(TheCrawler.MOD_ID, "roofs"),
			FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, RoofsEntity::new).dimensions(EntityDimensions.fixed(2f, 3f)).build());
	public static final EntityType<RoofStalkerEntity> ROOFSTALKER = Registry.register(Registry.ENTITY_TYPE, new Identifier(TheCrawler.MOD_ID, "roofstalker"),
			FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, RoofStalkerEntity::new).dimensions(EntityDimensions.fixed(2f, 3f)).build());
	static {
		SpawnRestrictionAccessor.callRegister(CRAWLER, Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canSpawnInDark);
		SpawnRestrictionAccessor.callRegister(SHRILL, Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);
	}

}
