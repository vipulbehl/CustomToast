package com.demonhunts.customtoastlibrary;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
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
    }

    public void setTextSize(float size){
        textView.setTextSize(size);
    }
    public void setTextColor(int color){
        textView.setTextColor(color);
    }

    public void setBold(){
        textView.setTypeface(textView.getTypeface(), Typeface.BOLD);
    }

    public void setItalics(){
        textView.setTypeface(textView.getTypeface(), Typeface.ITALIC);
    }

    public void setBackgroundColor(int color){
        layout.setBackgroundResource(R.drawable.rounded_corner);
        GradientDrawable d = (GradientDrawable) layout.getBackground();
        d.setColor(color);
    }

    public void setToastIcon(int image){
        imageView.setImageDrawable(context.getResources().getDrawable(image));
        isIconSet = true;
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
        if(!isIconSet)
            imageView.setVisibility(View.GONE);
        toast.setView(view);
        toast.show();
    }
}
