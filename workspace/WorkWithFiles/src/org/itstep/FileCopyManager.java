package org.itstep;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyManager {

	public void copyFile(String inputPath, String outPath) {

		File inputFile = new File(inputPath);

		File outFile = new File(outPath);

		try {

			FileInputStream inputStream = new FileInputStream(inputFile);

			BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

			FileOutputStream outputStream = new FileOutputStream(outFile);
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);

			int outputByte;
			while ((outputByte = bufferedInputStream.read()) != -1) {
				bufferedOutputStream.write((char) outputByte);
			}

			bufferedOutputStream.flush();

			bufferedInputStream.close();
			bufferedOutputStream.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
