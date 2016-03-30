package dp_state_starship_projectiles;

public interface ProjectileLauncherState {
	public void loadLauncher();
	public void unloadLauncher();
	public void fireOrder();
	public void launchProjectile();
}
