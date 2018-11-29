package com.musala.javacourse181112.tasks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilterInputStreamCounterBonus extends FilterInputStream {
    private int count;

    protected FilterInputStreamCounterBonus(InputStream in){
        super (in);
    }

    public int getCount() {
        return this.count;
    }

    @Override
    public int read() throws IOException{
        this.count++;
        return super.read();
    }
}
