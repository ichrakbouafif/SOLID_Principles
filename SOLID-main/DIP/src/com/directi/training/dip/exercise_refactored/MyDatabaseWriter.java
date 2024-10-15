package com.directi.training.dip.exercise_refactored;

import com.directi.training.dip.exercise.MyDatabase;

public class MyDatabaseWriter implements IDataWriter {
    private MyDatabase database;

    public MyDatabaseWriter(MyDatabase database) {
        this.database = database;
    }

    @Override
    public void write(String encodedData) {
        database.write(encodedData);
    }
}
