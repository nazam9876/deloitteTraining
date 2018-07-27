package com.del;

public class UserMainCode {
	static boolean checkTripplet(int arr1[]) {
	int i,j,k;
	int count = 0;	
	for(i=0;i<(arr1.length-2);i++) {
		for(j=1;j<(arr1.length-1);j++) {
		if(arr1[i]==arr1[j])
			{
			for(k=2;k<(arr1.length);k++) {
			if(arr1[j]==arr1[k])
			return true;}
			}
			
	else {
	return false;
	}}}
	

	}}
