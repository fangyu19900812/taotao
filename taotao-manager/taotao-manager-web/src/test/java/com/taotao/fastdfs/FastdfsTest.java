package com.taotao.fastdfs;

import java.io.IOException;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;

public class FastdfsTest {
	@Test
	public void testUpload() throws Exception{
		
		ClientGlobal.init("F:\\workspace\\taotao\\taotao-manager\\taotao-manager-web\\src\\main\\resources\\properties\\client.conf");
		TrackerClient trackerClient = new TrackerClient();
		TrackerServer trackerServer = trackerClient.getConnection();
	
		StorageServer storageServer = null;
		StorageClient storageClient = new StorageClient(trackerServer, storageServer);
		
		String[] string = storageClient.upload_file("F:\\桌面\\biaoqingbao\\215d5.gif", "gif", null);
		for(String s:string){
			System.out.println(s);
		}
		
		
	}
}	
