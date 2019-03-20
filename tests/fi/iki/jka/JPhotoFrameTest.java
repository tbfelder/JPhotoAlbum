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
            void openSlideShow() {
            }

            @Override
            public void setTitle() {
            }
        };

        photoFrame.actionPerformed(new ActionEvent(this, 0, JPhotoMenu.A_SLIDESHOW));

        assertThat(photoFrame.interval, equalTo(5000));
    }
}