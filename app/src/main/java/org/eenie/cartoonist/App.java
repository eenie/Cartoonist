package org.eenie.cartoonist;

import org.eenie.cartoonist.base.BaseApp;

import cn.bmob.v3.Bmob;

/**
 * Created by Eenie on 2016/8/15.
 * Des:
 */
public class App extends BaseApp {

    private String mBmobKey = "e0e37b52078b4a288a085e425fbe6e23";
    private String mSecretKey = "02887cb551d841bd";

    @Override
    public void onCreate() {
        super.onCreate();
        Bmob.initialize(this, mBmobKey);
    }





}
