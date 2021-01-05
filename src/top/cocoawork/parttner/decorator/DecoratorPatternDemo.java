package top.cocoawork.parttner.decorator;


import top.cocoawork.parttner.decorator.unit.Drink;
import top.cocoawork.parttner.decorator.unit.MilkSeasoning;
import top.cocoawork.parttner.decorator.unit.ShortBlackCoffee;
import top.cocoawork.parttner.decorator.unit.SoySeasoning;

//装饰器模式
/**
 * 星巴克咖啡订单项目
 * 星巴克咖啡订单项目(咖啡馆) :
 * 1)咖啡种类/单品咖啡: Espresso(意大利浓咖啡)、 ShortBlack,LongBlack(美式咖啡)、Decaf(无因咖啡)
 * 2)调料: Milk. Soy(豆浆)、Chocolate
 * 3)要求在扩展新的咖啡种类时,具有良好的扩展性、改动方便、维护方便
 * 4)使用OO的来计算不同种类咖啡的费用:客户可以点单品咖啡,也可以单品咖啡+调料组合。
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Drink coffee = new ShortBlackCoffee();
        System.out.println(coffee.getCost());

        coffee = new MilkSeasoning(coffee);
        System.out.println(coffee.getCost());

        coffee = new SoySeasoning(coffee);
        System.out.println(coffee.getCost());


    }
}
