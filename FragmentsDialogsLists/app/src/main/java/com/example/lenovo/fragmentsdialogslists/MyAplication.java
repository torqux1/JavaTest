package com.example.lenovo.fragmentsdialogslists;

import android.app.Application;
import android.content.ContextWrapper;

import com.example.lenovo.fragmentsdialogslists.models.CategoryItems;
import com.example.lenovo.fragmentsdialogslists.models.GameCategory;
import com.orm.*;


import java.io.File;

/**
 * Created by Lenovo on 5/5/2017.
 */
// #D9E7EA
public class MyAplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        if (doesThisDbExists(this, "game_database.db")) {
            SugarDb sugar = new SugarDb(getApplicationContext());
            new File(sugar.getDB().getPath()).delete();

        }
        SugarContext.init(getApplicationContext());

        boolean doesDbExists = doesThisDbExists(this, "game_database.db");

        if (!doesDbExists) {
            GameCategory.findById(GameCategory.class, (long) 1);
            CategoryItems.findById(CategoryItems.class, (long) 1);
            initDBWithCategory();
        }


    }

    private void initDBWithCategory() {
        GameCategory action = new GameCategory("  Action", "", "#D9E7EA", R.mipmap.actiion);

        GameCategory brain = new GameCategory("Brain games", "", "#D9E7EA", R.mipmap.braingames);


        CategoryItems callOfDuty = new CategoryItems("  Action", R.mipmap.battlfield, "one of the best games", "Call of Duty", "25");
        CategoryItems starWars = new CategoryItems("  Action", R.mipmap.commandos, "Battle of Commandos", "Star Wars Commandos", "15");
        CategoryItems league = new CategoryItems("  Action", R.mipmap.league, "Meet Field of Justice", "League of Legends", "13");
        CategoryItems cs = new CategoryItems("  Action", R.mipmap.csgo, "Play CS GO NOW", "Counter Strike GO", "19");
        CategoryItems warcraft = new CategoryItems("  Action", R.mipmap.warcraft, "365 levels to Complete", "World of Warcraft", "45");
        CategoryItems tombraider = new CategoryItems("  Action", R.mipmap.tombraider, "Lara Croft's awaiting", "Tomb Raider", "15");
        CategoryItems titanfall = new CategoryItems("  Action", R.mipmap.titanfall, "Titans need your help", "Titanfall 2", "10");
        CategoryItems jewlery = new CategoryItems("Brain games", R.mipmap.bejelwed, " Destroy you jewelry", "Jewelry", "18");
        CategoryItems chess = new CategoryItems("Brain games", R.mipmap.chess, "Play old chess ", "Chess", "16");
        CategoryItems tetris = new CategoryItems("Brain games", R.mipmap.tetris, "New levels of tetris ", "Tetris", "25");
        CategoryItems heroes = new CategoryItems("Brain games", R.mipmap.heroes, "Might and Magic", "Heroes III", "75");
        CategoryItems mines = new CategoryItems("Brain games", R.mipmap.minesweeper, "For Android now", "Minesweeper", "85");

        heroes.save();
        mines.save();
        tetris.save();
        cs.save();
        league.save();
        starWars.save();
        callOfDuty.save();
        brain.save();
        action.save();
        warcraft.save();
        tombraider.save();
        titanfall.save();
        jewlery.save();
        chess.save();
        tetris.save();

    }


    private boolean doesThisDbExists(ContextWrapper wrapper, String dbName) {
        File file = wrapper.getDatabasePath(dbName);
        return file.exists();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
