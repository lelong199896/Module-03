package com.example.productmanagement.View;

import com.example.productmanagement.Model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServicelmpl implements ProductService{
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Quần", 1000, "Xanh"));
        products.put(2, new Product(2, "Áo", 3000, "Đỏ"));
        products.put(3, new Product(3, "Mũ", 5000, "Tím"));
        products.put(4, new Product(4, "Balo", 2000, "Vàng"));
        products.put(5, new Product(5, "Giày", 4000, "Nâu"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
