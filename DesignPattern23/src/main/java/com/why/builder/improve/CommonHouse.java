package com.why.builder.improve;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子-打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子-砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子-盖房顶 ");
    }
}
