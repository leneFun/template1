package block;

import com.example.TemplateMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block BADGE_BLOCK = registerBlock("badge_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RAW_BADGE_BLOCK = registerBlock("raw_badge_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BADGE_PRO_BLOCK = registerBlock("badge_pro_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BADGE_ORE = registerBlock("badge_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2.5f), UniformIntProvider.create(2,5)));
    public static final Block DEEPSLATE_BADGE_BLOCK = registerBlock("deepslate_badge_block", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(3f), UniformIntProvider.create(2,3)));


    private static Block registerBlock(String name,Block block){

        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK , new Identifier(TemplateMod.MOD_ID, name),
                block);
    }



    private static Item registerBlockItem(String name, Block block){

    return Registry.register(Registries.ITEM , new Identifier(TemplateMod.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));

    };

    public static void registerModBlocks(){

        TemplateMod.LOGGER.info("Registering ModBlocks for " + TemplateMod.MOD_ID);

    }
}


