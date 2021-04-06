import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDropTest {

    @Test
    void dragAndDrop() {
        
        //перейти на сайт the-internet.herokuapp.com
        open("https://the-internet.herokuapp.com/drag_and_drop");
        
        //перенести прямоугольник А на место прямоугольника В
        $("#column-a").dragAndDropTo("#column-b");
        
        // проверить, что прямоугольник В стоит на месте прямоугольника А
        $("#column-b").shouldHave(Condition.text("A"));
    }
}
