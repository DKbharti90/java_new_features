package java8feature;

import javax.swing.text.View;
import java.util.List;

@java.lang.FunctionalInterface
public interface RecyclerViewOnClick {

    public abstract void onClick(int position, List<String> list);
}
