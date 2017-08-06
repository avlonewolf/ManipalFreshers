package manipal.freshers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
//import android.widget.ImageView;

public class MySimpleArrayAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values1,values2,values3,values4;
    int []imageArray={R.drawable.ankit,R.drawable.kunal,R.drawable.vijeet};

    public MySimpleArrayAdapter(Context context, String[] values1, String[] values2, String[] values3,String[] values4 ) {
        super(context, -1, values1);
        this.context = context;
        this.values1 = values1;
        this.values2 = values2;
        this.values3 = values3;
        this.values4 = values4;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.layout2, parent, false);
        TextView t1 = (TextView) rowView.findViewById(R.id.textView1);
        TextView t2 = (TextView) rowView.findViewById(R.id.textView2);
        TextView t3 = (TextView) rowView.findViewById(R.id.textView3);
        TextView t4 = (TextView) rowView.findViewById(R.id.textView4);
        ImageView i1 = (ImageView) rowView.findViewById(R.id.imageView1);
        t1.setText(values1[position]);
        // change the icon for Windows and iPhone
        t2.setText(values2[position]);
        t3.setText("Phone : " + values3[position]);
        t4.setText("Email : " + values4[position]);
        i1.setImageResource(imageArray[position]);

        return rowView;
    }
} 

