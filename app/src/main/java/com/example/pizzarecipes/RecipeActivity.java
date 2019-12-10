package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    private ImageView pizza_image_view;
    private TextView title_textView;
    private TextView text_recipe_pizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        pizza_image_view = findViewById(R.id.pizza_image_view);
        title_textView = findViewById(R.id.title_textView);
        text_recipe_pizza = findViewById(R.id.text_recipe_pizza);

        Intent intent = getIntent();
        if (intent !=null){
            int image_link = getIntent().getIntExtra("imageResourse",R.drawable.ic_launcher_background);
            pizza_image_view.setImageResource(image_link);
            title_textView.setText(intent.getStringExtra("title"));
            text_recipe_pizza.setText(intent.getStringExtra("recipe"));
        }
    }
}
