package com.projectfinal;

import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.XC_MethodHook;

public class SystemUIHook {

    public static void initialize(ClassLoader loader) {
        try {
            Class<?> controller =
                XposedHelpers.findClassIfExists(
                    "com.oplus.systemui.qs.OplusPanelViewPagerController",
                    loader
                );

            if (controller == null) {
                return;
            }

            de.robv.android.xposed.XposedBridge.log(
                "PROJECT-FINAL: Controller discovered"
            );

        } catch (Throwable error) {
            de.robv.android.xposed.XposedBridge.log(
                "PROJECT-FINAL ERROR: " + error
            );
        }
    }
}
