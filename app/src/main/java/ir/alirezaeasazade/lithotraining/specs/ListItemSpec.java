package ir.alirezaeasazade.lithotraining.specs;

import android.graphics.Color;

import com.facebook.litho.Column;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.widget.Text;
import com.facebook.yoga.YogaEdge;

import static com.facebook.yoga.YogaEdge.ALL;

@LayoutSpec
public class ListItemSpec {

  @OnCreateLayout
  static Component onCreateLayout(ComponentContext c) {

    return Column.create(c)
      .paddingDip(ALL, 16)
      .backgroundColor(Color.WHITE)
      .child(
        Text.create(c)
          .text("First Item ")
          .textSizeSp(40))
      .child(
        Text.create(c)
          .backgroundColor(Color.LTGRAY)
          .paddingDip(YogaEdge.HORIZONTAL, 16)
          .text("Second Item")
          .textSizeSp(20))
      .build();
  }


}
