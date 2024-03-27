package com.example.cont;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class MyDao {

    private SQLiteDatabase database;
    private DatabaseHelper dbHelper;

    public MyDao(Context context) {
        dbHelper = new DatabaseHelper(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public long insert(String name, String phoneNumber) {
        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("phone_number", phoneNumber);
        return database.insert("mytable", null, values);
    }

    public List<Contact> getAllContacts() {
        List<Contact> contacts = new ArrayList<>();
        Cursor cursor = database.query("mytable", new String[]{"id", "name", "phone_number"}, null, null, null, null, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            long id = cursor.getLong(0);
            String name = cursor.getString(1);
            String phoneNumber = cursor.getString(2);
            Contact contact = new Contact(id, name, phoneNumber);
            contacts.add(contact);
            cursor.moveToNext();
        }
        cursor.close();
        return contacts;
    }







    public int deleteContact(long id) {
        return database.delete("mytable", "id=?", new String[]{String.valueOf(id)});
    }

    public int editContact(long id, String name, String phoneNumber) {
        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("phone_number", phoneNumber);
        return database.update("mytable", values, "id=?", new String[]{String.valueOf(id)});
    }

    public long addContact(Contact contact) {
        ContentValues values = new ContentValues();
        values.put("name", contact.getName());
        values.put("phone_number", contact.getPhoneNumber());
        return database.insert("mytable", null, values);
    }
}
