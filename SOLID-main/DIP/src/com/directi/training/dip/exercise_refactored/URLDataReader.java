package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLDataReader implements IDataReader {
    private URL url;

    public URLDataReader(URL url) {
        this.url = url;
    }

    @Override
    public String read() throws IOException {
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder content = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            content.append((char) c);
        }
        reader.close();
        return content.toString();
    }
}
