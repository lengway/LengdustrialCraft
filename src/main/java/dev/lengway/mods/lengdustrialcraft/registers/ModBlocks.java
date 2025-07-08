package dev.lengway.mods.lengdustrialcraft.registers;

import dev.lengway.mods.lengdustrialcraft.Lengdustrialcraft;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Lengdustrialcraft.MODID);

    public static final RegistryObject<Block> lengdustrial_block = BLOCKS.register("lengdustrial_block",
            () -> new Block(Block.Properties.of().strength(5.0f)));

    public static final RegistryObject<Block> tin_ore = BLOCKS.register("tin_ore",
            () -> new DropExperienceBlock(Block.Properties.copy(Blocks.IRON_ORE)
                    .requiresCorrectToolForDrops()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
