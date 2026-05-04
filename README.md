SlopCraft
===

## About

SlopCraft is a GregTech-compatible fork of GT5-Unofficial. The first goal is to preserve GTNH save/mod compatibility
while building a cleaner, faster, better-tested technology core.

The compatibility bootstrap intentionally keeps the internal `gregtech` mod id and Java package names. Changing those
too early would break existing worlds, addons, recipes, configs, NEI handlers, and inter-mod integration. Human-facing
branding can move first; registry and package separation must happen behind migration tooling.

## Current Status

This branch is not yet a standalone release. It starts from GT5-Unofficial, carries an initial bugfix stack, and adds a
SlopCraft roadmap under `docs/slopcraft/`.

## Downloads

No public SlopCraft builds are published yet.

## Installation

GT5U requires IndustrialCraft2-experimental. Version 2:2.2.828-experimental is recommended.
Forge versions 1428-1480 are known to break multiplayer. 1614 is recommended.
Place the downloaded jar file into your mods/ folder. A number of other mods may be required, see dependencies.gradle

## Issues

Track SlopCraft-specific issues in the SlopCraft fork once the public repository is created. For upstream GTNH issues,
include the exact pack version and reproduction steps.

## Contribution

Please do! However, please take a note of
[current issues](https://github.com/GTNewHorizons/GT-New-Horizons-Modpack/issues) and what is currently being worked on.

You don't need to clone the repository with full history to contribute, to save disk space and bandwidth you can clone:
```bash
git clone --depth 3 https://github.com/GTNewHorizons/GT5-Unofficial.git GT5-Unofficial
```
This way you'll get the last 3 commits of history in your local checkout, instead of all of it.

It is suggested to run `./gradlew build` inside your cloned repository before importing it to your IDE. This will reduce
the chance of strange errors.

## Attribution

SlopCraft is based on GT5-Unofficial, which is itself a decompiled and modified version of GT5.07.07. This fork keeps
the original LGPL license and attribution.

Some textures/ideas have been taken from future versions of GT and texture pack authors for GTNH. Credit goes to Jimbno for the UU-Tex texture pack and its contributions to the base pack here: https://github.com/Jimbno/UU-Tex.
Many sound effects were backported from the GregTech Community Edition Unofficial / Modern team: https://github.com/GregTechCEu/

## Music duration metadata

The electric jukebox requires duration metadata to specify how many milliseconds each disk plays for.
These can be included in mods' jar resources under `soundmeta/durations.json`, or in the pack config directory at `config/soundmeta/durations.json`.
The format is a simple key-value map of sound IDs mapping to millisecond counts, and can be generated from the client automatically using `/gt dump_music_durations`.

```json
{
  "soundDurationsMs": {
    "minecraft:11": 71112,
    "minecraft:13": 178086,
    "minecraft:blocks": 345914
  }
}
```

## License

SlopCraft is free software based on GT5-Unofficial: you can redistribute it and/or modify it under the terms of the
GNU Lesser General Public License as published by the Free Software Foundation, either version 3
of the License, or (at your option) any later version.

SlopCraft is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
See the GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License along with GT5-Unofficial.
If not, see <http://www.gnu.org/licenses/>.
