package fr.poslovitch.modbuilder.versioning;

import fr.poslovitch.modbuilder.blocks.BlockBuilder;

public abstract class VersionAbstraction {

    public abstract void registerItem();

    public abstract void registerBlock(BlockBuilder builder);
}
