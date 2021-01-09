package com.example.binusezyfoody;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {
    private String[] names;
    private int[] prices;
    private int[] stocks;
    private int[] imageIDs;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
        }
    }

    public CaptionedImagesAdapter(String[] names, int[] prices, int[] stocks, int[] imageIDs) {
        this.names = names;
        this.prices = prices;
        this.stocks = stocks;
        this.imageIDs = imageIDs;
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    @Override
    public CaptionedImagesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_drinks, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position){
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView)cardView.findViewById(R.id.photo);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), imageIDs[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(names[position]);
        TextView nameView = (TextView)cardView.findViewById(R.id.name);
        nameView.setText(names[position]);
        TextView priceView = (TextView)cardView.findViewById(R.id.price);
        priceView.setText(prices[position]);
        TextView stockView = (TextView)cardView.findViewById(R.id.stock);
        stockView.setText(stocks[position]);
//        cardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(listener != null){
//                    listener.onClick(position);
//                }
//            }
//        });
    }
}