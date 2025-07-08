package dev.lengway.mods.lengdustrialcraft.registers;

import dev.lengway.mods.lengdustrialcraft.Lengdustrialcraft;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Lengdustrialcraft.MODID);

    public static final RegistryObject<Item> imbalanced_sword = ITEMS.register("imbalanced_sword",
            () -> new SwordItem(Tiers.NETHERITE, 10, -2.4f, new Item.Properties()));

    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
    public static final RegistryObject<Item> lengdustrial_block_item = ITEMS.register("lengdustrial_block",
            () -> new BlockItem(ModBlocks.lengdustrial_block.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
