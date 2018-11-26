package com.alphonse.accountmanage.serviceImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.alphonse.accountmanage.service.FileService;
@Service(value ="fileService")

public class FileServiceImpl implements FileService{

	
	private static final String EXCEL_XLS = "xls";  
    private static final String EXCEL_XLSX = "xlsx";  

	public String uploadFile(HttpServletRequest request,HttpServletResponse response) {
		 try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	        Map<String, Object> json = new HashMap<String, Object>();
	        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
	        
	        /** 页面控件的文件流* */
	        MultipartFile multipartFile = null;
	        Map map =multipartRequest.getFileMap();
	         for (Iterator i = map.keySet().iterator(); i.hasNext();) {
	                Object obj = i.next();
	                multipartFile=(MultipartFile) map.get(obj);

	               }
	        /** 获取文件的后缀* */
	        String filename = multipartFile.getOriginalFilename();
	        System.out.println(filename);
	        InputStream inputStream;
	        String path = "";
	        String newVersionName = "";
	        String fileMd5 = "";
	        try {

	            inputStream = multipartFile.getInputStream();
//	            File tmpFile = File.createTempFile(filename,
//	                    filename.substring(filename.lastIndexOf(".")));
//	      
//	            FileInputStream in = new FileInputStream(tmpFile); // 文件流  
	           // checkExcelVaild(filename);  
	            Workbook workbook = getWorkbok(inputStream,filename);  
	            //Workbook workbook = WorkbookFactory.create(is); // 这种方式 Excel2003/2007/2010都是可以处理的  
	  
	            int sheetCount = workbook.getNumberOfSheets(); // Sheet的数量  
	            /** 
	             * 设置当前excel中sheet的下标：0开始 
	             */  
//	            Sheet sheet = workbook.getSheetAt(0);   // 遍历第一个Sheet  
	            Sheet sheet = workbook.getSheetAt(0);   // 遍历第三个Sheet  
	            
	            //获取总行数
//	          System.out.println(sheet.getLastRowNum());
	            
	            // 为跳过第一行目录设置count  
	            int count = 0;
	            for (Row row : sheet) {
	            	
	            		// 跳过第一和第二行的目录  
	                    if(count < 1 ) {
	                        count++;  
	                        continue;  
	                    }
	                    
	                    //如果当前行没有数据，跳出循环  
	                    if(row.getCell(0).toString().equals("")){  
	                    	return fileMd5;
	                    }
	                    
	                    //获取总列数(空格的不计算)
	                    int columnTotalNum = row.getPhysicalNumberOfCells();
	                    System.out.println("总列数：" + columnTotalNum);
	                    
	                    System.out.println("最大列数：" + row.getLastCellNum());
	                    
	                    //for循环的，不扫描空格的列
//	                    for (Cell cell : row) { 
//	                    	System.out.println(cell);
//	                    }
	                    int end = row.getLastCellNum();
	                    for (int i = 0; i < end; i++) {
	                    	Cell cell = row.getCell(i);
	                    	if(cell == null) {
	                    		System.out.print("null" + "\t");
	                    		continue;
	                    	}
	                    	
	                    	Object obj = getValue(cell);
	                    	System.out.print(obj + "\t");
						}
					

	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			return null;
	}
	
	
	

	 public static Workbook getWorkbok(InputStream in,String filename) throws IOException{  
	        Workbook wb = null;  
	        if(filename.endsWith(EXCEL_XLS)){  //Excel 2003  
	            wb = new HSSFWorkbook(in);  
	        }else if(filename.endsWith(EXCEL_XLSX)){  // Excel 2007/2010  
	            wb = new XSSFWorkbook(in);  
	        }  
	        return wb;  
	 }
	        private static Object getValue(Cell cell) {
	        	Object obj = null;
	        	switch (cell.getCellTypeEnum()) {
	    	        case BOOLEAN:
	    	            obj = cell.getBooleanCellValue(); 
	    	            break;
	    	        case ERROR:
	    	            obj = cell.getErrorCellValue(); 
	    	            break;
	    	        case NUMERIC:
	    	            obj = cell.getNumericCellValue(); 
	    	            break;
	    	        case STRING:
	    	            obj = cell.getStringCellValue(); 
	    	            break;
	    	        default:
	    	            break;
	        	}
	        	return obj;
	        }

	
	 }

