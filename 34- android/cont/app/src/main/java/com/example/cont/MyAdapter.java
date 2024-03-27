package com.example.cont;


import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.InputType;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Contact> {

    private LayoutInflater inflater;
    private List<Contact> filteredContacts;
    private List<Contact> originalContacts;

    public MyAdapter(Context context, List<Contact> contacts) {
        super(context, R.layout.item, contacts);
        inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Contact contact = getItem(position);

        holder.nameTextView.setText(contact.getName());
        holder.phoneTextView.setText(contact.getPhoneNumber());

        holder.removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(v.getContext());
                alert.setTitle("Delete?");
                alert.setNegativeButton("no ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MyDao dao = new MyDao(getContext());
                        dao.open();
                        dao.deleteContact(contact.getId());
                        dao.close();
                        // Remove the contact from the list and notify the adapter
                        remove(contact);
                        notifyDataSetChanged();
                    }
                });
                alert.show();
            }
        });

        holder.editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                builder.setTitle("Edit Contact");

                // Create the dialog layout
                LinearLayout layout = new LinearLayout(v.getContext());
                layout.setOrientation(LinearLayout.VERTICAL);

                final EditText nameEditText = new EditText(v.getContext());
                nameEditText.setText(contact.getName());
                layout.addView(nameEditText);

                final EditText phoneEditText = new EditText(v.getContext());
                phoneEditText.setText(contact.getPhoneNumber());
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
                        contact.setName(newName);
                        contact.setPhoneNumber(newPhone);
                        MyDao dao = new MyDao(getContext());
                        dao.open();
                        dao.editContact(contact.getId(),newName,newPhone);
                        dao.close();
                        notifyDataSetChanged();


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

        return convertView;
    }

    private static class ViewHolder {
        private final TextView nameTextView;
        private final TextView phoneTextView;
        private final Button removeButton;
        private final Button editButton;

        ViewHolder(View convertView) {
            nameTextView = convertView.findViewById(R.id.name_text_view);
            phoneTextView = convertView.findViewById(R.id.phone_text_view);
            removeButton = convertView.findViewById(R.id.remove_button);
            editButton = convertView.findViewById(R.id.edit_button);
        }
    }
}
