package cbsd.lab11.service;

import cbsd.lab11.dao.CustomerDAOImpl;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by qiyeli on 3/1/14.
 */
public class CustomerServiceImplTest extends TestCase {
    CustomerDAOImpl customerDAO =null;

    @Before
    public void setup(){
        customerDAO = new CustomerDAOImpl();
    }


    @Test
    public void testSearchProductByName() throws Exception {
        //assertEquals();

    }

    public void testAddToShoppingCart() throws Exception {

    }

    public void testCheckOut() throws Exception {

    }

    public void testSaveShoppingCart() throws Exception {

    }

    public void testEditProfile() throws Exception {

    }

    public void testRegister() throws Exception {

    }

    public void testGetSaveShoppingCart() throws Exception {

    }

    public void testScanShoppingHistory() throws Exception {

    }

    public void testGetCurrentCustomer() throws Exception {

    }

    public void testScanProducts() throws Exception {

    }
}
