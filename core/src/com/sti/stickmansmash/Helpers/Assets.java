package com.sti.stickmansmash.Helpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Assets {

    private static final AssetManager mg = new AssetManager();
    private static TextureAtlas atlas;
    private static final String Assets = "smashbros.atlas";

    public static TextureRegion[] menu = new TextureRegion[7];

    public static AssetManager getMg() {
        return mg;
    }

    public static void load(){
        mg.load(Assets, TextureAtlas.class);
        loadMenu();
    }

    private static void loadMenu(){
        for(int i = 0; i < 7; i++){
            menu[i] = getAtlas().findRegion(Constants.menu[i]);
        }
    }

    private static TextureAtlas getAtlas(){
        if(atlas == null)
            atlas = new TextureAtlas(Gdx.files.internal(Assets));
        return atlas;

    }

}
