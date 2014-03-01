package cbsd.lab11.service;

import cbsd.lab11.dao.ImageDAO;
import cbsd.lab11.entity.Image;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by qiyeli on 3/2/14.
 */
public class ImageServiceImplTest extends TestCase {

    @Test
    public void testGet() throws Exception {
        ImageDAO imageDAO = mock(ImageDAO.class);
        Image image = new Image();
        image.setId(1);
        when(imageDAO.get(1)).thenReturn(image);
        assertEquals(image.getId(),imageDAO.get(1).getId());
        verify(imageDAO).get(1);

    }

    @Test
    public void testTransfer() throws Exception {
        ImageDAO imageDAO = mock(ImageDAO.class);
        MultipartFile file   = new MultipartFile() {
            @Override
            public String getName() {
                return null;
            }

            @Override
            public String getOriginalFilename() {
                return null;
            }

            @Override
            public String getContentType() {
                return "jpg";
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public long getSize() {
                return 0;
            }

            @Override
            public byte[] getBytes() throws IOException {
                return new byte[0];
            }

            @Override
            public InputStream getInputStream() throws IOException {
                return null;
            }

            @Override
            public void transferTo(File file) throws IOException, IllegalStateException {

            }
        };

        Image image = new Image();
        image.setContentType("jpg");
        when(imageDAO.transfer(file)).thenReturn(image);
        assertEquals(image.getContentType(),imageDAO.transfer(file).getContentType());
        verify(imageDAO).transfer(file);
    }


}
