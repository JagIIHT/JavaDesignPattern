package com.dp.creational.factorypattern;

public class FileReaderFactory {

	public FileReader getReader(String reader) {
		if (reader == null) {
			return null;
		} else if (reader.equals("XML")) {
			return new XMLFileReader();
		} else if (reader.equals("CSV")) {
			return new CSVFileReader();
		}
		return null;
	}
}
