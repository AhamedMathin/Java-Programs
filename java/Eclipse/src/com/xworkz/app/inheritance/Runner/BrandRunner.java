package com.xworkz.app.inheritance.Runner;

import com.xworkz.app.inheritance.Brand;
import com.xworkz.app.inheritance.InternationalBrand;
import com.xworkz.app.inheritance.LocalBrand;
import com.xworkz.app.inheritance.NationalBrand;
import com.xworkz.app.inheritance.util.BrandUtil;

public class BrandRunner {

	public static void main(String[] args) {
		
	
			System.out.println("invoking main of BrandRunner");
			Brand brand =new Brand();
			BrandUtil.run(brand);
	       
	        Brand brand2=new LocalBrand();
	        LocalBrand localBrand=(LocalBrand) brand2;
	        BrandUtil.run(localBrand);
			
	        Brand brand3=new NationalBrand();
	        NationalBrand nationalBrand=(NationalBrand) brand3;
	        BrandUtil.run(nationalBrand);
	        
	        Brand brand4=new InternationalBrand();
	        InternationalBrand internationalBrand=(InternationalBrand) brand4;
	        BrandUtil.run(internationalBrand);
		}
	

}
