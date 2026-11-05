package com.realrexxplayz.survivaloverhaul.common;

/** Data result for a structural scan performed by a loader adapter. */
public record StructuralCheck(StructuralStatus status, int checkedBlocks, String detail) {
    public StructuralCheck {
        if (status == null) status = StructuralStatus.UNKNOWN_UNLOADED;
        if (checkedBlocks < 0) checkedBlocks = 0;
        if (detail == null) detail = "";
    }
}
