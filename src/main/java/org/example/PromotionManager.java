package org.example;

public class PromotionManager implements PromotionService{

    public void add(Promotions promotions){
        System.out.println(promotions.getPromotionDescription() + " Added");
    }

    public void delete(Promotions promotions){
        System.out.println(promotions.getPromotionDescription() + " Deleted");
    }

    @Override
    public void update(Promotions promotions) {
        System.out.println(promotions.getPromotionDescription() + " Updated");
    }
}
