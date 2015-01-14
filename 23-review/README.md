Code Review for [Binding of Stuysac](https://github.com/bilingwu/apfinal)
==================================

Files covered:
- Thing.java
- Character.java
- ChickenOverRice.java
- Hero.java
- Item.java
- Projectile.java

Thing.java
----------
Stores type and location of an object.
Type is:
- 0: friendly
- 1: enemy
- 2: projectiles
- 3: environment

> *Optional Suggestion*
> look into [Java Enums](http://docs.oracle.com/javase/tutorial/java/javaOO/enum.html) as a better way to represent a fixed number of options instead of using integers with abstract significance


location is stored as an `int[]`:
```java
// Thing.java line 9
    location = new int[]{floor, rx, ry, x, y};
```

> *Optional Suggestion*
> storing that information in an array means you must remember the significance of the first element, the second element, etc. variable names are nice because they signify meaning
> consider either storing each integer as a seprate attribute, or at least write named getters and/or setters


Character.java
---------
extends Thing
in abstract class for any Character such as heros monsters

Position is stored in `location` inherited from thing
adds `name`, `hp`, `atk`, `xvelocity`, and `yvelocity` attributes

Hero.java
--------
blank right now

Item.java
--------
extends Thing
only attribute it adds is `itemnumber`, not sure what the significance of that is

ChickenOverRice.java
---------------------
extends Item
sets itemnumber to `1`, maybe each Item type receives a different number?
it seems like that is going to get confusing
see [Character](#characterjava) comments for link to enums, that my be good here
or maybe use strings instead of integers so you can at least have some idea of what itemnumber `1` means

Projectile.java
---------------
lot's of GUI code here
I'm a little confused about that because I thought you were keeping your GUI code seperate from your logic which seems like a good idea
I think there isn't any actual logic here, not quite sure what to do with this
