package ru.gb.coolcalc;
import android.app.Activity;
import android.content.Intent;


public class themeUtils

{

    private static int cTheme;
    public final static int light = 0;
    public final static int dark = 1;
    public final static int cool = 2;
    public final static int happy = 3;


    public static void changeToTheme(Activity activity, int theme)
    {
        cTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
    }

    public static void onActivityCreateSetTheme(Activity activity)
    {
        switch (cTheme)
        {
            default:

            case dark:
                activity.setTheme(R.style.AppTheme);
                break;

            case light:
                activity.setTheme(R.style.AppThemeLight);
                break;

            case cool:
                activity.setTheme(R.style.MyCoolStyle);
                break;

            case happy:
                activity.setTheme(R.style.AppThemeDark);
                break;

        }

    }

}