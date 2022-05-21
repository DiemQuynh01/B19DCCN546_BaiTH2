package com.example.demo.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @OneToMany
//    @JoinColumn(name = "lineItem")
//    private ArrayList<LineItem> items;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Cart() {
//        items = new ArrayList<LineItem>();
//    }
//
//    public ArrayList<LineItem> getItems() {
//        return items;
//    }
//
//    public int getCount() {
//        return items.size();
//    }
//
//    public void addItem(LineItem item) {
//        String code = item.getProduct().getCode();
//        int quantity = item.getQuantity();
//        for (int i = 0; i < items.size(); i++) {
//            LineItem lineItem = items.get(i);
//            if (lineItem.getProduct().getCode().equals(code)) {
//                lineItem.setQuantity(quantity);
//                return;
//            }
//        }
//        items.add(item);
//    }
//
//    public void removeItem(LineItem item) {
//        String code = item.getProduct().getCode();
//        for (int i = 0; i < items.size(); i++) {
//            LineItem lineItem = items.get(i);
//            if (lineItem.getProduct().getCode().equals(code)) {
//                items.remove(i);
//                return;
//            }
//        }
//    }
//    public Double totalAmount() {
//        Double totalAmount = 0.0;
//        for (int i = 0; i < items.size(); i++) {
//            LineItem lineItem = items.get(i);
//            totalAmount += lineItem.getTotal();
//        }
//        return totalAmount;
//    }
//
//    public String getTotalAmountCurrencyFormat() {
//        NumberFormat currency
//                = NumberFormat.getCurrencyInstance();
//        return currency.format(totalAmount());
//    }

}
