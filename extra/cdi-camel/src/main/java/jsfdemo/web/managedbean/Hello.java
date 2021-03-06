package jsfdemo.web.managedbean;

import java.io.File;

import javax.faces.bean.ManagedBean;

/**
 * A test bean for testing JSF page.
 * 
 * @author zedeng
 *
 */
@ManagedBean
public class Hello {
	private String world = "Hello World!";
	
	public String getWorld() {
		return world;
	}

	File dir = new File(".");
	public File getDir() {
		return dir;
	}
	public File[] getFiles() {
		return dir.listFiles();
	}
}
