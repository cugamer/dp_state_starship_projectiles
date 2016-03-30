package dp_state_starship_projectiles;

public class LauncherControl {

	public static void main(String[] args) {
		ProjectileLauncher launcher = new ProjectileLauncher();
		
		launcher.loadLauncher();
		launcher.unloadLauncher();
		launcher.fireLauncher();
		launcher.loadLauncher();
		launcher.fireLauncher();
	}

}
