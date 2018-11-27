package com.musala.javacourse181112.tasks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyFilterInputStream extends FilterInputStream {

    private int count;

    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected MyFilterInputStream(InputStream in) {
        super(in);
    }

    public int getCount() {
        return this.count;
    }

    @Override
    public int read() throws IOException {
        this.count++;
        return super.read();
    }
}
