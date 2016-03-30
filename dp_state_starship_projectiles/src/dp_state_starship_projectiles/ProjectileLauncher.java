package dp_state_starship_projectiles;

public class ProjectileLauncher {
	UnloadedLauncherState unloadedLauncher;
	LoadedLauncherState loadedLauncher;
	FiringProjectileState firingProjectile;
	OutOfProjectilesState outOfProjectiles;
	
	ProjectileLauncherState currentLauncherState;
	
	public ProjectileLauncher(){
		this.unloadedLauncher = new UnloadedLauncherState(this);
		this.loadedLauncher = new LoadedLauncherState(this);
		this.firingProjectile = new FiringProjectileState(this);
		this.outOfProjectiles = new OutOfProjectilesState(this);
		
		currentLauncherState = unloadedLauncher;
	}
	
	void setLauncherState(ProjectileLauncherState currentLauncherState){
		this.currentLauncherState = currentLauncherState;
	}
	
	public void loadLauncher(){
		currentLauncherState.loadLauncher();
	}
}
