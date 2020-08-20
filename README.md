# Polymorphism Exercise 4

Pair Programming - Polymorphism exercise (4th exercise)
Created April 18th, 2019

## Overview
This is an exercise for Polymorphism.
Used a variety of materials (glass, plywood) and items (chair, table)

### Classes
1. Burnt
 * Class to represent the burn damage type. This class extends the Damage class.
 * Constructor: Burnt()
  * The constructor will call the super class' constructor, Damage and pass on the word 'burn'

2. Chair
 * Class to represent the chair furniture. This class extends the Furniture class.

3. Damage
 * Class to represent damage types

4. Destruction
 * Main class to serve as the program driver

5. Furniture
 * Class to represent objects' status
 * Constructor: Furniture(String furnitureType, Material materialType)
   * The constructor will create the furniture with the given furnitureType and materialType.
 * Functions:
   * getMaterial()
     * This function will return the material type of a Furniture class variable
   * getFurnitureType()
     * This function will return the furniture type of a Furniture class variable
   * printStatus()
     * This function will print the status of a Furniture class variable

6. Glass
 * Class to represent the Glass' material. This class extends the Material class.

7. Material
 * Class to represent various materials type. This class handles hitting and setting on fire events.

8. Plywood
 * Class to represent the plywood material. This class extends the Material class.

9. Table
 * Class to represent the table furniture. This class extends the Furniture class. This class will hold a material type.

- Burnt.java - Class for the burn damage type. Extends Damage.
- Chair.java - Class for chair furniture. Extends Furniture. Accepts a material (glass/plywood)
- Damage.java - Class for damage types (hit or burn)
- Destruction.java - Main file, contains a lot of tests
- Furniture.java - Handles the status of the "object"
- Glass.java - Class glass material, and sets that glass items can't be burnt (isBurnt = false). Extends Material
- Material.java - Class for material (glass or plywood). Also handles hitting and setting on fire.
- Plywood.java - Class for plywood material. Burnt is enabled by default. Extends Material.
- Table.java - Class for table furniture. Extends Furniture. Accepts a material (glass/plywood)
