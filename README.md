# Polymorphism Exercise 4

Pair Programming - Polymorphism exercise (4th exercise)
Created April 18th, 2019

-------------------------------------------------------------------------------

## Overview
This is an exercise for Polymorphism.
Used a variety of materials (glass, plywood) and items (chair, table)

-------------------------------------------------------------------------------

### Classes
1. Burnt
 * Class to represent the burn damage type. This class extends the Damage class.
 * Constructor: Burnt()
   * The constructor will call the super class' constructor, Damage and pass on the word 'burn'


2. Chair
 * Class to represent the chair furniture. This class extends the Furniture class.
 * Constructor: Chair(Material material)
   * The constructor will call the super class' constructor, Furniture, takes a Material as its argument and pass on the word 'chair' and its material.


3. Damage
 * Class to represent damage types
 * Constructor: Damage(String damageType)
   * The constructor will create the damage type with the given damageType.


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
 * Constructor: Glass()
   * The constructor will call the super class' constructor, Material and pass on the word 'glass'
 * Functions:
   * setFire()
     * This function will disable the material's ability to be on fire
 
 

7. Material
 * Class to represent various materials type. This class handles hitting and setting on fire events.
 * Constructors: 
   * Material()
     * This constructor sets the default material to nothing ("")
   * Material(String material)
     * This constructor create a material with the given material
 * Functions:
   * getMaterialType()
     * This function will return the material type of a Material class variable
   * getIsBroken()
     * This function will return whether the material "is broken" or not
   * getIsBurnt()
     * This function will return whether the material "is burnt" or not
   * setMaterial(String material)
     * This function will set the material to the given material
   * hit()
     * This function will set the status of isBroken to be true
   * setFire()
     * This function will set the status of isBurnt to be true
   * toString()
     * This function will return the material as a string

8. Plywood
 * Class to represent the plywood material. This class extends the Material class.
 * Constructor: Plywood()
   * The constructor will call the super class' constructor, Material and pass on the word 'plywood'

9. Table
 * Class to represent the table furniture. This class extends the Furniture class. This class will hold a material type.
 * Constructor: Table(Material material)
   * The constructor will call the super class' constructor, Furniture, pass on the word 'glass' and the given material.
   
   








