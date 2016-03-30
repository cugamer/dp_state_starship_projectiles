package dp_state_starship_projectiles;

public class LoadedLauncherState implements ProjectileLauncherState {
	ProjectileLauncher launcher;
	
	public LoadedLauncherState(ProjectileLauncher launcher){
		this.launcher = launcher;
	}
	
	
	public void loadLauncher() {
		System.out.println("Launcher is already loaded, unable to load additional projectiles.");
	}

	public void unloadLauncher() {
		System.out.println("Launcher is now unloaded.");
	}

	public void fireOrder() {
		System.out.println("Fire order has been sent to loaded launcher.");
	}

	public void launchProjectile() {
		System.out.println("Projectile is currently being fired.");
	}
}
