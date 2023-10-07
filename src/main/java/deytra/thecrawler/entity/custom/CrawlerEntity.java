package deytra.thecrawler.entity.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class CrawlerEntity extends HostileEntity implements IAnimatable {

	private AnimationFactory factory = new AnimationFactory(this);

	public CrawlerEntity(EntityType<? extends HostileEntity> entityType, World world) {
		super(entityType, world);
	}

	public static DefaultAttributeContainer.Builder setAttributes() {
		return HostileEntity.createMobAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 40.0D).add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 3.0f).add(EntityAttributes.GENERIC_ATTACK_SPEED, 2.0f)
				.add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.4f);
	}

	@Override
	protected void initGoals() {
		this.goalSelector.add(1, new MeleeAttackGoal(this, 0.5D, false));
		this.goalSelector.add(2, new WanderAroundFarGoal(this, 0.5f, 1));
		this.goalSelector.add(3, new LookAroundGoal(this));
		this.targetSelector.add(1, new ActiveTargetGoal<>(this, PlayerEntity.class, true));
	}

	private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {

		if (event.isMoving()) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.crawler.walk", true));
			return PlayState.CONTINUE;
		}

		event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.crawler.idle", true));
		return PlayState.CONTINUE;
	}

	@Override
	public void registerControllers(AnimationData animationData) {
		animationData.addAnimationController(new AnimationController<CrawlerEntity>(this, "controller", 0, this::predicate));
	}

	@Override
	public AnimationFactory getFactory() {
		return factory;
	}

	@Override
	protected void playStepSound(BlockPos pos, BlockState state) {
		this.playSound(SoundEvents.ENTITY_PIG_STEP, 0.15f, -0.5f);
	}

	@Override
	public void tickMovement() {

		if (this.isAlive()) {
			boolean bl = this.burnsInDaylight() && this.isAffectedByDaylight();

			if (bl) {
				ItemStack itemStack = this.getEquippedStack(EquipmentSlot.HEAD);

				if (!itemStack.isEmpty()) {

					if (itemStack.isDamageable()) {
						itemStack.setDamage(itemStack.getDamage() + this.random.nextInt(2));

						if (itemStack.getDamage() >= itemStack.getMaxDamage()) {
							this.sendEquipmentBreakStatus(EquipmentSlot.HEAD);
							this.equipStack(EquipmentSlot.HEAD, ItemStack.EMPTY);
						}

					}

					bl = false;
				}

				if (bl) {
					this.setOnFireFor(8);
				}

			}

		}

		super.tickMovement();
	}

	protected boolean burnsInDaylight() {
		return true;
	}

}
