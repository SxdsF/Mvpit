package com.sxdsf.mvpit.annotation;

import android.app.Activity;
import android.app.Fragment;

public class MvpitAnnotationProcessor {
    public static void autoBindLayout(Activity activity) {
        if (activity != null) {
            Class<?> clazz = activity.getClass();
            if (clazz != null) {
                BindLayout inject = clazz.getAnnotation(BindLayout.class);
                if (inject != null) {
                    int id = inject.value();
                    if (id > 0) {
                        activity.setContentView(id);
                    }
                }
            }
        }
    }

    public static int autoBindLayout(Fragment fragment) {
        int layoutId = -1;
        if (fragment != null) {
            Class<?> clazz = fragment.getClass();
            if (clazz != null) {
                BindLayout inject = clazz.getAnnotation(BindLayout.class);
                if (inject != null) {
                    layoutId = inject.value();
                }
            }
        }
        return layoutId;
    }

    public static Class autoBindPresenterModule(Object object) {
        Class<?> cls = null;
        if (object != null) {
            Class<?> clazz = object.getClass();
            if (clazz != null) {
                BindPresenterModule presenter = clazz.getAnnotation(BindPresenterModule.class);
                if (presenter != null) {
                    cls = presenter.value();
                }
            }
        }
        return cls;
    }
}
