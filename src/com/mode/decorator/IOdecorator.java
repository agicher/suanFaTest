package com.mode.decorator;

import java.io.*;

public class IOdecorator {

    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("/user/wangzheng/test.txt");
        InputStream bin = new BufferedInputStream(in);
        byte[] data = new byte[128];

        DataInputStream din = new DataInputStream(bin);

    }

    public IOdecorator() throws FileNotFoundException {
    }
}
