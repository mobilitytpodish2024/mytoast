package com.tpcodl.mytoast;

import android.content.Context;
import android.widget.Toast;

public class ShowToast {

    public static void showToast(Context context){
        Toast.makeText(context, "Toast from library", Toast.LENGTH_SHORT).show();
    }
}
