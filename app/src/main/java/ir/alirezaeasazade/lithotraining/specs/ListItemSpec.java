package ir.alirezaeasazade.lithotraining.specs;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;

import com.facebook.litho.Column;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.widget.Text;
import com.facebook.yoga.YogaEdge;

import ir.alirezaeasazade.lithotraining.R;

import static com.facebook.yoga.YogaEdge.ALL;

@LayoutSpec
public class ListItemSpec {

  @OnCreateLayout
  static Component onCreateLayout(
    ComponentContext c,
    @Prop int color,
    @Prop String title,
    @Prop String subtitle
  ) {

    return Column.create(c)
      .paddingDip(ALL, 16)
      .backgroundColor(color)
      .child(
        Text.create(c)
          .text(title)
          .textSizeSp(40))
      .child(
        Text.create(c)
          .backgroundColor(ContextCompat.getColor(c, R.color.colorAccent))
          .paddingDip(YogaEdge.HORIZONTAL, 16)
          .text(subtitle)
          .textSizeSp(20))
      .build();
  }


}
