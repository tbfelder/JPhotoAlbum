package fi.iki.jka;

import org.junit.Test;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.singletonList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class JPhotoFrameTest {
    @Test
    public void showsSlidesWithStandardInterval() throws Exception {
        JPhotoFrame photoFrame = new JPhotoFrame() {
            @Override
            public void setTitle() {
            }
        };

        final List<Integer> slideShowIntervals = new ArrayList<Integer>();
        photoFrame.slideShowViewer = new SlideShowViewer() {
            public void openSlideShow(int interval) {
                slideShowIntervals.add(interval);
            }
        };

        photoFrame.actionPerformed(new ActionEvent(this, 0, JPhotoMenu.A_SLIDESHOW));

        assertThat(slideShowIntervals, equalTo(singletonList(5000)));
    }
}