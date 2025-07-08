package dev.lengway.mods.lengdustrialcraft.registers;

import dev.lengway.mods.lengdustrialcraft.Lengdustrialcraft;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Lengdustrialcraft.MODID);

    // lengdustrialcraft:imbalanced_sword
    public static final RegistryObject<Item> imbalanced_sword = ITEMS.register("imbalanced_sword",
            () -> new SwordItem(Tiers.NETHERITE, 10, -2.4f, new Item.Properties()));

    // lengdustrialcraft:lengdustrial_block
    public static final RegistryObject<Item> lengdustrial_block_item = ITEMS.register("lengdustrial_block",
            () -> new BlockItem(ModBlocks.lengdustrial_block.get(), new Item.Properties()));

    // lengdustrialcraft:tin_ore
    public static final RegistryObject<Item> tin_ore = ITEMS.register("tin_ore",
            () -> new BlockItem(ModBlocks.tin_ore.get(), new Item.Properties()));

    // lengdustrialcraft:raw_tin
    public static final RegistryObject<Item> raw_tin = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));

    // lengdustrialcraft:tin_ingot
    public static final RegistryObject<Item> tin_ingot = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
