package raveen.myapplication4.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Raveen on 4/19/2015.
 */
public class MyAdapter extends ArrayAdapter {
    public MyAdapter(Context context, ArrayList<Venue> arrayList) {
        super(context,0,arrayList);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Venue venue = (Venue)getItem(position);
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        TextView title = (TextView)convertView.findViewById(R.id.tv_title);
        TextView description = (TextView)convertView.findViewById(R.id.tv_description);

        title.setText(venue.name);
        description.setText(venue.description);

        return convertView;
    }
}
