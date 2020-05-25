package com.grandi.bambino.materialdesinghomework4.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.grandi.bambino.materialdesinghomework4.R;
import com.grandi.bambino.materialdesinghomework4.model.Audi;

import java.util.List;

public class AdapterRVCars extends RecyclerView.Adapter<AdapterRVCars.ViewHolder> {

    private List<Audi> cars;
    private Context context;

    public AdapterRVCars(Context context, List<Audi> cars){
        this.context = context;
        this.cars = cars;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_cars, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Audi car = cars.get(position);
        holder.bind(car);
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageCar;
        private TextView descriptionCar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageCar = itemView.findViewById(R.id.photo_car);
            descriptionCar = itemView.findViewById(R.id.description_car);
        }

        public void bind (Audi car){
            imageCar.setImageDrawable(car.getImageCar());
            descriptionCar.setText(car.getText());
        }


    }
}
