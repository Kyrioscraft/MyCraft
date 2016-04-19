/*
 * Copyright 2014 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.kyrioscraft.mycraft.explore;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import cn.kyrioscraft.mycraft.R;
import cn.kyrioscraft.mycraft.ui.BaseActivity;
import cn.kyrioscraft.mycraft.ui.widget.CollectionView;
import cn.kyrioscraft.mycraft.ui.widget.DrawShadowFrameLayout;

import static cn.kyrioscraft.mycraft.utils.LogUtils.makeLogTag;
/**
 * Display a summary of what is happening at Google I/O this year. Theme and topic cards are
 * displayed based on the session data. Conference messages are also displayed as cards..
 */
public class ExploreActivity extends BaseActivity implements Toolbar.OnMenuItemClickListener {

    private static final String TAG = makeLogTag(ExploreActivity.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explore_act);
        registerHideableHeaderView(findViewById(R.id.headerbar));
    }


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        enableActionBarAutoHide((CollectionView) findViewById(R.id.explore_collection_view));
    }

    @Override
    protected void onActionBarAutoShowOrHide(boolean shown) {
        super.onActionBarAutoShowOrHide(shown);
        DrawShadowFrameLayout frame = (DrawShadowFrameLayout) findViewById(R.id.main_content);
        frame.setShadowVisible(shown, shown);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {

    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        return false;
    }
}
