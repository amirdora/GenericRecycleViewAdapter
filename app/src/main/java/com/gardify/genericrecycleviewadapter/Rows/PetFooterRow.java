package com.gardify.genericrecycleviewadapter.Rows;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.gardify.genericrecycleviewadapter.Model.PetFooter;
import com.gardify.genericrecycleviewadapter.R;
import com.gardify.genericrecycleviewadapter.Utils.RecyclerViewGenericAdapter;


public class PetFooterRow extends LinearLayout implements RecyclerViewGenericAdapter.RecyclerViewRowFooter<PetFooter> {
    private ImageView mImageView;
    private TextView mTitleTextView;

    public PetFooterRow(Context context) {
        super(context);
    }

    public PetFooterRow(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PetFooterRow(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mImageView = (ImageView) findViewById(R.id.pet_imageview);
        mTitleTextView = (TextView) findViewById(R.id.pet_title_textview);
    }

    @Override
    public void showData(PetFooter item) {
        mTitleTextView.setText(item.getFooterName());

    }
}
