package com;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class mainClass {
    public static void main(String[] args) {
        try {
            // Here we create a document object and use JSoup to fetch the website
            Document doc = Jsoup.connect("https://www.wedmegood.com/vendors/all/wedding-photographers/").get();
            System.out.printf("Title: %s\n", doc.title());


            Elements name = doc.getElementsByClass("vendor-detail text-bold h6");

            System.out.printf("Name of the product %s\n", name.get(0).text());

            Elements vendor = doc.getElementsByClass("vendor-detail text-bold h6");
            System.out.printf("Vendor %s\n", vendor.get(0).text());


            Elements rating = doc.getElementsByClass("StarRating center rating-5 regular");
            System.out.printf("Rating %s\n", rating.get(0).text());

            Elements price = doc.getElementsByClass("vendor-detail text-bold text-primary v-center margin-r-5");
            System.out.printf("Price %s\n", price.get(0).text());



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}