# PairProgramming4
Pair Programming - Polymorphism exercise (4th exercise)

This is an exercise for Polymorphism. Previously done as a group exercise.
Used a variety of materials (glass, plywood) and items (chair, table)

- Burnt.java - Class for the burn damage type. Extends Damage.
- Chair.java - Class for chair furniture. Extends Furniture. Accepts a material (glass/plywood)
- Damage.java - Class for damage types (hit or burn)
- Destruction.java - Main file, contains a lot of tests
- Furniture.java - Handles the status of the "object"
- Glass.java - Class glass material, and sets that glass items can't be burnt (isBurnt = false). Extends Material
- Material.java - Class for material (glass or plywood). Also handles hitting and setting on fire.
- Plywood.java - Class for plywood material. Burnt is enabled by default. Extends Material.
- Table.java - Class for table furniture. Extends Furniture. Accepts a material (glass/plywood)
