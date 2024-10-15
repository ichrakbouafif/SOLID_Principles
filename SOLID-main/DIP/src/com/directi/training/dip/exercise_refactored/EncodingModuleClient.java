package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.net.URL;

import com.directi.training.dip.exercise.MyDatabase;


public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        IDataReader fileReader = new FileDataReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        IDataWriter fileWriter = new FileDataWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        EncodingModule fileEncodingModule = new EncodingModule(fileReader, fileWriter);
        fileEncodingModule.encode();

        URL url = new URL("http", "myfirstappwith.appspot.com", "/index.html");
        IDataReader urlReader = new URLDataReader(url);
        IDataWriter dbWriter = new MyDatabaseWriter(new MyDatabase());
        EncodingModule networkEncodingModule = new EncodingModule(urlReader, dbWriter);
        networkEncodingModule.encode();
    }
}
