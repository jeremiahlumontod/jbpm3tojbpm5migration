// FileOutput.java
// This file contains generated code and will be overwritten when you rerun code generation.package com.migration.io;

package com.migration.io;

import java.io.FileOutputStream;

public class FileOutput extends StreamOutput 
{
	private String filename;
	
	public FileOutput(String filename) throws Exception
	{
		super (new FileOutputStream(filename, false));
		this.filename = filename;
	}
	
	public String getFilename() {return filename;}
	public void close() throws Exception {getStream().close();}
}
