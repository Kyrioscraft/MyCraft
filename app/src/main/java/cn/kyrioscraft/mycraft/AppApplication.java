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

package cn.kyrioscraft.mycraft;

import android.app.Application;



import static cn.kyrioscraft.mycraft.utils.LogUtils.makeLogTag;


/**
 * {@link Application} used to initialize Analytics. Code initialized in
 * Application classes is rare since this code will be run any time a ContentProvider, Activity,
 * or Service is used by the user or system. Analytics, dependency injection, and multi-dex
 * frameworks are in this very small set of use cases.
 */
public class AppApplication extends Application {

    private static final String TAG = makeLogTag(AppApplication.class);

    @Override
    public void onCreate() {
        super.onCreate();


    }
}
