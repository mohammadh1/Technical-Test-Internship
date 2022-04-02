package com.example.customadapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

public class CustomAdapter extends BaseAdapter {
    private String[] names;
    private int[] photos;
    private Context context;
    private LayoutInflater inflater;

    public CustomAdapter(String[] names, int[] photos, Context context) {
        this.names = names;
        this.photos = photos;
        this.context = context;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return photos.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflater.inflate(R.layout.items, viewGroup, false);
        }
        ImageView imageView = view.findViewById(R.id.image);
        TextView textView = view.findViewById(R.id.text);
        //imageView.setImageResource(photos[i]);
        Picasso.get().load("http://gandom.co/devTest/1/images/120939950_cyCdKjEK8QSFkhXf40mhDtfzU5i9_1gSLYgwHqgJ-hs.jpg").placeholder(R.drawable.ic_launcher_background).resize(500,500).into(imageView);
        textView.setText(names[i]);
        return view;
    }
}

