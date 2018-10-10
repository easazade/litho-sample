package ir.alirezaeasazade.lithotraining.specs;


import android.graphics.Color;

import com.facebook.litho.sections.Children;
import com.facebook.litho.sections.SectionContext;
import com.facebook.litho.sections.annotations.GroupSectionSpec;
import com.facebook.litho.sections.annotations.OnCreateChildren;
import com.facebook.litho.sections.common.SingleComponentSection;

@GroupSectionSpec
public class ListSectionSpec {

  @OnCreateChildren
  static Children onCreateChildren(final SectionContext context) {

    Children.Builder builder = Children.create();
    for (int i = 0; i < 32; i++) {
      builder.child(
        SingleComponentSection.create(context)
          .key(String.valueOf(i))
          .component(
            ListItem.create(context)
            .color(i % 2 == 0 ? Color.WHITE : Color.LTGRAY)
            .title("item "+(i+1))
            .subtitle("Litho training")
          )
          .build()
      );
    }
    return builder.build();
  }


}
