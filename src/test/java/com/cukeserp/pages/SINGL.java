package com.cukeserp.pages;

public class SINGL {


    private static SINGL ourInstance = new SINGL ( );

    public static SINGL getInstance ( ) {
        return ourInstance;



    }

    private SINGL ( ) {
    }
}
