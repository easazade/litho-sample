package ir.alirezaeasazade.lithotraining.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;

import ir.alirezaeasazade.lithotraining.specs.ListItem;

public class VerySimpleList extends AppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    ComponentContext context = new ComponentContext(this);
    final Component component = ListItem.create(context).build();

    setContentView(LithoView.create(context, component));
  }
}
