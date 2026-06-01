package item;

import com.example.TemplateMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup BADGE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TemplateMod.MOD_ID, "badge"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.badge"))
                    .icon(() -> new ItemStack(ModItems.BADGE))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BADGE);
                    })
                    .build());

    public static void registerItemGroups() {
        TemplateMod.LOGGER.info("Registering Item Groups for " + TemplateMod.MOD_ID);
    }
}