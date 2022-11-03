
package com.inkombizz.common.enums;

public class EnumInventoryType {
    public enum ENUM_InventoryType {
        FIFO,
        AVERAGE,
        INVENTORY,
        LIFO
    }
        
    public static String toString(ENUM_InventoryType inventoryType)
    {
        String rValue = "FIFO";

        if (inventoryType == ENUM_InventoryType.AVERAGE)
        {
            rValue = "AVERAGE";
        }

        else if (inventoryType == ENUM_InventoryType.LIFO)
        {
            rValue = "LIFO";
        }
        
        else if (inventoryType == ENUM_InventoryType.INVENTORY)
        {
            rValue = "INVENTORY";
        }

        return rValue;
    }

}
