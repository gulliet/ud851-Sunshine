package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jean-marc on 16/12/17.
 */

public class ForecastAdapter
        extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    // completed (15) Add a class file called ForecastAdapter
    // completed (22) Extend RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>

    // completed (23) Create a private string array called mWeatherData
    private String[] mWeatherData;

    // completed (47) Create the default constructor (we will pass in parameters in a later lesson)
    ForecastAdapter() {
    }

    // completed (24) Override onCreateViewHolder
    // completed (25) Within onCreateViewHolder, inflate the list item xml into a view
    // completed (26) Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForecastListItem = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForecastListItem, parent, shouldAttachToParentImmediately);
        ForecastAdapterViewHolder viewHolder = new ForecastAdapterViewHolder(view);
        return viewHolder;
    }

    // completed (27) Override onBindViewHolder
    // completed (28) Set the text of the TextView to the weather for this list item's position
    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {
        //holder.mWeatherTextView.setText(String.valueOf(position));
        holder.mWeatherTextView.setText(mWeatherData[position]);
    }

    // completed (29) Override getItemCount
    // completed (30) Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null
    @Override
    public int getItemCount() {
        if (mWeatherData == null) {
            return 0;
        } else {
            return mWeatherData.length;
        }
    }

    // completed (31) Create a setWeatherData method that saves the weatherData to mWeatherData
    // completed (32) After you save mWeatherData, call notifyDataSetChanged
    public void setWeatherData(String[] weatherData) {
        mWeatherData = weatherData.clone();
        notifyDataSetChanged();
    }

    // completed (16) Create a class within ForecastAdapter called ForecastAdapterViewHolder
    // completed (17) Extend RecyclerView.ViewHolder

    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {

        // completed (18) Create a public final TextView variable called mWeatherTextView
        public final TextView mWeatherTextView;

        // completed (19) Create a constructor for this class that accepts a View as a parameter
        // completed (20) Call super(view) within the constructor for ForecastAdapterViewHolder
        // completed (21) Using view.findViewById, get a reference to this layout's TextView and save it to mWeatherTextView
        ForecastAdapterViewHolder(View view) {
            super(view);
            mWeatherTextView = (TextView) view.findViewById(R.id.tv_weather_data);
        }
    }
}
