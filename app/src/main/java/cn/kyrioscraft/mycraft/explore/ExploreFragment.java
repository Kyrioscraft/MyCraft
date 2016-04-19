/*
 * Copyright 2015 Google Inc. All rights reserved.
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

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.kyrioscraft.mycraft.R;

import static android.content.SharedPreferences.OnSharedPreferenceChangeListener;

import static cn.kyrioscraft.mycraft.utils.LogUtils.makeLogTag;

public class ExploreFragment extends Fragment {

    private static final String TAG = makeLogTag(ExploreFragment.class);



    private OnSharedPreferenceChangeListener mSettingsChangeListener =
            new OnSharedPreferenceChangeListener() {
        @Override
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {

        }
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.explore_frag, container, false);

        getActivity().overridePendingTransition(0, 0);

        return root;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }



    @Override
    public void onResume() {
        super.onResume();
        getActivity().invalidateOptionsMenu();

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);


    }

    @Override
    public void onDetach() {
        super.onDetach();

    }


}
