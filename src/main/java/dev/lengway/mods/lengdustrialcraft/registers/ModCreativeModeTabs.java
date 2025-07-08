package dev.lengway.mods.lengdustrialcraft.registers;

import dev.lengway.mods.lengdustrialcraft.Lengdustrialcraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Lengdustrialcraft.MODID);

    public static final RegistryObject<CreativeModeTab> lengdustrial_tab =
            TABS.register("lengdustrial_tab",
                    () -> CreativeModeTab.builder()
                            .withTabsBefore(CreativeModeTabs.COMBAT)
                            .icon(() -> ModItems.lengdustrial_block_item.get().getDefaultInstance())
                            .displayItems((parameters, output) -> {
                                    output.accept(ModItems.imbalanced_sword.get());
                                    output.accept(ModItems.lengdustrial_block_item.get());
                            })
                            .build());

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
