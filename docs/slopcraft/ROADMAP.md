# SlopCraft Roadmap

SlopCraft is a downstream fork of GT5-Unofficial. The ambition is high, but the engineering rule is simple: every claim
must become a measurable gate.

## Non-Negotiables

- Preserve LGPL-3.0-or-later licensing and original attribution.
- Keep `gregtech` mod id compatibility until a tested migration bridge exists.
- Prefer small patch stacks over giant rewrites.
- No release ships with known critical dupes, world corruption, startup crashes, or save migration breakage.
- Every new content line needs profiling, recipe validation, and rollback notes.

## Fork Strategy

1. `upstream/gtnh`: follows GT5-Unofficial master.
2. `slopcraft/bootstrap`: GT5-Unofficial plus the first bugfix stack and SlopCraft branding.
3. `slopcraft/main`: stable SlopCraft development after bootstrap.
4. `slopcraft/experimental/*`: large content or performance work behind config gates.

## Two-Track Strategy

SlopCraft has two connected tracks:

- Compatibility Track: keep GTNH/GT5-style worlds alive, fix bugs, improve performance, and preserve `gregtech` mod id
  compatibility until migration tooling exists.
- Foundry Track: design a ground-up SlopCraft tech game from first principles. Foundry is allowed to be incompatible,
  but only after it proves it can beat the old loop on clarity, performance, stability, and automation depth.

See:

- `docs/slopcraft/GROUND_UP_DESIGN.md`
- `docs/slopcraft/VERTICAL_SLICE_0.md`

## Compatibility Strategy

Phase 0 keeps these identifiers stable:

- Forge mod id: `gregtech`
- Core Java package: `gregtech`
- Existing item/block registry names
- Existing config paths unless a migration copies old values

Phase 1 can add:

- Human-facing SlopCraft mod names
- SlopCraft documentation and issue templates
- A new `slopcraft` API namespace for new systems
- Runtime banners that say the fork is GregTech-compatible, not upstream GregTech

Phase 2 needs tooling before it is allowed:

- Registry aliasing and missing-mapping migration
- Config migration
- Save fixture tests
- Addon compatibility shims
- World backup warnings

## Quality Gates

The first real quality target is not "no bugs"; it is "no untracked bugs in release candidates." Required gates:

- `compileJava` and full build in CI
- Spotless/checkstyle gate
- Recipe map validation at startup
- Material/property sanity checks
- Save-load smoke tests with fixture worlds
- Automation edge-case tests for item/fluid I/O
- Crash triage labels with owner and reproduction status
- Performance baselines for startup, recipe registration, NEI load, and common ticking machines

## Performance Direction

- Kill repeated full-map scans in tick paths.
- Cache derived material and recipe metadata after registration.
- Make NEI and tooltip generation lazy where possible.
- Add counters around high-risk systems before rewriting them.
- Prefer data validation over defensive runtime work in hot loops.

## Content Direction

More content is only better if it reduces dead ends and creates good choices. SlopCraft content should:

- Add missing progression bridges before adding more endgame walls.
- Keep automation discoverable.
- Avoid one-off machines when a shared behavior can be data-driven.
- Make multiblocks easier to validate, preview, and debug.
- Add absurd scale only when the UI and performance can carry it.

## Bootstrap Bugfix Stack

The current bootstrap includes these GT5 fixes:

- PCB cooling tower tooltip count correction.
- Data Orb Repository real circuit-slot behavior.
- Industrial Macerator percent-sign tooltip crash fix.
- Steam multiblock void bus cast fix.
- Remapped cauldron cleaning NEI recipe refresh.
- Multiblock button tooltip text/color unification.
- Digital/super chest item sink filtering.
- Boiler sound muffling button restoration.

## First Milestone

Milestone 0.1 is a compatibility build:

- Buildable SlopCraft artifact.
- Public repository with license and attribution intact.
- CI build with Java configured.
- The bootstrap bugfix stack applied.
- No mod id migration yet.
- A short migration note explaining that this is a drop-in GregTech-compatible fork, not a new-save-only rewrite.

Milestone 0.F is the Foundry design prototype:

- A playable ore-to-part automation loop.
- A small physical process graph: motion, heat, pressure, and material state.
- Diagnostics for every stopped machine.
- Recipe/process validation before world load.
- No hidden spreadsheet-only progression.
