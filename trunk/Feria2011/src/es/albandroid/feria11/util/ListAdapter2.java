package es.albandroid.feria11.util;

import java.util.List;
import java.util.Map;

import es.albandroid.feria11.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class ListAdapter2 extends SimpleAdapter{
	Context c;
	public ListAdapter2(Context context, List<? extends Map<String, ?>> data,
			int resource, String[] from, int[] to) {
		super(context, data, resource, from, to);
		c=context;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
	  View view = super.getView(position, convertView, parent);
	  TextView text=(TextView) view.findViewById(R.id.nombre);
	  text.setTypeface(Fuentes.get(c, 1));
	  TextView text2=(TextView) view.findViewById(R.id.desc1);
	  text2.setTypeface(Fuentes.get(c, 3));
	  TextView text3=(TextView) view.findViewById(R.id.hora);
	  text3.setTypeface(Fuentes.get(c, 1));
	  TextView text4=(TextView) view.findViewById(R.id.fecha);
	  text4.setTypeface(Fuentes.get(c, 1));
	  return view;
	}

}
