/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Rushabh
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    private ImageIcon logoImage;
    private ArrayList<Feature> features;

    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        features = new ArrayList<Feature>();
        addStaticFeatures();

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
    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }
    
      private void addStaticFeatures() {
        addStaticFeature("Size", "");
        addStaticFeature("Reviews", "");
        addStaticFeature("Availability", "");
    }
      
    private void addStaticFeature(String name, String value) {
    Feature staticFeature = new Feature(this);
    staticFeature.setName(name);
    staticFeature.setValue(value);
    features.add(staticFeature);
}
    
    public Feature addNewFeature() {
        Feature f = new Feature(this);
        features.add(f);

        return f;

    }

    public ArrayList<Feature> getFeature() {

        return features;
    }

    
    @Override
    public String toString() {
        return name;
    }

//    public Iterable<Feature> getFeatures() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    
}
