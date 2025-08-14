package kr.co.hanbit.product.management.presentation;

import jakarta.validation.constraints.NotNull;
import kr.co.hanbit.product.management.domain.Product;

public class ProductDto {
    private Long id;
    private String name;
    private Integer price;
    private Integer amount;

    public ProductDto() {}

    public ProductDto(String name, Integer price, Integer amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public ProductDto(Long id, String name, Integer price, Integer amount){
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public static Product toEntity(ProductDto productDto){
        Product product = new Product(
                productDto.getId(),
                productDto.getName(),
                productDto.getPrice(),
                productDto.getAmount()
        );

        return product;
    }

    public static ProductDto toDto(Product product){
        ProductDto productDto = new ProductDto(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getAmount()
        );

        productDto.setId(product.getId());

        return productDto;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    @NotNull
    public String getName() {
        return name;
    }

    @NotNull
    public Integer getPrice() {
        return price;
    }

    @NotNull
    public Integer getAmount() {
        return amount;
    }
}
