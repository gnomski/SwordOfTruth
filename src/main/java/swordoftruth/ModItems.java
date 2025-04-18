package swordoftruth;

import net.minecraft.world.item.*;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;
import net.minecraft.world.item.CreativeModeTabs;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SwordOfTruthMod.MODID);

    public static final RegistryObject<Item> SWORD_OF_TRUTH = ITEMS.register("sword_of_truth", () ->
            new SwordItem(new Tier() {
                @Override public int getUses() { return 9999; }
                @Override public float getSpeed() { return 10.0f; }
                @Override public float getAttackDamageBonus() { return 999.0f; }
                @Override public int getLevel() { return 5; }
                @Override public int getEnchantmentValue() { return 100; }
                @Override public Ingredient getRepairIngredient() {
                    return Ingredient.of(Items.NETHERITE_INGOT);
                }
            }, 3, -2.4f, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
