package me.lolevsky.nasaplanetary.model;

import java.util.ArrayList;
import java.util.List;

import me.lolevsky.nasaplanetary.model.objects.MainScreen;

public class MainScreenModule {
    List<MainScreen> entityList = new ArrayList<>();

    public List<MainScreen> getEntityList() {
        return entityList;
    }

    public void setEntityList(List<MainScreen> entityList) {
        this.entityList = entityList;
    }

    public void setAddItem(MainScreen addItem) {
        entityList.add(addItem);
    }
}
