package com.allenday.image;

import java.io.File;

import org.junit.Test;

public class ImageProcessorTest {
	ImageProcessor processor = new ImageProcessor();
	
	@Test
	public void test() {
		processor.addFile(new File("src/test/resources/image"));
		processor.processImages();
	}
}
