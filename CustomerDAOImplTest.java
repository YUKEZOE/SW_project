package cbsd.lab11.dao;


import cbsd.lab11.entity.Customer;
import junit.framework.TestCase;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by qiyeli on 3/2/14.
 */
public class CustomerDAOImplTest extends TestCase {

    @Test
    public void testGetCustomerByID() throws Exception {
        CustomerDAO dao = mock(CustomerDAO.class);
        Customer customer = new Customer();
        Long i = new Long(1);
        customer.setId(i);
        when(dao.getCustomerByID(i)).thenReturn(customer);
        assertEquals(i, dao.getCustomerByID(i).getId());
        verify(dao).getCustomerByID(i);


    }
    @Test
    public void testAddCustomer() throws Exception {
        CustomerDAO dao = new CustomerDAOImpl();
        Customer customer= new Customer();

        SessionFactory mockedSessionFactory = mock(SessionFactory.class);
        Session mockedSession = mock(Session.class);
        when(mockedSessionFactory.getCurrentSession()).thenReturn(mockedSession);
        when(mockedSession.save(customer)).thenReturn(null);


    }



    @Test
    public void testGetCustomers() throws Exception {
        CustomerDAO dao = mock(CustomerDAO.class);
        List<Customer> customers = new ArrayList<Customer>();
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        customers.add(c1);
        customers.add(c2);
        when(dao.getCustomers()).thenReturn(customers);
        assertEquals(c1,dao.getCustomers().get(1));
        assertEquals(c2,dao.getCustomers().get(2));
        verify(dao).getCustomers();


    }
}
