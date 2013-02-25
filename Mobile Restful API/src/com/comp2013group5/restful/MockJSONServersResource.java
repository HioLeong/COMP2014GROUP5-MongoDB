package com.comp2013group5.restful;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class MockJSONServersResource extends ServerResource {

	@Get
	public String represent() {
		return getMockJSONString();
	}

	public String getMockJSONString() {
		try {
			FileInputStream resourceStream = new FileInputStream(new File(
					"/folder/example-form.json"));
			try {
				FileChannel fc = resourceStream.getChannel();
				MappedByteBuffer bb = fc.map(FileChannel.MapMode.READ_ONLY, 0,
						fc.size());
				return Charset.defaultCharset().decode(bb).toString();

			} finally {
				resourceStream.close();
			}
		} catch (IOException e) {
			return "Null";
		}
	}
}
