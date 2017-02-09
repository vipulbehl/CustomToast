package com.demonhunts.customtoastlibrary;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.LENGTH_SHORT;

/**
 * Created by Vipul on 05-Feb-17.
 */

public class CustomToast {
    private Context context;
    private View view;
    private Toast toast;
    private TextView textView;
    private ImageView imageView;
    private boolean isBold;

    public CustomToast(Context context,String message) {
        this.context = context;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.layout_custom_toast, null);
        toast = new Toast(context);

        textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(message);

        imageView = (ImageView) view.findViewById(R.id.imageView);
    }

    public void setTextSize(float size){
        textView.setTextSize(size);
    }
    public void setTextColor(int color){
        textView.setTextColor(color);
    }

    public void setBold(boolean isBold){
        this.isBold = isBold;
    }

    public void setBackgroundColor(int color){
        textView.setBackgroundResource(R.drawable.rounded_corner);
        GradientDrawable d = (GradientDrawable) textView.getBackground();
        d.setColor(color);
    }

    public CustomToast setToastIcon(Drawable image){
        imageView.setImageDrawable(image);
        return null;
    }

    public void setDuration(String duration){
        if(duration.toLowerCase().equals("short")){
            toast.setDuration(LENGTH_SHORT);
        }
        else{
            toast.setDuration(LENGTH_LONG);
        }
    }

    public void showToast(){
        toast.setView(view);
        toast.show();
    }
}
