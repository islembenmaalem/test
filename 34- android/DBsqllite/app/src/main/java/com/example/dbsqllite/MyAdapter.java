package com.example.dbsqllite;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<Item> contactList;

    public MyAdapter(List<Item> contactList) {
        this.contactList = contactList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Item contactItem = contactList.get(position);

        holder.contactName.setText(contactItem.getName());
        holder.contactPhone.setText(contactItem.getPhone());









        holder.editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                builder.setTitle("Edit Contact");

                // Create the dialog layout
                LinearLayout layout = new LinearLayout(v.getContext());
                layout.setOrientation(LinearLayout.VERTICAL);

                final EditText nameEditText = new EditText(v.getContext());
                nameEditText.setText(contactItem.getName());
                layout.addView(nameEditText);



                final EditText phoneEditText = new EditText(v.getContext());
                phoneEditText.setText(contactItem.getPhone());
                phoneEditText.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
                layout.addView(phoneEditText);




                builder.setView(layout);

                // Add OK and Cancel buttons to the dialog
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String newName = nameEditText.getText().toString();
                        String newPhone = phoneEditText.getText().toString();

                        // Update the ContactItem object
                        contactItem.setName(newName);
                        contactItem.setPhone(newPhone);

                        // Notify the adapter that the data has changed
                        notifyItemChanged(position);
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing
                    }
                });

                // Show the dialog
                builder.show();

            }
        });

        holder.removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(v.getContext());
                alert.setTitle("Delete process");
                alert.setMessage("are you sure you want to delete this contact");
                alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing
                    }
                });
                alert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        contactList.remove(position);
                        notifyDataSetChanged();


                    }
                });
                alert.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }}