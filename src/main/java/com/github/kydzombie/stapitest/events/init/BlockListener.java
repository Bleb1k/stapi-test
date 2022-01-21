package com.github.kydzombie.stapitest.events.init;

import com.github.kydzombie.stapitest.block.cable.Cable;
import com.github.kydzombie.stapitest.block.cable.PowerCable;
import com.github.kydzombie.stapitest.block.machine.ElectricFurnace;
import com.github.kydzombie.stapitest.block.machine.Generator;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.BlockBase;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.registry.ModID;
import net.modificationstation.stationapi.api.util.Null;

public class BlockListener {

    public static BlockBase cable;
    public static BlockBase powerCable;
    public static BlockBase electricFurnace;
    public static BlockBase generator;

    @Entrypoint.ModID
    public static final ModID MOD_ID = Null.get();

    @EventListener
    public void registerBlocks(BlockRegistryEvent event) {
        cable = new Cable(Identifier.of(MOD_ID, "cable")); // .setTranslationKey(MOD_ID, "cable")
        powerCable = new PowerCable(Identifier.of(MOD_ID, "powerCable")); // .setTranslationKey(MOD_ID, "power_cable")
        electricFurnace = new ElectricFurnace(Identifier.of(MOD_ID, "electricFurnace")).setTranslationKey(MOD_ID, "electricFurnace");
        generator = new Generator(Identifier.of(MOD_ID, "generator")).setTranslationKey(MOD_ID, "generator");
    }
}
