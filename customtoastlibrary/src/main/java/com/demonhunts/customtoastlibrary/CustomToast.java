package com.demonhunts.customtoastlibrary;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.shapes.Shape;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.LENGTH_SHORT;

public class CustomToast {
    private Context context;
    private View view;
    private Toast toast;
    private TextView textView;
    private ImageView imageView;
    private LinearLayout layout;
    private boolean isIconSet;

    public CustomToast(Context context,String message) {
        this.context = context;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.layout_custom_toast, null);
        toast = new Toast(context);

        textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(message);

        imageView = (ImageView) view.findViewById(R.id.imageView);
        layout = (LinearLayout) view.findViewById(R.id.parentLayout);
        layout.setBackgroundResource(R.drawable.rounded_corner);
    }

    /**Changes the toast's text size**/
    public void setTextSize(float size){
        textView.setTextSize(size);
    }

    /**Changes the toast's text color. Eg. Pass COLOR.RED as argument to this function to change text color to red.**/
    public void setTextColor(int color){
        textView.setTextColor(color);
    }

    /**Makes the toast content appear in bold**/
    public void setBold(){
        textView.setTypeface(textView.getTypeface(), Typeface.BOLD);
    }

    /**Makes the toast content appear in italics**/
    public void setItalics(){
        textView.setTypeface(textView.getTypeface(), Typeface.ITALIC);
    }

    /**Pass a color int value to set the background color, such as COLOR.rgb()**/
    public void setBackgroundColor(int color){
        GradientDrawable d = (GradientDrawable) layout.getBackground();
        d.setColor(color);
    }

    /**Takes a drawable as argument and displays the drawable image in the toast**/
    public void setToastIcon(int image){
        imageView.setImageDrawable(context.getResources().getDrawable(image));
        isIconSet = true;
    }

    /**Change toast's duration by passing a string "long" or "short"**/
    public void setDuration(String duration){
        if(duration.toLowerCase().equals("short")){
            toast.setDuration(LENGTH_SHORT);
        }
        else{
            toast.setDuration(LENGTH_LONG);
        }
    }

    /** Call this method to display your custom toast**/
    public void showToast(){
        if(!isIconSet)
            imageView.setVisibility(View.GONE);
        toast.setView(view);
        toast.show();
    }
}
