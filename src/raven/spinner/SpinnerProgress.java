package raven.spinner;

import javax.swing.JProgressBar;

/**
 *
 * @author Raven
 */
public class SpinnerProgress extends JProgressBar {

    public SpinnerProgress() {
        init();
    }

    private void init() {
        setUI(new SpinnerProgressUI());
    }
}
