package moe.takochan.takotech.common.storage;

import appeng.api.storage.ICellInventoryHandler;
import appeng.api.storage.data.IAEItemStack;

public interface ITakoCellInventoryHandler extends ICellInventoryHandler<IAEItemStack> {

    @Override
    ITakoCellInventory getCellInv();
}
