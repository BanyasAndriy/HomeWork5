package HomeWork4;

import java.io.File;
import java.io.FileFilter;
import java.util.Formattable;
import java.util.Formatter;

public class MyFileFilter implements FileFilter{

	String arr[];
    public MyFileFilter(String...arr) {
    	this.arr=arr;
    }
	
    private boolean check(String ext) {
		
    	for (String stringExt : arr) {
    		if(stringExt.equals(ext)) {
    			return true;
    		}
		}
    	
    	return false;
    	
    }
	
	@Override
	public boolean accept(File pathname) {
		
		int pointerIndex = pathname.getName().lastIndexOf(".");
		if(pointerIndex==-1) {
			return false;
		}
		String ext = pathname.getName().substring(pointerIndex+1);
		return check(ext);
	}

	
}
