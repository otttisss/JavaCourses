package com.javarush.games.minigames.mini07;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Работа с мышью
*/

public class PaintGame extends Game {

    @Override
    public void initialize() {
        //напишите тут ваш код
        setScreenSize(5, 5);
        for (int i = 0; i < getScreenHeight(); i++) {
            for (int j = 0; j < getScreenWidth(); j++) {
                setCellColor(i, j, Color.WHITE);
            }
        }
    }

    //напишите тут ваш код
    @Override
    public void onMouseLeftClick(int x, int y){
        setCellColor(x, y, Color.GREEN);
    }

    @Override
    public void onMouseRightClick(int x, int y){
        setCellColor(x, y, Color.ORANGE);
    }
}