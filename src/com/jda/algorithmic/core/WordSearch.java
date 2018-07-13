package com.jda.algorithmic.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.jda.algorithmic.util.CScanner;


public class WordSearch {
	
	public static void main(String[] args) throws Exception 
	{
		  // We need to provide file path as the parameter:
		  // double backquote is to avoid compiler interpret words
		  // like \test as \t (ie. as a escape sequence)
		System.out.println("Please give the correct path of the text file:");
		String fileName= CScanner.getString();
		  File file = new File(fileName);
		  BufferedReader br = new BufferedReader(new FileReader(file));
		  String st;
		  String[] tmpstr;
		  List<String> str= new ArrayList<>();
		  while ((st = br.readLine()) != null)
		  {
			  tmpstr=st.split(",");
			  for(int i=0;i<tmpstr.length;i++)
			  str.add(tmpstr[i]);
		  }
		  str=CScanner.bubbleSortForString(str, str.size());
		  System.out.println("Enter key string for searching");
		  String key=CScanner.getString();
           if(CScanner.binarySearchForString(str, key, str.size()))
        	   System.out.println("String Found");
           else
        	   System.out.println("Not found");
	}

}
