package fr.poslovitch.modbuilder.blocks;

import fr.poslovitch.modbuilder.versioning.VersionManager;
import net.minecraft.block.Block;

public class BlockBuilder {

    private String name;

    public BlockBuilder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void register() {
        VersionManager.getHandler().registerBlock(this);
    }
}
