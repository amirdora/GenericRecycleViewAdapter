package com.gardify.genericrecycleviewadapter;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import com.gardify.genericrecycleviewadapter.Utils.RecyclerViewGenericAdapter;


public class PetRow extends LinearLayout implements RecyclerViewGenericAdapter.RecyclerViewRow<Pet> {
    private ImageView mImageView;
    private TextView mTitleTextView;

    public PetRow(Context context) {
        super(context);
    }

    public PetRow(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PetRow(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mImageView = (ImageView) findViewById(R.id.pet_imageview);
        mTitleTextView = (TextView) findViewById(R.id.pet_title_textview);
    }

    @Override
    public void showData(Pet item) {
        mTitleTextView.setText(item.getName());
        //Picasso.with(getContext()).load(pet.getUrl()).into(mImageView);
    }

}
