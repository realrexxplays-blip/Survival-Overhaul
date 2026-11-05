# Survival Overhaul

**Minecraft Java 1.21.1 · Fabric + NeoForge · Java 21**

Survival Overhaul is planned around three connected systems:

- **Structural Integrity** — support checks, stress, cracking, and safe collapse.
- **Ecology** — soil nutrients, crop rotation, composting, mob population pressure, and invasive spread.
- **Living Atlas** — player-made surveys, waypoints, hazards, and notes.

## Build downloads

The GitHub Actions workflows build separate loader-specific JARs:
- **Actions → Build Fabric → Run workflow**
- **Actions → Build NeoForge → Run workflow**

When a run finishes, open it and download its artifact. Fabric and NeoForge JARs are not interchangeable.

## Build locally
Install a Java 21 JDK and Gradle 8.10.2 or newer.

```bash
cd fabric
gradle build
```

```bash
cd neoforge
gradle build
```

Output JARs are in each project's `build/libs/` folder.

## Current development status

This repository is the initial buildable framework. It currently includes loader entrypoints and shared data models, **not the complete gameplay implementation**. Structural world scanning/collapse, live ecology hooks, atlas persistence, survey tools, and the atlas screen still need to be implemented and tested before a public CurseForge release.

## Project information
- Mod ID: `survival_overhaul`
- Package: `com.realrexxplayz.survivaloverhaul`
- Version: `0.1.0` (development)
- Minecraft: `1.21.1`
- Java: `21`
