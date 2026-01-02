package avAplicacion11_17;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MyObjectOutputStream extends ObjectOutputStream{

    private static boolean isExist;
	
    public MyObjectOutputStream(String path) throws IOException {
    	
        super(createFile(path));
    
    }

	private static FileOutputStream createFile(String path) throws IOException {
		
        if(new File(path).exists())
            isExist = true;
        return new FileOutputStream(path, true);
        
    }
	
	@Override
    protected void writeStreamHeader() throws IOException {
		
        if(!isExist)
            super.writeStreamHeader();
        
    }
	
}
