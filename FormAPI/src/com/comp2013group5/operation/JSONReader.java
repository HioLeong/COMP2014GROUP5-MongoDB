package com.comp2013group5.operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class JSONReader {

	public String fileToJSONString(String path) throws IOException {
		FileInputStream resourceStream = new FileInputStream(new File(path));
		try {
			FileChannel fc = resourceStream.getChannel();
			MappedByteBuffer bb = fc.map(FileChannel.MapMode.READ_ONLY, 0,
					fc.size());
			return Charset.defaultCharset().decode(bb).toString();

		} finally {
			resourceStream.close();
		}
	}

}
