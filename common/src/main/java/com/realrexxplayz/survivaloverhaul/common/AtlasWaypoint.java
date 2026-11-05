package com.realrexxplayz.survivaloverhaul.common;

import java.util.UUID;

/** Loader-independent waypoint data model. */
public record AtlasWaypoint(
        UUID id,
        String name,
        String dimension,
        int x,
        int y,
        int z,
        String note,
        String category
) {
    public AtlasWaypoint {
        if (id == null) id = UUID.randomUUID();
        name = name == null ? "Waypoint" : name;
        dimension = dimension == null ? "minecraft:overworld" : dimension;
        note = note == null ? "" : note;
        category = category == null ? "general" : category;
    }
}
