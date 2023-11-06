/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author sijoy
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    private ImageIcon productImage;
    private ArrayList<Feature> features;
    private static int count = 0;

    public ImageIcon getProductImage() {
        return productImage;
    }

    public void setProductImage(ImageIcon productImage) {
        this.productImage = productImage;
    }
    
    
    
    public Product() {
        count++;
        id = count;
        
        features = new ArrayList<Feature>();
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    @Override
    public String toString() {
        return name;
    }
    
    public Feature addNewFeature() {
        Feature newFeature = new Feature(this, "", null); // Assuming there's a default constructor for Feature
        features.add(newFeature);
        return newFeature;
    }
}
