package com.jda.algorithmic.core;

import java.util.ArrayList;
import java.util.List;

import com.jda.algorithmic.util.CScanner;


public class SearchSort {
	
	
    public static void main(String[] arg)
    {
  	  System.out.println("Enter the size of the array");
  	  int lenOfArray= CScanner.getint();
  	  List<Integer> arr =new ArrayList<>();
  	  System.out.println("Enter the "+ lenOfArray +" element into the array");
  	  for(int i=0;i<lenOfArray;i++)
  	  {
  		  arr.add(CScanner.getint());
  	  }
  	  System.out.println("Sorted data using bubble sort:");
  	  List<Integer> list=CScanner.bubbleSortForInteger(arr, arr.size());
  	  System.out.println(list);
  	  System.out.println("Sorted data using insertion sort:");
  	   arr=CScanner.insertionSortForInterger(arr, arr.size());
  	  System.out.println(arr);
  	  System.out.println("Enter the serching element");
  	  int key=CScanner.getint();
  	  if(CScanner.binarySearchForInteger(arr, key, arr.size()))
  		  System.out.println("Number found");
  	  else
  		  System.out.println("Number not Found");
  	  
    }

}
