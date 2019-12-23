package com.sti.stickmansmash.Screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.sti.stickmansmash.Helpers.Assets;

public class MainMenu implements Screen {

    private Stage stage = new Stage();

    private Image bg, nextBtn, backBtn, settings;

    @Override
    public void show() {

        // set screen size
        stage.setViewport(new ExtendViewport (1920, 1080));

        bg = new Image(Assets.menu[7]);
        bg.setFillParent(true);
        stage.addActor(bg);

        nextBtn = new Image(Assets.menu[5]);
        nextBtn.setPosition(810.0f, 315.0f );
        nextBtn.setScale(0.50f);
        nextBtn.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y){
                ((Game) Gdx.app.getApplicationListener()).setScreen(new GameScreen());
//                System.out.println("test");
            }
        });
        stage.addActor(nextBtn);

        settings = new Image(Assets.menu[6]);
        settings.setPosition(50.0f , 1080.0f + 120.0f);
        settings.setScale(0.25f);

        stage.addActor(settings);

        // get user touch on screen
        Gdx.input.setInputProcessor(stage);


    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        stage.getViewport().update(width, height, true);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        if(stage != null){
            stage.dispose();
        }
    }

}
