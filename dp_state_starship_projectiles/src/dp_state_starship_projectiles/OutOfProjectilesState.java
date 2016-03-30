package dp_state_starship_projectiles;

public class OutOfProjectilesState implements ProjectileLauncherState {
	ProjectileLauncher launcher;
	
	public OutOfProjectilesState(ProjectileLauncher launcher){
		this.launcher = launcher;
	}

	public void loadLauncher() {
		System.out.println("No projectiles are available to load.");
	}

	public void unloadLauncher() {
		System.out.println("Unable to unload launcher, no projectile is loaded.");
	}

	public void fireOrder() {
		System.out.println("Fire order recieved but no projectile is loaded.  No projectile fired.");
	}

	public void launchProjectile() {
		System.out.println("Unable to launch projectile, no projectile is loaded.");
	}
}
