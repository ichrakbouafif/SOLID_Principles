package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.util.Base64;


public class EncodingModule
{
    private IDataReader dataReader;
    private IDataWriter dataWriter;

    public EncodingModule(IDataReader dataReader, IDataWriter dataWriter) {
        this.dataReader = dataReader;
        this.dataWriter = dataWriter;
    }

    public void encode() throws IOException
    {
        String data = dataReader.read();
        String encodedData = Base64.getEncoder().encodeToString(data.getBytes());
        dataWriter.write(encodedData);
    }
}

