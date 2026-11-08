package dev.normlanguage.ui.desktop;

import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WindowIconsTest extends FxTest {
    @Test void loadsNormIconsWithoutOverwritingApplicationIcons() throws Exception {
        fx(() -> {
            var stage = new Stage();
            WindowIcons.apply(stage);
            assertEquals(4, stage.getIcons().size());
            assertTrue(stage.getIcons().stream().allMatch(image -> !image.isError() && image.getWidth() > 0));
            var first = stage.getIcons().getFirst();
            WindowIcons.apply(stage);
            assertEquals(4, stage.getIcons().size());
            assertSame(first, stage.getIcons().getFirst());
        });
    }
}
