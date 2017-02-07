package com.demonhunts.customtoastlibrary;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Vipul on 05-Feb-17.
 */

public class CustomToast {
    private Context context;
    private View view;
    private TextView textView;
    private boolean isBold;

    public CustomToast(Context context,String message) {
        this.context = context;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.layout_custom_toast, null);
        textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(message);
    }

    public void showToast(){
        Toast toast = new Toast(context);
        toast.setView(view);
        toast.show();
    }

    public CustomToast setBold(boolean isBold){
        this.isBold = isBold;
        return null;
    }
}
