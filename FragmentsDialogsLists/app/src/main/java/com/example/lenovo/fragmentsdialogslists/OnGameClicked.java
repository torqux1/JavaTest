package com.example.lenovo.fragmentsdialogslists;

import com.example.lenovo.fragmentsdialogslists.adapters.GameItemAdapter;
import com.example.lenovo.fragmentsdialogslists.models.CategoryItems;

/**
 * Created by Lenovo on 5/30/2017.
 */

public interface OnGameClicked {
    void onGameCLicked(CategoryItems category, int position);
}
