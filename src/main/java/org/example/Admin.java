package org.example;

public class Admin  implements iAdmin {
    private int id;
    private String name;

    public Admin(String name) {
        this.id= (int) ((Math.random()*1000));
        this.name = name;
    }
    public Admin(String name,int id) {
        this.id= id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String addProduct(Product product) {
        return Shop.getInstance().addProduct(product,id);

    }

    @Override
    public String removeProduct(Product product) {
        return  Shop.getInstance().removeProduct(product,id);


    }

    @Override
    public String modifyProduct(Product product) {
        return Shop.getInstance().modifyProduct(product,id);


    }

    @Override
    public String makeShipments() {
        return   Shop.getInstance().makeShipments(id);


    }

    @Override
    public String confirmDelivery() {
        return  Shop.getInstance().confirmDelivery(id);

    }
}
