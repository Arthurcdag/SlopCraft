# SlopCraft Foundry: Ground-Up Design

This is the Lamborghini move: respect what the old machine was trying to do, then build the better one from first
principles.

SlopCraft Foundry is not "GregTech with different names" and not "Create with harder recipes." It is a physical
industrial progression game where complexity becomes visible machinery instead of hidden recipe tax.

## What GregTech Was Trying To Achieve

GregTech's strongest goals are worth keeping:

- Make industrialization feel earned.
- Turn raw terrain into engineered supply chains.
- Make automation the real game, not a convenience after the game.
- Reward planning, logistics, material choice, and scaling.
- Give players a long runway from primitive work to absurd megastructure industry.
- Make each new tier feel like a new industrial era.

## Where The Old Loop Fails

The target is good; the delivery is often rough:

- Too much complexity is invisible until a recipe fails.
- Many recipes feel like paperwork instead of engineering.
- Multiblocks are powerful but often become black boxes.
- Debugging is too dependent on wikis, screenshots, and tribal memory.
- Scaling frequently means "more parallel machines" rather than new constraints.
- Performance problems hide inside huge registries and tick paths.
- Content breadth sometimes beats content quality.

## Foundry Product Objective

SlopCraft should make the player feel like they are designing an actual industrial system.

The core promise:

> If something is complicated, the player should be able to see why, inspect it, and automate around it.

## Design Pillars

### 1. Visible Complexity

Processes should be visible in-world where possible:

- Belts, chutes, lifts, conveyors, and loaders move items.
- Pipes show flow, pressure, direction, and contamination risk.
- Heat moves through blocks and machines.
- Machines expose their missing condition: no torque, too cold, clogged output, wrong material state, low purity.

### 2. Physical Process Graph

Every process is a transformation of material state:

- Shape: chunk, dust, slurry, ingot, rod, plate, foil, wire, wafer, part.
- Purity: crude, washed, refined, ultra-pure.
- Temperature: cold, hot, molten, plasma.
- Stress: compressed, extruded, annealed, quenched.
- Charge or signal state for electronics.

Recipes become consequences of process capability, not just arbitrary rows in a table.

### 3. Automation Before Volume

The player should automate early, then improve the automation:

- Primitive machines are hand-fed but automatable.
- Early power is weak but spatially interesting.
- Midgame introduces routing, buffering, sensors, and feedback loops.
- Endgame introduces plants, not just bigger single blocks.

### 4. Scaling Changes The Problem

More scale should add new engineering constraints:

- Heat recovery.
- Waste streams.
- Pressure loss.
- Item/fluid contamination.
- Maintenance windows.
- Throughput balancing.
- Control systems.

The answer should not only be "copy this machine 64 times."

### 5. Every Failure Needs A Diagnosis

No silent failures. Every stopped machine must report:

- Current blocker.
- Expected input/state.
- Current input/state.
- Nearby related blockers when possible.
- Suggested inspection point, not wiki text.

### 6. High Quality Is A Feature

SlopCraft releases should feel boring in the best way:

- Deterministic registration.
- Validated recipes.
- No known dupes.
- No known save corruption.
- Profiling before optimization rewrites.
- Feature flags for experimental systems.

## Core Loop

1. Survey: find deposits, water, fuel, biome/process advantages.
2. Extract: mine, pump, gather, or cultivate raw inputs.
3. Prepare: crush, wash, sort, dry, heat, cool, filter.
4. Shape: cast, press, roll, draw, extrude, cut.
5. Assemble: combine parts into machines, circuits, structures.
6. Control: sensors, logic, routing, safety, scheduling.
7. Scale: build plants that recover waste, handle side products, and push throughput.

## Machine Philosophy

Machines are built from roles:

- Actuator: consumes motion, heat, pressure, voltage, signal, or catalysts.
- Chamber: defines environment and capacity.
- Tooling: defines shape/process capability.
- Ports: define item, fluid, gas, heat, signal, and maintenance I/O.
- Controller: coordinates process and exposes diagnostics.

This makes multiblocks less like magic recipes and more like configurable industrial equipment.

## Progression Eras

### Era 0: Workshop

Hand tools, crank power, simple heat, visible mechanical advantage. Goal: make the first reliable parts.

### Era 1: Steamworks

Boilers, pressure, belts, pumps, basic sensors. Goal: continuous ore-to-part line.

### Era 2: Electrical Plant

Motors, generators, batteries, wire loss, control panels. Goal: automated factory rooms.

### Era 3: Chemical Industry

Fluids, gases, purity, catalysts, waste recovery. Goal: electronics and advanced materials.

### Era 4: Precision Industry

Clean rooms, wafers, calibration, tool wear, metrology. Goal: high-reliability machine networks.

### Era 5: Planetary Industry

Megastructures, remote plants, logistics, environmental control. Goal: absurd scale with readable systems.

## Content Rules

- Add systems before adding hundreds of one-off items.
- Prefer reusable process capabilities over hardcoded recipes.
- New materials need distinct process behavior or useful integration.
- Add UI/diagnostics at the same time as mechanics.
- A content line is incomplete without automation support.

## What We Do Not Copy

- No direct Create mechanics, assets, or code.
- No direct GregTech registry migration without permission/license compliance and tooling.
- No "harder because longer" recipe philosophy.
- No black-box megamachines that only work if copied from a wiki image.

## North Star

A good SlopCraft factory should be understandable from the world itself:

- You can walk the line and see the bottleneck.
- You can inspect a machine and know why it stopped.
- You can improve throughput with engineering, not just repetition.
- You can scale into ridiculous industry without turning the game into a spreadsheet.
