# Vertical Slice 0: Ore To Part

Vertical Slice 0 proves the Foundry idea with one compact playable loop.

## Goal

Build a visible, automatable line that turns rough copper ore into a finished conductive plate.

This slice must be small enough to implement, but deep enough to prove SlopCraft is not just recipes in a trench coat.

## Player Story

The player starts with manual tools and builds:

1. A hand-cranked crusher.
2. A washer/sorter using water flow.
3. A charcoal-fired kiln or furnace.
4. A simple roller press.
5. Belts/chutes to connect them.
6. A pressure/heat/motion diagnostic overlay.

The success condition is a continuous ore-to-plate line that can run unattended while supplied.

## Included Materials

Keep the first slice intentionally tiny:

- Copper
- Tin
- Iron
- Charcoal/coke
- Stone/ceramic
- Water
- Steam
- Slag
- Dirty dust
- Washed concentrate

## Process Chain

```text
Rough Copper Ore
  -> crush
Crushed Copper Ore + Stone Byproduct
  -> wash
Washed Copper Concentrate + Dirty Water
  -> dry/heat
Copper Ingot + Slag
  -> roll
Copper Plate
```

Optional branch:

```text
Dirty Water
  -> settle/filter
Trace Slurry + Reusable Water
```

## Systems To Prove

### Motion

- Hand crank produces weak intermittent torque.
- Water wheel or steam piston produces continuous torque.
- Machines report "insufficient torque" or "overstressed shaft."

### Heat

- Kiln/furnace consumes fuel and heats a chamber.
- Different processes require different temperature bands.
- Machines report "too cold", "too hot", or "missing fuel."

### Fluids

- Washer consumes water and emits dirty water.
- Flow direction is visible.
- Output blockage is diagnosed.

### Items

- Items can move on belts/chutes.
- Machines expose input/output ports.
- A jammed output stops the process with a clear reason.

### Diagnostics

Every machine must expose:

- Process name.
- Current stage.
- Required state.
- Current state.
- Blocking reason.
- Throughput over the last short window.

## First Blocks

- Crank
- Shaft
- Gearbox
- Belt
- Chute
- Crusher
- Washer
- Kiln
- Roller Press
- Basin
- Pump
- Gauge
- Diagnostic Goggles or Probe

## First UI

No giant GUI wall. Machines should have compact panels:

- One line status.
- Input/output preview.
- Power/heat/fluid requirement.
- Last failure reason.
- Throughput hint.

## Quality Gates

This slice is not done until:

- The full line runs unattended for 10 in-game minutes.
- Stopping any input produces a correct diagnostic.
- Blocking any output produces a correct diagnostic.
- Save/load resumes machine state correctly.
- No item duplication occurs from pause, chunk unload, or output blockage.
- The process registry validates at startup.
- The slice has a profiling baseline.

## Implementation Architecture

Keep the core logic portable:

- `ProcessDefinition`: what transformation can happen.
- `ProcessState`: current state inside a machine.
- `MaterialState`: item/fluid plus purity, heat, shape, and metadata.
- `MachinePort`: typed input/output for item, fluid, heat, motion, signal.
- `Network`: motion/fluid/heat propagation.
- `Diagnostic`: structured machine status shown by UI and logs.

Minecraft integration should be an adapter around this model, not the model itself.

## Cut Scope

Do not include these in slice 0:

- Electricity.
- Circuits.
- Clean rooms.
- More than one metal line.
- Dozens of decorative blocks.
- Space, magic, or nuclear content.
- Full GregTech compatibility.

## Done Means

The player can point at the factory and say:

> Ore goes in there, I can see why it moves, I can see why it stops, and I know how to make it faster.
