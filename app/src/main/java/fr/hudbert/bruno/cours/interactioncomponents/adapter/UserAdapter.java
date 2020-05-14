package fr.hudbert.bruno.cours.interactioncomponents.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import fr.hudbert.bruno.cours.R;
import fr.hudbert.bruno.cours.common.bo.User;

public class UserAdapter extends ArrayAdapter<User> {

    private int idPresentationLign;

    public UserAdapter(@NonNull Context context, int resource, @NonNull List<User> objects) {
        super(context, resource, objects);
        idPresentationLign = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View lignView = inflater.inflate(idPresentationLign,parent,false);
        TextView tvLabel = lignView.findViewById(R.id.labellistelement);
        TextView tvValue = lignView.findViewById(R.id.valuelistelement);

        User user = getItem(position);
        tvLabel.setText(user.getFirstname());
        tvValue.setText(user.getName());

        return lignView;
    }
}
