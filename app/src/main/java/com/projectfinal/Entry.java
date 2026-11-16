package com.projectfinal;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

import static de.robv.android.xposed.XposedBridge.log;

public class Entry implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(
            XC_LoadPackage.LoadPackageParam lpparam) {

        if (!"com.android.systemui".equals(lpparam.packageName)) {
            return;
        }

        log("PROJECT-FINAL: SystemUI loaded");

        SystemUIHook.initialize(lpparam.classLoader);
    }
}
