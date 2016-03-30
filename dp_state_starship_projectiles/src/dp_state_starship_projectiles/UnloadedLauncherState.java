package dp_state_starship_projectiles;

public class UnloadedLauncherState implements ProjectileLauncherState {
	ProjectileLauncher launcher;
	
	public UnloadedLauncherState(ProjectileLauncher launcher){
		this.launcher = launcher;
	}

	public void loadLauncher() {
		System.out.println("Loading launcher, launcher is now loaded.");
		launcher.setLauncherState(launcher.loadedLauncher);
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
