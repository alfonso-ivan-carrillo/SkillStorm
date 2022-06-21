package com.codeup.skillstorm;

import java.util.concurrent.ExecutionException;
import java.util.zip.DataFormatException;

public class MultiCatch {


    static void process() throws DataFormatException, ExecutionException{
        // code
    }

    public static void main(String[] args) {
        try{
            process();
            // specialized exception first then more general, if general is used first, it will cause for some code to be unreachable
        } catch (ExecutionException | DataFormatException e){}
//            catch (DataFormatException e){}
//            same code as above but cleaner
        {

        }
    }

}
