package dev.normlanguage.ui.desktop;

import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.util.Objects;

public final class WindowIcons {
    private WindowIcons() {}

    public static void apply(Stage stage) {
        if (!stage.getIcons().isEmpty()) return;
        for (var size : new int[]{16, 32, 64, 128}) {
            var resource = Objects.requireNonNull(WindowIcons.class.getResource("norm-" + size + ".png"));
            stage.getIcons().add(new Image(resource.toExternalForm()));
        }
    }
}
