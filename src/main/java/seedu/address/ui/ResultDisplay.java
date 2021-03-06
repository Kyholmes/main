package seedu.address.ui;

import java.util.logging.Logger;

import com.google.common.eventbus.Subscribe;

import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Region;
import seedu.address.commons.core.LogsCenter;
import seedu.address.commons.events.ui.NewResultAvailableEvent;

/**
 * A ui for the status bar that is displayed at the header of the application.
 */
public class ResultDisplay extends UiPart<Region> {

    public static final String ERROR_STYLE_CLASS = "error";

    private static final Logger logger = LogsCenter.getLogger(ResultDisplay.class);
    private static final String FXML = "ResultDisplay.fxml";

    private final StringProperty displayed = new SimpleStringProperty("");

    @FXML
    private TextArea resultDisplay;

    public ResultDisplay() {
        super(FXML);
        resultDisplay.textProperty().bind(displayed);
        registerAsAnEventHandler(this);
    }

    @Subscribe
    private void handleNewResultAvailableEvent(NewResultAvailableEvent event) {
        logger.info(LogsCenter.getEventHandlingLogMessage(event));

        setTextMessageColor(event.isError);

        Platform.runLater(() -> displayed.setValue(event.message));
    }

    /**
     * change text message color based on whether the message is an error message
     * @param isError
     */
    private void setTextMessageColor(boolean isError) {
        if (isError) {
            resultDisplay.getStyleClass().add(ERROR_STYLE_CLASS);
        } else {
            resultDisplay.getStyleClass().remove(ERROR_STYLE_CLASS);
        }
    }
}
