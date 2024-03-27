package com.example.revisionexemen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MonAdapter extends RecyclerView.Adapter<MonAdapter.MonViewHolder> {

    private List<Element> mListeElements;

    public class MonViewHolder extends RecyclerView.ViewHolder {

        public TextView mTextView1;
        public TextView mTextView2;


        public MonViewHolder(View itemView) {
            super(itemView);
            mTextView1 = itemView.findViewById(R.id.textView);
            mTextView2 = itemView.findViewById(R.id.textView2);
        }
    }

    public MonAdapter(List<Element> listeElements) {
        mListeElements = listeElements;
    }

    @Override
    public MonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_element, parent, false);

        return new MonViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MonViewHolder holder, int position) {
        Element element = mListeElements.get(position);
        holder.mTextView1.setText(element.getText1());
        holder.mTextView2.setText(element.getText2());





    }

    @Override
    public int getItemCount() {
        return mListeElements.size();
    }
}
