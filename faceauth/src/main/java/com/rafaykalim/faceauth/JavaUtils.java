package com.rafaykalim.faceauth;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

public class JavaUtils {
    public static Activity getActivityFromContext(Context context) {
        if (context == null) return null;
        if (context instanceof Activity) return (Activity) context;
        if (context instanceof ContextWrapper) return getActivityFromContext(((ContextWrapper)context).getBaseContext());
        return null;
    }
}
