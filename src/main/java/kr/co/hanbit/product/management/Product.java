package kr.co.hanbit.product.management;

public class Product {
    private Long id;
    private String name;
    private Integer price;
    private Integer amount;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getAmount() {
        return amount;
    }
}
