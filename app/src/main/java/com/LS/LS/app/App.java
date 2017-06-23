package com.LS.LS.app;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;

/**
 * Created by XhinLiang on 2017/5/13.
 * xhinliang@gmail.com
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AVOSCloud.initialize(this, "nj8A0b0Lyf8YwrIRg3usn4wU-gzGzoHsz", "8EtrJHwciv91nfFwp1qU6K2B");
    }
}
