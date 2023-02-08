package com.javarush.games.minigames.mini03;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

import java.util.ArrayList;

/* 
Простая программа
*/

public class SymbolGame extends Game {

    //напишите тут ваш код
    @Override
    public void initialize(){
        setScreenSize(8, 3);

        int x = 0;
        String str = "JAVARUSH";
        for (char ch : str.toCharArray()) {
            setCellValueEx(x, 1, Color.ORANGE, String.valueOf(ch));
            x++;
        }
    }
}
