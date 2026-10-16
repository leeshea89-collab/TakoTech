package moe.takochan.takotech.common.storage;

import appeng.api.storage.ICellInventory;
import appeng.api.storage.data.IAEItemStack;

public interface ITakoCellInventory extends ICellInventory<IAEItemStack> {

    String getDiskID();
}
