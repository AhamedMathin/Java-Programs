package com.xworkz.app.inheritance.util;

import com.xworkz.app.inheritance.Brand;
import com.xworkz.app.inheritance.InternationalBrand;
import com.xworkz.app.inheritance.LocalBrand;
import com.xworkz.app.inheritance.NationalBrand;

public class BrandUtil {

	public static void run(Brand brand) {
		System.out.println(brand.name);
		brand.type();
		if (brand instanceof LocalBrand) {

			System.out.println("Brand is Local");
			LocalBrand localBrand = (LocalBrand) brand;// casting

			System.out.println(localBrand.location);
			localBrand.color();

		}

		if (brand instanceof NationalBrand) {
			System.out.println("brand is national");
			NationalBrand nationalBrand = (NationalBrand) brand;

			System.out.println(nationalBrand.pinCode);
			nationalBrand.material();
		}
		if (brand instanceof InternationalBrand) {
			System.out.println("brand is International");
			InternationalBrand internationalBrand = (InternationalBrand) brand;

			System.out.println(internationalBrand.since);
			internationalBrand.Uniqueness();

		}
	}
}
