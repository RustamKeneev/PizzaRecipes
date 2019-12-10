package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private ArrayList<PizzaRecipeItem> pizzaRecipeItemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizzaRecipeItemArrayList = new ArrayList<>();
        pizzaRecipeItemArrayList.add(new PizzaRecipeItem(R.drawable.pizza_one,
                Utils.PIZZA_ONE_RECIPE_TITLE,
                Utils.PIZZA_ONE_RECIPE_DESCTIPTION,
                Utils.PIZZA_ONE_RECIPE));
        pizzaRecipeItemArrayList.add(new PizzaRecipeItem(R.drawable.pizza_pepperoni,
                Utils.PIZZA_PEPPONI_RECIPE_TITLE,
                Utils.PIZZA_PEPPONI_RECIPE_DESCTIPTION,
                Utils.PIZZA_PEPPONI_RECIPE));
        pizzaRecipeItemArrayList.add(new PizzaRecipeItem(R.drawable.pizza_one,
                Utils.PIZZA_ONE_RECIPE_TITLE,
                Utils.PIZZA_ONE_RECIPE_DESCTIPTION,
                Utils.PIZZA_ONE_RECIPE));
        pizzaRecipeItemArrayList.add(new PizzaRecipeItem(R.drawable.pizza_pepperoni,
                Utils.PIZZA_PEPPONI_RECIPE_TITLE,
                Utils.PIZZA_PEPPONI_RECIPE_DESCTIPTION,
                Utils.PIZZA_PEPPONI_RECIPE));
        pizzaRecipeItemArrayList.add(new PizzaRecipeItem(R.drawable.pizza_one,
                Utils.PIZZA_ONE_RECIPE_TITLE,
                Utils.PIZZA_ONE_RECIPE_DESCTIPTION,
                Utils.PIZZA_ONE_RECIPE));
        pizzaRecipeItemArrayList.add(new PizzaRecipeItem(R.drawable.pizza_pepperoni,
                Utils.PIZZA_PEPPONI_RECIPE_TITLE,
                Utils.PIZZA_PEPPONI_RECIPE_DESCTIPTION,
                Utils.PIZZA_PEPPONI_RECIPE));
        pizzaRecipeItemArrayList.add(new PizzaRecipeItem(R.drawable.pizza_one,
                Utils.PIZZA_ONE_RECIPE_TITLE,
                Utils.PIZZA_ONE_RECIPE_DESCTIPTION,
                Utils.PIZZA_ONE_RECIPE));

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        adapter = new PizzaRecipeAdapter(pizzaRecipeItemArrayList,this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}
