package dao;

import entities.Guest;

import java.util.*;

public class GuestStore {
    private static Map<String, Guest>store=new HashMap<>();
    public static Map<String,Guest>getGuestStore()
    {
        return store;
    }
}
