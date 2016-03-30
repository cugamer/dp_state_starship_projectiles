package dp_state_starship_projectiles;

public class FiringProjectileState implements ProjectileLauncherState {
	ProjectileLauncher launcher;
	
	public FiringProjectileState(ProjectileLauncher launcher){
		this.launcher = launcher;
	}

	public void loadLauncher() {
		System.out.println("Unable to load durring firing sequence.");
	}

	public void unloadLauncher() {
		System.out.println("Projectile is being fired, unable to abort sequence.");
	}

	public void fireOrder() {
		System.out.println("Fire order has been recieved but cannot be implemented until "
				+ "current sequence is completed and new projectile is loaded.");

	}

	public void launchProjectile() {
		System.out.println("Firing in progress, unable to initate new launch at this time.");
	}

}
