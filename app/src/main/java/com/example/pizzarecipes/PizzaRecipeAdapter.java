package com.example.pizzarecipes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PizzaRecipeAdapter extends RecyclerView.Adapter<PizzaRecipeAdapter.PizzaRecipeViewHolder> {


     ArrayList<PizzaRecipeItem> pizzaRecipeItems;
     Context context;
     public PizzaRecipeAdapter(ArrayList<PizzaRecipeItem> pizzaRecipeItems1,Context context){
         this.pizzaRecipeItems = pizzaRecipeItems1;
         this.context = context;
    }

    @NonNull
    @Override
    public PizzaRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pizza_recyclerview,parent,false);
        PizzaRecipeViewHolder pizzaRecipeViewHolder = new PizzaRecipeViewHolder(view);
        return  pizzaRecipeViewHolder;    }

    @Override
    public void onBindViewHolder(@NonNull PizzaRecipeViewHolder holder, int position) {
         PizzaRecipeItem pizzaRecipeItem = pizzaRecipeItems.get(position);
         holder.image_pizza.setImageResource(pizzaRecipeItem.getImageResource());
         holder.title_image_view.setText(pizzaRecipeItem.getTitle());
         holder.description_image_view.setText(pizzaRecipeItem.getDescription());

    }

    @Override
    public int getItemCount() {
        return pizzaRecipeItems.size();
    }


    public  class PizzaRecipeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView image_pizza;
        public TextView title_image_view;
        public TextView description_image_view;

         public PizzaRecipeViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            image_pizza = itemView.findViewById(R.id.image_pizza);
            title_image_view = itemView.findViewById(R.id.title_image_view);
            description_image_view = itemView.findViewById(R.id.description_image_view);
        }

        @Override
        public void onClick(View view) {
             int position = getAdapterPosition();
             PizzaRecipeItem pizzaRecipeItem = pizzaRecipeItems.get(position);

             Intent intent = new Intent(context,RecipeActivity.class);
             intent.putExtra("imageResourse",pizzaRecipeItem.getImageResource());
             intent.putExtra("title",pizzaRecipeItem.getTitle());
             intent.putExtra("description",pizzaRecipeItem.getDescription());
             intent.putExtra("recipe",pizzaRecipeItem.getRecipe());
             context.startActivity(intent);
        }
    }
}
