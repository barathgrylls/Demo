package Practice;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

import org.hibernate.boot.Metadata;

public class ImgMetadata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file= new File("C:\\Users\\bsubra11\\Desktop\\FB_IMG_1590146910070.jpg") ;
		System.out.println(file);
		ImageInputStream imageInputStream = ImageIO.createImageInputStream(file);
		System.out.println(imageInputStream);
		
		//Metadata metadata =
				ImageMetadataReader.readMetadata(imageFile);
 

		ImageReader imageReader; 
	}

}
