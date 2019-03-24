package com.company;
//package edu.psu.ist;

import java.util.ArrayList;

public class Menu {

    //Class Level Variables - Protect the data
    private int menuId;
    private String menuItem;
    private float menuPrice;

    //Constructor Method
    public Menu(int _menuId, String _menuItem, float _menuPrice){
        this.menuId = _menuId;
        this.menuItem = _menuItem;
        this.menuPrice = _menuPrice;
    }

    //Setters and Getters
    public int getMenuId() { return menuId; }
    public void setMenuId(int _menuId) {this.menuId = _menuId;}

    public String getMenuItem() { return menuItem; }
    public void setMenuItem(String _menuItem) {this.menuItem = _menuItem;}

    public float getMenuPrice() { return menuPrice; }
    public void setMenuPrice(float _menuPrice) {this.menuPrice = _menuPrice;}

    public static void listMenu(ArrayList<Menu> mList){
        for (Menu menu: mList){
            System.out.println(menu.getMenuItem());
        }
    }
}
