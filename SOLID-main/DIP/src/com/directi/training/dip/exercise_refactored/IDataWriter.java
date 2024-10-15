package com.directi.training.dip.exercise_refactored;

import java.io.IOException;


public interface IDataWriter {
    void write(String encodedData) throws IOException;
}
