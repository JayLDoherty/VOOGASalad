package engine.game.gameloop;

import engine.GameInfo;
import engine.game.LevelManager;
import engine.graphics.GraphicsEngine;

/**
 * TranstionStepStrategy for when a game over occurs.
 * 
 * @author Matthew Barbano
 *
 */
public class GameOverStepStrategy extends TransitionStepStrategy {
	private static final String RESOURCE_NAME = "GameOver";

	private LevelManager levelManager;
	private GameInfo info;
	
	public GameOverStepStrategy(LevelManager levelManager, GameInfo info) {
		super(RESOURCE_NAME);
		this.levelManager = levelManager;
		this.info = info;
	}

	@Override
	protected int nextLevelNumber() {
		return -1;
	}

	@Override
	protected boolean handleHighscore(GraphicsEngine graphicsEngine) {
		return false;
	}

	@Override
	protected void modifyUnlockedScreens() {
		levelManager.clearUnlockedLevels();
		levelManager.addUnlockedLevel(1);
		info.getScorebar().resetLives();
	}
	
	@Override
	protected StepStrategy nextStrategyLevelSelectionMode() {
		return new LevelSelectionStepStrategy(false);
	}
}
