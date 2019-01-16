package fr.technomage.modele;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class ModeleCrypt {
	
	public static void encrypt(File inputFile) {
		try {
			String path = inputFile.getPath().substring(2, inputFile.getPath().length()-4) + ".tcmr";
			String key = "E4D1FGR7F4AFG684";
			File outputFile = new File(path);
			outputFile.getParentFile().mkdirs();
			outputFile.createNewFile();
			Key secretKey = new SecretKeySpec(key.getBytes(), "AES");
			Cipher cipher;

			cipher = Cipher.getInstance("AES");

			cipher.init(Cipher.ENCRYPT_MODE, secretKey);

			FileInputStream inputStream = new FileInputStream(inputFile);
			byte[] inputBytes = new byte[(int) inputFile.length()];
			inputStream.read(inputBytes);

			byte[] outputBytes = cipher.doFinal(inputBytes);

			FileOutputStream outputStream = new FileOutputStream(outputFile);
			outputStream.write(outputBytes);

			inputStream.close();
			outputStream.close();
		} catch (NoSuchAlgorithmException | 
				NoSuchPaddingException | 
				InvalidKeyException | 
				IOException | 
				IllegalBlockSizeException | 
				BadPaddingException e) {
			e.printStackTrace();
		}
	}

	public static byte[] decrypt(File inputFile) {
		byte[] outputBytes = null;
		try {
			String key = "E4D1FGR7F4AFG684";
			Key secretKey = new SecretKeySpec(key.getBytes(), "AES");
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			FileInputStream inputStream = new FileInputStream(inputFile);
			byte[] inputBytes = new byte[(int) inputFile.length()];
			inputStream.read(inputBytes);
			outputBytes = cipher.doFinal(inputBytes);
			inputStream.close();
		} catch (NoSuchAlgorithmException | 
				NoSuchPaddingException | 
				InvalidKeyException | 
				IOException | 
				IllegalBlockSizeException | 
				BadPaddingException e) {
			e.printStackTrace();
		}
		return outputBytes;
	}
	
	public static Document readDocument(byte[] bytes) {
		Document document = null;
		try {
			SAXReader reader = new SAXReader();
			document = reader.read(new ByteArrayInputStream(bytes));
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return document;
	}

}
