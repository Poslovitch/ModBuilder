package fr.poslovitch.modbuilder.versioning.v1_11_2;

import fr.poslovitch.modbuilder.blocks.BlockBuilder;
import fr.poslovitch.modbuilder.versioning.VersionAbstraction;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VersionHandler extends VersionAbstraction {

    @Override
    public void registerItem() {

    }

    @Override
    public void registerBlock(BlockBuilder builder) {
        Block block = new Block(Material.ROCK);
        GameRegistry.registerBlock(block, new ItemBlock(block), builder.getName());
    }

}
