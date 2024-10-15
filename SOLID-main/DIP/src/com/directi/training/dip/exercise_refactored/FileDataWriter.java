package com.directi.training.dip.exercise_refactored;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class FileDataWriter implements IDataWriter {
    private String filePath;

    public FileDataWriter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(String encodedData) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.write(encodedData);
        writer.close();
    }
}
