package com.wy.lib.wytrace;

import android.content.Context;

import androidx.startup.Initializer;

import java.util.Collections;
import java.util.List;

public class StartUp implements Initializer<Void> {

    @Override
    public Void create(Context context) {
        ArtMethodTrace.fix14debugApp(context);
        return null;
    }

    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.emptyList();
    }
}
