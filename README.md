Starship Projectiles state pattern
==================================

An implementation of the state pattern as applied to launching space probes.  The ProjectileLauncherState interface is implemented in subclasses which provide the necessary behaviors based on the state held by the ProjectileLauncher class.  The various actions which the ProjectileLauncher can execute are held in it's methods, these then use the currentLauncherState object to call the appropriate specific behaviors.  This is basic practice with the state pattern.

![UML state diagram for project](https://github.com/cugamer/dp_state_starship_projectiles/blob/master/dp_state_starship_projectiles/dp_state_diagram_starship_projectiles.png)
![UML class diagram for project](https://github.com/cugamer/dp_state_starship_projectiles/blob/master/dp_state_starship_projectiles/dp_state_starship_projectiles.png)
