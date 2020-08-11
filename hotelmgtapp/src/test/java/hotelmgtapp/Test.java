package hotelmgtapp;

import java.lang.reflect.Executable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import dao.GuestDao;
import dao.GuestStore;
import entities.Guest;
import exceptions.GuestNotFoundException;
import service.ServiceDaoImpl;
import  org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.*;
public class Test {

    ServiceDaoImpl service;
    @BeforeEach
    public void beforeEach()
    {

        service=new ServiceDaoImpl();
    }
    @AfterEach
    public void clear()
    {
        Map<String,Guest>guestMap= GuestStore.getGuestStore();
        guestMap.clear();
    }

    @Test
    public void test1()
    {
        Executable executable=()->service.register(null);
        Assertions.assertThrows(NullException.class,executable);
    }
    @Test
    public void findId()
    {
        int id=101;
        Executable executable=()->service.findbyId(id+"");
        Assertions.assertThrows(GuestNotFoundException.class,executable);
    }

    @Test
    public void mainTest()
    {
        Guest guest1=new Guest("chinni","101");
        Guest guest2=new Guest("siri","102");
        service.Register(guest1);
        service.Register(guest2);
        String preid=guest1.getId();
        Map<String,Guest>guestMap=GuestStore.getGuestStore();
        Collection<Guest>guestCollection=guestMap.values();
        int size=guestMap.size();
        System.out.println(size);
        Assertions.assertEquals(0,size);   
        String name=guest1.getName();
        Iterator<Guest> iterator=guestCollection.iterator();
        Guest gueststore=iterator.next();
        String storeid=guest1.getId();
        String actualid=gueststore.getId();
        Assertions.assertEquals(actualid,preid);
    }


}