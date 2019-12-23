package com.sti.stickmansmash;

import com.badlogic.gdx.Game;
import com.sti.stickmansmash.Helpers.Assets;
import com.sti.stickmansmash.Screens.MainMenu;

public class Main extends Game{

	@Override
	public void create() {
		Assets.load();
		Assets.getMg().finishLoading();
		setScreen(new MainMenu());
	}


}
