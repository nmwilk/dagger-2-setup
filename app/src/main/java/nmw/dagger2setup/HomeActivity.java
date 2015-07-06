/*
 * Copyright (C) 2013 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nmw.dagger2setup;

import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;

import javax.inject.Inject;

public class HomeActivity extends FragmentActivity {
    @Inject ActivityTitleController activityTitleController;
    @Inject LocationManager locationManager;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);

        final HomeComponent component = DaggerHomeComponent.builder()
                .applicationComponent(((DemoApplication) getApplication()).component())
                .activityModule(new ActivityModule(this))
                .build();
        component.inject(this);

        final TextView msg = (TextView) findViewById(R.id.msg);

        activityTitleController.setTitle("Home Activity");
        // TODO do something with the injected dependencies here!

    }
}
