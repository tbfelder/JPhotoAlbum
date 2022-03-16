package fi.iki.jka;

import org.junit.Test;

import java.awt.event.ActionEvent;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class JPhotoFrameTest {
    @Test
    public void testActionPerformed() throws Exception {
        //ActionEvent event = new ActionEvent(A_SLIDESHOW);
        JPhotoCollection jPhotoCollection = new JPhotoCollection();
        JPhotoFrame jPhotoFrame = new JPhotoFrame() {
            @Override
            public void setTitle() {
            }
        };

        jPhotoFrame.photos = new JPhotoCollection();
        jPhotoFrame.photos.photos.add(new JPhoto());

        jPhotoFrame.actionPerformed(
                new ActionEvent(0, 0, JPhotoMenu.A_SLIDESHOW)
        );
        assertThat(jPhotoFrame.mostRecentInterval, equalTo(5000));
        System.out.println("1. Test");
        jPhotoFrame.actionPerformed(
                new ActionEvent(0, 0, JPhotoMenu.A_PREVIEW_SLIDESHOW)
        );
        assertThat(jPhotoFrame.mostRecentInterval, equalTo(1000));
        System.out.println("2. Test");

    }
}