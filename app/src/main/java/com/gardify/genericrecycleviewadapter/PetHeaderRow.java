package com.gardify.genericrecycleviewadapter;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.gardify.genericrecycleviewadapter.Utils.RecyclerViewGenericAdapter;


public class PetHeaderRow extends LinearLayout implements RecyclerViewGenericAdapter.RecyclerViewRowHeader<PetHeader> {
    private ImageView mImageView;
    private TextView mTitleTextView;

    public PetHeaderRow(Context context) {
        super(context);
    }

    public PetHeaderRow(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PetHeaderRow(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mImageView = (ImageView) findViewById(R.id.pet_imageview);
        mTitleTextView = (TextView) findViewById(R.id.pet_title_textview);
    }

    @Override
    public void showData(PetHeader item) {

    }
}
