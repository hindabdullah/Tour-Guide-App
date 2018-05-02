package com.example.android.theguidesaudi;

/**
 * Created by hind on 11/01/18.
 */

public class Tour {
    private int mImageResourceID;
    /** Title of the item (all categories) */
    private int mTitle;
    /** Phone number for the item (restaurants, guided tours) */
    private int mPhoneNumber = NO_PHONE_NUMBER_PROVIDED;

    /** Address for the item (all categories) */
    private int mAddress;

    private static final int NO_PHONE_NUMBER_PROVIDED = -1;


    public Tour(int imageResourceID, int title, int address){
        mImageResourceID = imageResourceID;
        mTitle = title;
        mAddress = address;
    }
    public Tour(int imageResourceID, int title, int phoneNumber,
                int address){
        mImageResourceID = imageResourceID;
        mTitle = title;
        mPhoneNumber = phoneNumber;
        mAddress = address;
    }
    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public int getmTitle() {
        return mTitle;
    }

    public int getmPhoneNumber() {
        return mPhoneNumber;
    }

    public int getmAddress() {
        return mAddress;
    }

    public boolean hasPhoneNumber() {
        return mPhoneNumber != NO_PHONE_NUMBER_PROVIDED;
    }}