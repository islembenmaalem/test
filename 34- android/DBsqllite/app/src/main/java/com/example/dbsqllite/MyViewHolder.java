package com.example.dbsqllite;
import androidx.recyclerview.widget.RecyclerView;



import android.view.View;
import android.widget.*;

public class MyViewHolder extends RecyclerView.ViewHolder {

    public TextView contactName;
    public TextView contactPhone;
    public Button editButton;
    public Button removeButton;
    public Button addButton;

    public MyViewHolder(View itemView) {
        super(itemView);

        contactName = itemView.findViewById(R.id.contact_name);
        contactPhone = itemView.findViewById(R.id.contact_phone);
        editButton = itemView.findViewById(R.id.edit_button);
        removeButton = itemView.findViewById(R.id.remove_button);
        addButton = itemView.findViewById(R.id.addButton);
    }
}





