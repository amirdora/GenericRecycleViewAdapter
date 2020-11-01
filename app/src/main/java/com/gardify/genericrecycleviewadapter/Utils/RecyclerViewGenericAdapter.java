package com.gardify.genericrecycleviewadapter.Utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * @param <T>
 */
public class RecyclerViewGenericAdapter<T> extends RecyclerView.Adapter<RecyclerViewGenericAdapter.ViewHolder> {
    private ArrayList<T> mDataset;
    private OnRecyclerViewItemClickListener<T> onRecyclerViewItemClickListener;
    private int layoutId;

    public RecyclerViewGenericAdapter(ArrayList<T> measurements, OnRecyclerViewItemClickListener<T> onRecyclerViewItemClickListener, int layoutId) {
        this.onRecyclerViewItemClickListener = onRecyclerViewItemClickListener;
        this.mDataset = measurements;
        this.layoutId = layoutId;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerViewRow<T> row = (RecyclerViewRow<T>) LayoutInflater.from(parent.getContext()).inflate(layoutId, parent, false);
        ViewHolder vh = new ViewHolder(row);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.mRow.showData(mDataset.get(position));
        ((View) holder.mRow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onRecyclerViewItemClickListener != null) {
                    onRecyclerViewItemClickListener.onItemClick(mDataset.get(position));
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public RecyclerViewRow mRow;

        public ViewHolder(RecyclerViewRow itemView) {
            super((View) itemView);
            mRow = itemView;
        }
    }

    public interface RecyclerViewRow<T> {
        void showData(T item);
    }

    public interface OnRecyclerViewItemClickListener<T> {
        void onItemClick(T position);
    }

}
