package androidx.test.uiautomator;

import android.app.UiAutomation;

public class Util {
    public static UiAutomation uiAutomation(UiDevice device){
       return device.getUiAutomation();
    }
}
