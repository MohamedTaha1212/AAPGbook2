package com.projectz.aapg.aapgbook;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



public class contentAdapter extends ArrayAdapter<content> {


    public contentAdapter(Activity context, ArrayList<content> fb) {

        super(context, 0, fb);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        content currentfacebook = getItem(position);

        TextView postContentView = (TextView) listItemView.findViewById(R.id.postContent);
        assert currentfacebook != null;
        postContentView.setText(currentfacebook.getPost_content());


        ImageView postPicture = (ImageView) listItemView.findViewById(R.id.postPicture);
        postPicture.setImageResource(currentfacebook.getImage_content());

        return listItemView;
    }

}

/*public class contentAdapter extends ArrayAdapter<content> {


    public contentAdapter(Context context, int resource) {
        super(context,0, );
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        content currentContent = getItem(position);
        TextView textTextView = (TextView) listItemView.findViewById(R.id.post);

        textTextView.setText(currentContent.getText());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.postImage);
        imageView.setImageResource(currentContent.getImage());
        return listItemView;
}
}
*/