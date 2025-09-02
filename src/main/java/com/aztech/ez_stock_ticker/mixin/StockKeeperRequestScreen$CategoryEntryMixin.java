package com.aztech.ez_stock_ticker.mixin;

import com.aztech.ez_stock_ticker.accessor.StockKeeperRequestScreen$CategoryEntryAccess;
import com.simibubi.create.content.logistics.AddressEditBox;
import com.simibubi.create.content.logistics.BigItemStack;
import com.simibubi.create.content.logistics.stockTicker.StockKeeperLockPacket;
import com.simibubi.create.content.logistics.stockTicker.StockKeeperRequestMenu;
import com.simibubi.create.content.logistics.stockTicker.StockKeeperRequestScreen;
import com.simibubi.create.content.logistics.stockTicker.StockTickerBlockEntity;
import com.simibubi.create.foundation.gui.ScreenWithStencils;
import com.simibubi.create.foundation.gui.menu.AbstractSimiContainerScreen;
import net.createmod.catnip.animation.LerpedFloat;
import net.createmod.catnip.data.Couple;
import net.createmod.catnip.platform.CatnipServices;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Inventory;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

import static com.ibm.icu.impl.ValidIdentifiers.Datatype.x;

@Mixin(value = StockKeeperRequestScreen.CategoryEntry.class, remap = false)
public abstract class StockKeeperRequestScreen$CategoryEntryMixin implements StockKeeperRequestScreen$CategoryEntryAccess {

    @Shadow private int y;

    @Shadow private int targetBECategory;

    @Shadow private boolean hidden;

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getTargetBECategory() {
        return targetBECategory;
    }

    @Override
    public boolean isHidden() {
        return hidden;
    }
}
