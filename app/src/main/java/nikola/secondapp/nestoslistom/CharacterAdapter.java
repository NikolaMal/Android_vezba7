package nikola.secondapp.nestoslistom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 27.3.2018.
 */

public class CharacterAdapter extends BaseAdapter {

    private Context aContext;
    private ArrayList<ListClass> aCharacters;

    public CharacterAdapter(Context context){
        aContext = context;
        aCharacters = new ArrayList<ListClass>();

    }

    public void addCharacter (ListClass character){
        aCharacters.add(character);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return aCharacters.size();
    }

    @Override
    public Object getItem(int i) {
        Object obj = null;
        try{
            obj = aCharacters.get(i);

        }

        catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public long getItemId(int i) {


        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View view = convertView;

        if(view == null){
            LayoutInflater inflater = (LayoutInflater) aContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.row_item, null);
            ViewHolder holder = new ViewHolder();
            holder.image = (ImageView) convertView.findViewById(R.id.picture);
            holder.name = (TextView) convertView.findViewById(R.id.someText);
            convertView.setTag(holder);

        }

        ListClass character = (ListClass) getItem(i);
        ViewHolder holder = (ViewHolder) convertView.getTag();
        holder.image.setImageDrawable(character.picture);
        holder.name.setText(character.name);

        return convertView;
    }

    private class ViewHolder {
        public ImageView image = null;
        public TextView name = null;
    }
}
