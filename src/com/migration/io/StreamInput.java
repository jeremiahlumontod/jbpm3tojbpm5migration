// StreamInput.java
// This file contains generated code and will be overwritten when you rerun code generation.package com.migration.io;

package com.migration.io;

import java.io.InputStream;

public class StreamInput extends Input
{
	private InputStream stream;
	
	public StreamInput (InputStream stream)
	{
		super(Input.IO_STREAM);
		this.stream = stream;
	}
	
	public InputStream getStream() {return stream;}
	public void close() throws Exception {stream.close();}
}
