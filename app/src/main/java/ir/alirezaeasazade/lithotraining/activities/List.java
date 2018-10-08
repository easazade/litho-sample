package ir.alirezaeasazade.lithotraining.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.sections.SectionContext;
import com.facebook.litho.sections.widget.RecyclerCollectionComponent;

import ir.alirezaeasazade.lithotraining.specs.ListSection;

public class List extends AppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    final SectionContext context = new SectionContext(this);
    final Component component =
      RecyclerCollectionComponent.create(context)
        .disablePTR(true)
        .section(ListSection.create(context).build())
        .build();

    setContentView(LithoView.create(context,component));

  }
}
